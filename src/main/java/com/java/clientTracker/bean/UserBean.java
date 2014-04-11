package com.java.clientTracker.bean;

import java.util.Date;

public class UserBean {

	private Integer id;
	private String name;
	private String phoneNumber;
	private String emailID;
	private Date birthDate;
	private Date anniversaryDate;
	private String gender;
	private String addressLine1;
	private String userPolicyNumber;
	private String userPolicyType;
	private String referrerName;
	private String referrercontactNumber;
	private String referrerAddressLine1;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getUserPolicyNumber() {
		return userPolicyNumber;
	}
	public void setUserPolicyNumber(String userPolicyNumber) {
		this.userPolicyNumber = userPolicyNumber;
	}
	public String getUserPolicyType() {
		return userPolicyType;
	}
	public void setUserPolicyType(String userPolicyType) {
		this.userPolicyType = userPolicyType;
	}
	public String getReferrerName() {
		return referrerName;
	}
	public void setReferrerName(String referrerName) {
		this.referrerName = referrerName;
	}
	public String getReferrercontactNumber() {
		return referrercontactNumber;
	}
	public void setReferrercontactNumber(String referrercontactNumber) {
		this.referrercontactNumber = referrercontactNumber;
	}
	public String getReferrerAddressLine1() {
		return referrerAddressLine1;
	}
	public void setReferrerAddressLine1(String referrerAddressLine1) {
		this.referrerAddressLine1 = referrerAddressLine1;
	}
}
