package com.demo.repository;

import java.util.List;

import com.demo.model.Blog;

public interface CustomerRepository {
	
	List<Blog> findAll();

}
