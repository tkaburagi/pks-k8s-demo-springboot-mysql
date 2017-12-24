package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo repo;
	
	@RequestMapping("/books")
	public List<Book> showAllBooks() {
		return repo.findAll();
	}

}
