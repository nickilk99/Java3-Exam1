package com.johnabbott.college.service;

import java.util.List;

import com.johnabbott.college.model.Book;

public interface BookService {
	
	public List<Book> getCompBooks();
	
	public List<Book> getNovels();

}
