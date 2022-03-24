package com.dnapass.training.usecase.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.usecase.model.Pet;
import com.dnapass.training.usecase.model.PetEntity;

@Repository
public interface PetRepo extends JpaRepository<PetEntity, Long>{



}