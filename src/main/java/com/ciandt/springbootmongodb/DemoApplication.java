package com.ciandt.springbootmongodb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class DemoApplication {
//Teste

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

}}
