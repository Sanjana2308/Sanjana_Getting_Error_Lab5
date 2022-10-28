package com.greatlearning.library.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.greatlearning.library.entity.Book;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

@Repository
public class BookServiceImpl implements BookService {
	
//	//To create a single session for each or every request 
//		private Session session;
//		
//	
//		BookServiceImpl (SessionFactory sessionFactory){
//			session = sessionFactory.
//		}
//	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
