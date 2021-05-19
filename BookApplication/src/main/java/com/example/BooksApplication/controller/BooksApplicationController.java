package com.example.BooksApplication.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BooksApplication.model.Book;
import com.example.BooksApplication.service.impl.BooksApplicationService;

@RestController
@RequestMapping(value="/book")
public class BooksApplicationController {
	
	@Autowired
	BooksApplicationService booksApplicationService;
	
	@GetMapping(value = "/test")
	public String getTest(){
		return "Test";
	}
	
	@GetMapping(value = "/details")
	public Set<Book> getDetails(){
		return booksApplicationService.getBookList();
	}
	
	@GetMapping(value = "/search/{search_key}")
	public Set<Book> searchBook( @PathVariable String search_key){
		return booksApplicationService.searchbook(search_key);
	}
	
	@GetMapping(value = "/delete/{ISBN}")
	public String deleteBook(@PathVariable String ISBN){
		return booksApplicationService.deleteBook(ISBN);
	}
	
	@PostMapping(value = "/create")
	public String createBook(@RequestBody Book book) {
		return booksApplicationService.addbook(book);
	}
	
	@PostMapping(value = "/update")
	public String updateBook(@RequestBody Book book) {
		return booksApplicationService.updateBookDetails(book);
	}
	

}
