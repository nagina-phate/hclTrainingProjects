package com.dnapass.training.com.hcl.cs.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "pet")
public class PetEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long petId;
	private String petName;
	private Integer petAge;
	private String petPlace;
	
	//@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "pet_owner_id")
	private UserEntity user;
	
	public PetEntity() {
	
	}

	public PetEntity(Long petId, String petName, Integer petAge, String petPlace, UserEntity user) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
		this.user = user;
	}

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Integer getPetAge() {
		return petAge;
	}

	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}

	public String getPetPlace() {
		return petPlace;
	}

	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petAge == null) ? 0 : petAge.hashCode());
		result = prime * result + ((petId == null) ? 0 : petId.hashCode());
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
		result = prime * result + ((petPlace == null) ? 0 : petPlace.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PetEntity other = (PetEntity) obj;
		if(petAge == null) {
			if(other.petAge != null)
				return false;
		}else if(!petAge.equals(other.petAge))
			return false;
		if(petId == null) {
			if(other.petId != null)
				return false;
		}else if(!petId.equals(other.petId))
			return false;
		if(petName == null) {
			if(other.petName != null)
				return false;
		}else if(!petName.equals(other.petName))
			return false;
		if(petPlace == null) {
			if(other.petPlace != null)
				return false;
		}else if(!petPlace.equals(other.petPlace))
			return false;
		if(user == null) {
			if(other.user != null)
				return false;
		}else if(!user.equals(other.user))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "PetEntity [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ ", user=" + user + "]";
	}

}
