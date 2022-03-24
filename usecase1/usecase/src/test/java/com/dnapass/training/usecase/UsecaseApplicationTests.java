package com.dnapass.training.usecase;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.dnapass.training.usecase.model.PetEntity;
import com.dnapass.training.usecase.model.UserEntity;
import com.dnapass.training.usecase.repo.PetRepo;
import com.dnapass.training.usecase.repo.UserRepo;

@SpringBootTest
class UsecaseApplicationTests {

	@Autowired
	private PetRepo petRepo;
	//private UserRepo userRepo;
	
	@Autowired
	private UserRepo userRepo;

	@Test
	public void contextLoads() throws Exception {
		assertThat(petRepo).isNotNull();
		
	}
	
	@Test
	public void contextLoads1() throws Exception {
		assertThat(userRepo).isNotNull();
	}
	
	@Test
	@Rollback(false)
	public void testCreatePet() {
	    PetEntity savedProduct = petRepo.save(new PetEntity(101, "dog", 10, "place1",null));
	     
	    assertThat(savedProduct.getPetId()).isGreaterThan(0);
	}
	
	@Test
	@Rollback(false)
	public void testCreateUser() {
	    UserEntity savedProduct = userRepo.save(new UserEntity(null, "user4", "user@1231",null));
	     
	    assertThat(savedProduct.getUserId());
	}
}
