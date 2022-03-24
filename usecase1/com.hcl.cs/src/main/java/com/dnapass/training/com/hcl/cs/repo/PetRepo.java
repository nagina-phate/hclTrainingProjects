package com.dnapass.training.com.hcl.cs.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;


@Repository
public interface PetRepo extends JpaRepository<PetEntity, Long>{

	//Optional<PetEntity> findPetByIdNameAndAge(Long petId, String name);

}