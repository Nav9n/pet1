package com.simplilearn.petadoption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.simplilearn.petadoption.controllers" + "com.simplilearn.petadoption.dto" + "com.simplilearn.petadoption.Models" + "com.simplilearn.petadoption.repositories" + "com.simplilearn.petadoption.services")
public class PetadoptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetadoptionApplication.class, args);
	}

}
