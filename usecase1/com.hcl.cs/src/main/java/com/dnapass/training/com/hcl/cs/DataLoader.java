package com.dnapass.training.com.hcl.cs;

import java.util.ArrayList;
import java.util.List;

import com.dnapass.training.com.hcl.cs.entity.PetEntity;
import com.dnapass.training.com.hcl.cs.entity.UserEntity;

public class DataLoader {

	public static List<UserEntity> newUsers() {

		List<UserEntity> users = new ArrayList<>();
		users.add(new UserEntity(125L, "user1", "user1223"));
		users.add(new UserEntity(126L, "user2", "user1224"));
		users.add(new UserEntity(127L, "user3", "user1225"));
		users.add(new UserEntity(128L, "user4", "user1226"));
		users.add(new UserEntity(129L, "user5", "user1227"));
		return users;
	}
	
	public static List<PetEntity> newPets() {

		List<PetEntity> pets = new ArrayList<>();
		pets.add(new PetEntity(1L, "pet1",3,  "place1", null));
		pets.add(new PetEntity(2L, "pet2",2,  "place2", null));
		pets.add(new PetEntity(3L, "pet3",3,  "place3", null));
		pets.add(new PetEntity(4L, "pet4",1,  "place4", null));
		pets.add(new PetEntity(5L, "pet5",3,  "place5", null));
		return pets;
	}
	
	/*
	public static List<UserEntity> newUsers() {

		List<UserEntity> users = new ArrayList<>();

		UserEntity user = new UserEntity(null, "user1", "1234");
		user.getPet().addAll(newPets1(user));
		users.add(user);

		UserEntity user2 = new UserEntity(null, "user12", "1235");
		user2.getPet().addAll(newPets2(user2));
		users.add(user2);

		UserEntity user3 = new UserEntity(null, "user3", "1236");
		user3.getPet().addAll(newPets3(user3));
		users.add(user3);

		return users;
	}

	public static List<PetEntity> newPets1(UserEntity user) {

		List<PetEntity> pets = new ArrayList<>();
		pets.add(new PetEntity(null, "Cat", 3, "CH", user));
		pets.add(new PetEntity(null, "Parrot", 2, "CH", user));
		pets.add(new PetEntity(null, "Dog", 1, "CH", user));
		return pets;

	}

	public static List<PetEntity> newPets2(UserEntity user) {

		List<PetEntity> pets = new ArrayList<>();
		pets.add(new PetEntity(null, "Cat", 3, "CH", user));

		return pets;

	}

	public static List<PetEntity> newPets3(UserEntity user) {

		List<PetEntity> pets = new ArrayList<>();
		pets.add(new PetEntity(null, "Parrot", 5, "CH", user));
		pets.add(new PetEntity(null, "Dog", 3, "CH", user));
		return pets;

	}
	*/

}
