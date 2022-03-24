package com.dnapass.training.com.hcl.cs.service;

import com.dnapass.training.com.hcl.cs.entity.UserEntity;

public interface IUserService {

	UserEntity saveUser(Long userId, UserEntity userEntity);

}
