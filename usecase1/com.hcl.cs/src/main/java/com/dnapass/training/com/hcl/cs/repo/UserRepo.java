package com.dnapass.training.com.hcl.cs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.com.hcl.cs.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long>{

}