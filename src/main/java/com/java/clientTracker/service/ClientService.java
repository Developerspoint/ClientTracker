package com.java.clientTracker.service;

import java.util.List;

import com.java.clientTracker.model.UserModel;

public interface ClientService {

	public void addClient(UserModel userModel);
	
	public List<UserModel> getListOfClient();
}
