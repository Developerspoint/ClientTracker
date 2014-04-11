package com.java.clientTracker.dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.java.clientTracker.model.UserModel;


@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addClient(UserModel userModel) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(userModel);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}  finally {
//			session.close();
		}
	}

	public List<UserModel> getListOfClients() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = null;
		List<UserModel> listOfCLient = null;
		try{
			transaction = session.beginTransaction();  
			listOfCLient = session.createCriteria(UserModel.class).list();
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction != null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfCLient;
	}

}
