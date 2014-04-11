package com.java.clientTracker.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.clientTracker.bean.UserBean;
import com.java.clientTracker.model.UserModel;
import com.java.clientTracker.service.ClientService;
import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

/**
 * 
 * @author Himanshu
 *
 */
@Controller
public class ClientController{
	
	/*@RequestMapping(value="/addClient.do", method=RequestMethod.POST)
	public String addClient(HttpServletRequest request,
			@RequestParam(value="name", required=true) String clientName,
			@RequestParam(value="phoneNumber", required=true) String phoneNumber,
			@RequestParam(value="addressLine1", required=true) String addressLine1,
			@RequestParam(value="userPolicyNumber", required=true) String userPolicyNumber,
			@RequestParam(value="userPlocyType", required=true) String userPlocyType,
			@RequestParam(value="referrerName", required=true) String referrerName,
			@RequestParam(value="referrercontactNumber", required=true) String referrercontactNumber,
			@RequestParam(value="referrerAddressLine1", required=true) String referrerAddressLine1
			){
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh Inside addClient");
	
		return "home";
	}*/
	@Autowired
	private ClientService clientService;
	
	
	
	@RequestMapping(value="/addClient.do", method=RequestMethod.POST)
	public String addClient(@ModelAttribute("addClient")UserBean userBean){
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh Inside addClient");
		UserModel userModel = prepareModel(userBean);
		clientService.addClient(userModel);
		
		return "home";
	}

	private UserModel prepareModel(UserBean userBean) {
		// TODO Auto-generated method stub
		UserModel userModel = new UserModel();
		userModel.setName(userBean.getName());
		userModel.setPhoneNumber(userBean.getPhoneNumber());
		userModel.setAddressLine1(userBean.getAddressLine1());
		userModel.setUserPolicyNumber(userBean.getUserPolicyNumber());
		userModel.setUserPolicyType(userBean.getUserPolicyType());
		userModel.setReferrerName(userBean.getReferrerName());
		userModel.setReferrercontactNumber(userBean.getReferrercontactNumber());
		userModel.setReferrerAddressLine1(userBean.getReferrerAddressLine1());
		userBean.setId(null);
		return userModel;
	}
	
	@RequestMapping(value="/listOfClient.do", method=RequestMethod.GET)
	public ModelAndView listOfClient(){
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh Inside listOfClient");
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("clientList", prepareListOfClientBean(clientService.getListOfClient()));
		return new ModelAndView("clientList", model);
	}

	private List<UserBean> prepareListOfClientBean(List<UserModel> userModel) {
		// TODO Auto-generated method stub
		List<UserBean> listofClientBean = null;
		if(userModel != null && !userModel.isEmpty()){
			listofClientBean = new ArrayList<UserBean>();
			UserBean userBean = null;
			for(UserModel model : userModel){
				userBean = new UserBean();
				userBean.setId(model.getId());
				userBean.setName(model.getName());
				userBean.setPhoneNumber(model.getPhoneNumber());
				userBean.setAddressLine1(model.getAddressLine1());
				userBean.setUserPolicyNumber(model.getUserPolicyNumber());
				userBean.setUserPolicyType(model.getUserPolicyType());
				userBean.setReferrerName(model.getReferrerName());
				userBean.setReferrercontactNumber(model.getReferrercontactNumber());
				listofClientBean.add(userBean);
			}
		}
		return listofClientBean;
	}
}
