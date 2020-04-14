package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.customer.Customer;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.customer","com.example.techno"})
public class DemoDepInjectionConceptApril14Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DemoDepInjectionConceptApril14Application.class, args);
		Customer object1=context.getBean(Customer.class);
		object1.display();
		
	}

}
