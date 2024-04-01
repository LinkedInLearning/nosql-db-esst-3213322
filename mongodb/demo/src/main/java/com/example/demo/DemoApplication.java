package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	private final SalesRepository salesRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		salesRepository.findAll().forEach(System.out::println);
	}

}
