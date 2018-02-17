package com.library.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	
	@GetMapping("addBook")
	public String addBook(Model model) {
		return "addBook"; //  ->>>> /mock.jsp
	}
	
	@PostMapping("addBook")
	public String addBookSubmit(@ModelAttribute BookForm book,Model model) {
		System.out.println(book);
		bizService.addBook(book);
		model.addAttribute("ApplicationMessage", "Book has been uploaded successfully..............");
		return "addBook"; //  ->>>> /mock.jsp
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
	

}
