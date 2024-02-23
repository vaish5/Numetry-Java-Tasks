package com.springdatajpaexample.springdatajpademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaDemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Customer("Nidhi", "Sharma"));
			repository.save(new Customer("Sneha", "Singh"));
			repository.save(new Customer("Shyam", "Sharma"));
			repository.save(new Customer("David", "Warner"));
			repository.save(new Customer("Radha", "Rao"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(customer -> {
				log.info(customer.toString());
			});
			log.info("");

			// fetch an individual customer by ID
			Customer customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Sharma'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Sharma").forEach(sharma -> {
				log.info(sharma.toString());
			});
			log.info("");
		};
	}

}
