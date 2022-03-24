package com.dnapass.training.com.hcl.cs.service;

import java.util.List;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;

public interface IPetService {

	List<PetEntity> getAllPets();
	
	PetEntity getMyPets(Long petId);

	PetEntity savePet(Long petId, PetEntity petEntity);

	//PetEntity buyPets(Long petId, String name);
	
	//PetEntity save(PetEntity pet);

}
