package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class MyFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(MyFirstProjectApplication.class, args);
		
		Book book = ctx.getBean(Book.class);
		Customer customer =ctx.getBean(Customer.class);
		customer.setBook(book);
		System.out.println(customer.toString());
	}
}
