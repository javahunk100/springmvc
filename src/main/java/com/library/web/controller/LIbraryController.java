package com.library.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbcp2.Utils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import com.biz.service.IBizService;
import com.library.web.controller.model.BookForm;


//Here we are creating a bean which is acting as a controller here!
@Controller
public class LIbraryController {
	
	@Autowired
	@Qualifier("BizService")
	private IBizService bizService;
	
	public LIbraryController(){
		System.out.println("))#(((((((((((LIbraryController(((((((((((");
	}

	@GetMapping("books")
	public String showBooks(Model model) {
		List<BookForm>  bookForms=bizService.findAllBooks();
		model.addAttribute("bookForms", bookForms);
		return "books"; //  ->>>> /mock.jsp
	}
	
	@GetMapping("find-book-image")
	public String findBookImage(@RequestParam("bid") int bid,HttpServletResponse response,HttpSession session) throws IOException {
		response.setContentType("application/png");
		byte[] photo=bizService.findBookPhtotByBid(bid);
		if(photo==null || photo.length<10){
				ServletContext servletContext=session.getServletContext();
				//Reading file from web project
				InputStream inputStream=servletContext.getResourceAsStream("/img/book.png");
				photo=IOUtils.toByteArray(inputStream);
		}
		ServletOutputStream outputStream=response.getOutputStream();
		outputStream.write(photo);
		outputStream.flush();
		outputStream.close();
		return "redirect:/books"; //  ->>>> /mock.jsp
	}


	@PostMapping("deleteBook")
	public String deleteBook(@RequestParam("bid") int bid,Model model) {
		bizService.deleteBookByBid(bid);
		return "redirect:/books"; //  ->>>> /mock.jsp
	}
	
	@PostMapping("editBook")
	public String editBook(@RequestParam("bid") int bid,Model model) {
		BookForm bookForm=bizService.findBookByBid(bid);
		model.addAttribute("bookForm",bookForm);
		model.addAttribute("ButtonLable", "Update");
		return "addBook";
	}

	@GetMapping("addBook")
	public String addBook(Model model) {
		BookForm bookForm=new BookForm();
		model.addAttribute("bookForm",bookForm);
		model.addAttribute("ButtonLable", "Add Book");
		return "addBook"; //  ->>>> /mock.jsp
	}
	
	@PostMapping("addUpdateBook")
	public String addBookSubmit(@ModelAttribute BookForm book,Model model) {
		String message="";
		if(book.getBid()==0){
			bizService.addBook(book);
			message="Book has been uploaded successfully..............";
		}else{
			bizService.updateBook(book);
			message="Book has been updated successfully..............";
		}
		//System.out.println(book);
		return "redirect:/books?message="+message; //  ->>>> /mock.jsp
	}
	
	
	//String sname=request.getParameter("sname")
	/**
	 * 
	 * @param sname - which is coming from html pages
	 * @param model  this used to carry the data from the controller to the JSP 
	 * @return
	 */
	@GetMapping("math/reverse")
	public String reveseString(@RequestParam("sname") String sname,Model model) {
		StringBuilder builder=new StringBuilder(sname);
		String result=builder.reverse().toString();
		model.addAttribute("sresult", result);
		return "mock"; //  ->>>> /mock.jsp
	}
	
	//It converts your upload file into byte array form after it
	//it is populated in customer java object
	 
	@InitBinder
	 public void initBinder(WebDataBinder binder) {
	                   // to actually be able to convert Multipart instance to byte[]
	                   // we have to register a custom editor
	                   binder.registerCustomEditor(byte[].class,
	                                      new ByteArrayMultipartFileEditor());
	                   // now Spring knows how to handle multipart object and convert them
   }

	@ModelAttribute("publications")
	public List<String> loadPublications() {
		List<String> publications=bizService.findPublications();
		return publications;
	}
	

}
