package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Book;
import com.example.demo.service.book_service;

@RestController
public class book_controller {

	@Autowired
	book_service bookservice;
	@PostMapping("/createbook")
	public Book createBook(@RequestBody Book book) {
		Book b1=bookservice.createBook(book);
		return b1;
	}
	
	@GetMapping("/getAllbook")
	public Iterable<Book> getAllBooks() {
	Iterable<Book>	b1=bookservice.getAllBooks();
	System.out.println("book details"+b1);
	return b1;
	}
	
	@DeleteMapping("/deletebook/{id}")
	public Optional<Book> deletebook(@PathVariable("id") int id) {
	Optional<Book> b1=bookservice.deletebook(id);
	return b1;
	}
}
