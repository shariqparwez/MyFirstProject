package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	@Value("Java")
	private String bookName;
	@Value("Shariq")
	private String authorName;
	@Value("2356")
	private long isbn;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, String authorName, long isbn) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", isbn=" + isbn + "]";
	}
	
	
}
