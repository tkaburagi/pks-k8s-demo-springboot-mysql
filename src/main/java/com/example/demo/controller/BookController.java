package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo repo;
	
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping("/books")
	public List<Book> showAllBooks() {
		logger.info("Called showAllBooks.");
		return repo.findAll();
	}

}
