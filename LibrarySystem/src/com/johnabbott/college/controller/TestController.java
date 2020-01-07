package com.johnabbott.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.college.model.Book;
import com.johnabbott.college.service.BookService;



@Controller
public class TestController {
	
	@Autowired
	BookService service;
	//CarNameServiceImpl service;
		
	@RequestMapping("/novels")
	public ModelAndView getNovels() {
		ModelAndView mv = new ModelAndView("output");
		
		List<Book> books = service.getNovels();
		mv.addObject("bookList", books);
		
		return mv;
	}
	
	
	
	@RequestMapping("/compbooks")
	public ModelAndView getCompBooks() {
		ModelAndView mv = new ModelAndView("output");
		
		List<Book> books = service.getCompBooks();
		mv.addObject("bookList", books);
		
		return mv;
	}

}
