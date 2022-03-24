package com.dnapass.training.com.hcl.cs.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;
import com.dnapass.training.com.hcl.cs.entity.UserEntity;
import com.dnapass.training.com.hcl.cs.service.IPetService;
import com.dnapass.training.com.hcl.cs.service.IUserService;

@RestController
@RequestMapping("/api/v1/pet")
public class MainController {

	IPetService iPetService;
	IUserService iUserService;
	
	public MainController(IPetService iPetService) {
		this.iPetService = iPetService;
	}
	
	@GetMapping
	public ResponseEntity<List<PetEntity>> getAllPets(){
		List<PetEntity> pets = iPetService.getAllPets();
		return new ResponseEntity<>(pets, HttpStatus.OK);
	}
	
	@GetMapping({"/{petId}"})
	public ResponseEntity<PetEntity> getMyPets(@PathVariable Long petId){
		return new ResponseEntity<>(iPetService.getMyPets(petId), HttpStatus.OK);
	}
	
	@PutMapping({"/id/{petId}"})
	public ResponseEntity<PetEntity> savePet(@PathVariable("petId") Long petId, @RequestBody PetEntity petEntity){
		iPetService.savePet(petId, petEntity);
		return new ResponseEntity<>(iPetService.savePet(petId, petEntity), HttpStatus.OK);
	}
	
}

