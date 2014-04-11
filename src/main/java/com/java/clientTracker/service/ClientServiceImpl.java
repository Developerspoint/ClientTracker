package com.java.clientTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.java.clientTracker.dao.UserDao;
import com.java.clientTracker.model.UserModel;

@Service("clientService")
public class ClientServiceImpl implements ClientService{
	@Autowired
	private UserDao userDao;
	
	public void addClient(UserModel userModel) {
		// TODO Auto-generated method stub
		userDao.addClient(userModel);
	}

	public List<UserModel> getListOfClient() {
		// TODO Auto-generated method stub
		return userDao.getListOfClients();
	}

}
