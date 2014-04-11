package com.java.clientTracker.dao;

import java.util.List;

import com.java.clientTracker.model.UserModel;

public interface UserDao {
	
	public void addClient(UserModel userModel);

	public List<UserModel> getListOfClients();
}
