package com.dnapass.training.com.hcl.cs.service;

import org.springframework.stereotype.Service;

import com.dnapass.training.com.hcl.cs.entity.UserEntity;
import com.dnapass.training.com.hcl.cs.repo.UserRepo;

@Service
public class UserServiceImpl implements IUserService{
	UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}
	
	@Override
	public UserEntity saveUser(Long userId, UserEntity userEntity) {
		System.out.println(userRepo.save(userEntity));
		return userRepo.save(userEntity);
	}
	
}
