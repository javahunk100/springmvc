package com.library.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Here we are creating a bean which is acting as a controller here!
@Controller
public class LIbraryController {
	
	public LIbraryController(){
		System.out.println("))#(((((((((((LIbraryController(((((((((((");
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
