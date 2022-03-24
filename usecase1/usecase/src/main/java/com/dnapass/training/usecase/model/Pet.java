package com.dnapass.training.usecase.model;

public class Pet {

	private Integer petId;
	private String petName;
	private Integer petAge;
	private String petPlace;

	public Pet() {
	
	}

	public Pet(Integer petId, String petName, Integer petAge, String petPlace) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;

	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
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


	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petAge == null) ? 0 : petAge.hashCode());
		result = prime * result + ((petId == null) ? 0 : petId.hashCode());
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
		result = prime * result + ((petPlace == null) ? 0 : petPlace.hashCode());
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
		Pet other = (Pet) obj;
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
		return true;
	}
	
	@Override
	public String toString() {
		return "PetEntity [petId=" + petId + ", petName=" + petName + ", petAge=" + petAge + ", petPlace=" + petPlace
				+ "]";
	}

}


