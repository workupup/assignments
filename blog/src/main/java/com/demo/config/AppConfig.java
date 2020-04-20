package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.repository.CustomerRepository;
import com.demo.repository.HibernateCustomerRepositoryImpl;
import com.demo.service.CustomerService;
import com.demo.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.demo"})
public class AppConfig {
	
	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/
	
	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
		//customerService.setCustomerRepository(getCustomerRepository());
		
		return customerService;
		
	}*/

}
