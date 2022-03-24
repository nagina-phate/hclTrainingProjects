package com.dnapass.training.com.hcl.cs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;
import com.dnapass.training.com.hcl.cs.repo.PetRepo;

@Service
public class PetServiceImpl implements IPetService{
	PetRepo petRepo;
	
	public PetServiceImpl(PetRepo petRepo) {
		this.petRepo = petRepo;
	}
	
	@Override
	public List<PetEntity> getAllPets(){
		List<PetEntity> petList = new ArrayList<>();
		petRepo.findAll().forEach(petList::add);
		System.out.println(petList);
		return petList;
	}
	
	@Override
	public PetEntity getMyPets(Long petId) {
		return petRepo.findById(petId).get();
	}
	
	@Override
	public PetEntity savePet(Long petId, PetEntity petEntity) {
		return petRepo.save(petEntity);
	}

	//@Override
	//public PetEntity buyPets(Long petId, String name) {
	//	return petRepo.findPetByIdNameAndAge(petId, name).get();
	//}
	
}
