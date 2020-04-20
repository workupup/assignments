package com.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.model.Blog;

@Service("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	public List<Blog> findAll() {
		
		List<Blog> blogs = new ArrayList<Blog>();
		
		Blog b1 = new Blog();
		b1.setTitle("Java");
		Blog b2 = new Blog();
		b2.setTitle("JQuery");
		blogs.add(b1);
		blogs.add(b2);
		return blogs;
		
	}
	
}
