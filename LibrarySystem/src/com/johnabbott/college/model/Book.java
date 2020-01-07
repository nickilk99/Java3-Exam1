package com.johnabbott.college.model;

public class Book {
	private String title;
	private String type;
	
	public Book(String title, String type) {
		super();
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
