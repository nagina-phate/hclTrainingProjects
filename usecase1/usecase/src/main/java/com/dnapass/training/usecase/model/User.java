package com.dnapass.training.usecase.model;

public class User {
	
	private Integer userId;
	private String userName;
	private String userPassword;
	
	public User() {
		
	}

	public User(Integer userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		User other = (User) obj;
		
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
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword +  "]";
	}
	
}


