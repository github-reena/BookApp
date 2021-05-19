package com.example.BooksApplication.service.impl;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.BooksApplication.model.Book;
import com.example.bookApplication.service.IBooksApplicationService;

public class BooksApplicationService implements IBooksApplicationService {

	Set<Book> booklist = new HashSet<>();
	
	@Override
	public Set<Book> getBookList() {
		return booklist;
	}

	@Override
	public String updateBookDetails(Book book) {
		for(Book book1 : booklist)
			if(book1.getIsbn().equalsIgnoreCase(book.getIsbn())){
				booklist.remove(book1);
			}
		booklist.add(book);
		return "Book updated successfully " + book.getIsbn() ;
	}

	@Override
	public String deleteBook(String ISBN) {
		String deleteMess = null;
		for(Book book : booklist){
			if(book.getIsbn() != null && book.getIsbn().equalsIgnoreCase(ISBN)){
				booklist.remove(book);
				deleteMess= "Book Deleted successfully " + ISBN;
			}else{
				deleteMess = "Book not present with this ISBN  " + ISBN ;
			}
		}
		return deleteMess;
		
	}

	@Override
	public String addbook(Book book) {
		booklist.add(book);
		return "Book Added successfully " + book.getIsbn() ;
	}

	
	public Set<Book> searchbook(String search_key){
		Set<Book> result = booklist.stream()
			    .filter(a -> Objects.equals(a.getAuthors(), search_key) || Objects.equals(a.getTitle(), search_key) || Objects.equals(a.getIsbn(), search_key) )
			    .collect(Collectors.toSet());
		return result;
	}
}
