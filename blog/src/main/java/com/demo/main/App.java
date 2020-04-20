package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		
		customerService.findAll().forEach(e -> System.out.println(e.getTitle()));
		
	}

}
