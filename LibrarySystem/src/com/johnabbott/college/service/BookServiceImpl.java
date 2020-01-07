package com.johnabbott.college.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.johnabbott.college.model.Book;

@Service
public class BookServiceImpl implements BookService{

	@Override
	public List<Book> getCompBooks() {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Title1", "CompBook1"));
		books.add(new Book("Title2", "CompBook2"));
		books.add(new Book("Title3", "CompBook3"));
		books.add(new Book("Title4", "CompBook4"));
		
		return books;
	}

	@Override
	public List<Book> getNovels() {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Title1", "Novel1"));
		books.add(new Book("Title2", "Novel2"));
		books.add(new Book("Title3", "Novel3"));
		books.add(new Book("Title4", "Novel4"));
		
		return books;
	}

}
