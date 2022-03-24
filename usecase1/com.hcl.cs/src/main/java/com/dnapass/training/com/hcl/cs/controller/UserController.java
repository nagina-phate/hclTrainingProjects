package com.dnapass.training.com.hcl.cs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnapass.training.com.hcl.cs.entity.UserEntity;
import com.dnapass.training.com.hcl.cs.service.IUserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	IUserService iUserService;
	
	public UserController(IUserService iUserService) {
		this.iUserService = iUserService;
	}
	
	@PutMapping({"/user/{userId}"})
	public ResponseEntity<UserEntity> saveUser(@PathVariable("userId") Long userId, @RequestBody UserEntity userEntity){
		iUserService.saveUser(userId, userEntity);
		return new ResponseEntity<>(iUserService.saveUser(userId, userEntity), HttpStatus.OK);
	}
	
}

