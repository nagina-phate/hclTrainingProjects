package com.dnapass.training.com.hcl.cs;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;
import com.dnapass.training.com.hcl.cs.entity.UserEntity;
import com.dnapass.training.com.hcl.cs.repo.PetRepo;
import com.dnapass.training.com.hcl.cs.repo.UserRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

	@Bean
	public CommandLineRunner demo(PetRepo repo) {
		return args ->{
			
			List<PetEntity> pet = DataLoader.newPets();
			repo.saveAll(pet);
			
			//System.out.println(repo.saveAll(pet));
			
		};
	}
	
	@Bean
	public CommandLineRunner demo1(UserRepo repo) {
		return args ->{
		
			List<UserEntity> user = DataLoader.newUsers();
			repo.saveAll(user);
			//System.out.println(repo.saveAll(user));
		};
	}

}
