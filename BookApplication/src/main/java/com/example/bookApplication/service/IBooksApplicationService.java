package com.example.bookApplication.service;


import java.util.Set;

import com.example.BooksApplication.model.Book;

public interface IBooksApplicationService {
	
	public Set<Book> getBookList();
	public String updateBookDetails(Book book);
	public String deleteBook(String ISBN);
	public String addbook(Book book);
	

}
