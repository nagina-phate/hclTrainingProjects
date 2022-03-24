package com.dnapass.training.usecase;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dnapass.training.usecase.model.PetEntity;
import com.dnapass.training.usecase.model.UserEntity;
//import com.dnapass.training.usecase.model.UserEntity;
import com.dnapass.training.usecase.repo.PetRepo;
import com.dnapass.training.usecase.repo.UserRepo;
//import com.dnapass.training.usecase.repo.UserRepo;

@SpringBootApplication
public class UsecaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsecaseApplication.class, args);
	}
	

	@Bean
	public CommandLineRunner demo(PetRepo repo) {
		return args ->{
		
			List<PetEntity> pet = DataLoader.newPetEntities();
			repo.saveAll(pet);
		};
	}
	
	@Bean
	public CommandLineRunner demo1(UserRepo repo) {
		return args ->{
		
			List<UserEntity> user = DataLoader.newUserEntities();
			repo.saveAll(user);
		};
	}
	

}
