package com.dnapass.training.usecase.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String userPassword;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<PetEntity> pet;

	public UserEntity() {
		
	}

	public UserEntity(Integer userId, String userName, String userPassword, List<PetEntity> pet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.pet = pet;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<PetEntity> getPet() {
		return pet;
	}

	public void setPet(List<PetEntity> pet) {
		this.pet = pet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pet == null) ? 0 : pet.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
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
		UserEntity other = (UserEntity) obj;
		if(pet == null) {
			if(other.pet != null)
				return false;
		}else if(!pet.equals(other.pet))
			return false;
		if(userId == null) {
			if(other.userId != null)
				return false;
		}else if(!userId.equals(other.userId))
			return false;
		if(userName == null) {
			if(other.userName != null)
				return false;
		}else if(!userName.equals(other.userName))
			return false;
		if(userPassword == null) {
			if(other.userPassword != null)
				return false;
		}else if(!userPassword.equals(other.userPassword))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", pet="
				+ pet + "]";
	}
	
}


