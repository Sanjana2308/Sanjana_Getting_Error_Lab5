package com.greatlearning.library.service;

import java.util.List;

import com.greatlearning.library.entity.Book;

public interface BookService {
	// We need to code the interface
	// to achieve abstraction
	public List<Book> findAll();
}
