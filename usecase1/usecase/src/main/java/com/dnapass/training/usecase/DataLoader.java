package com.dnapass.training.usecase;

import java.util.ArrayList;
import java.util.List;

import com.dnapass.training.usecase.model.PetEntity;
import com.dnapass.training.usecase.model.UserEntity;

public class DataLoader {
	
	public static List<PetEntity> newPetEntities() {

		List<PetEntity> list = new ArrayList<>();
		
		list.add(new PetEntity(null, "pet1", 10, "place1", null));
		list.add(new PetEntity(null, "pet2", 12,  "place2", null));
		
		return list;
	}
	
	
	public static List<UserEntity> newUserEntities() {

		List<UserEntity> list = new ArrayList<>();
		
		list.add(new UserEntity(null, "user1", "user@123", null));
		list.add(new UserEntity(null, "user2", "user@1231", null));
		
		return list;
	}

}
