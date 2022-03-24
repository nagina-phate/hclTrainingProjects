package com.dnapass.training.usecase.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.usecase.model.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long>{



}