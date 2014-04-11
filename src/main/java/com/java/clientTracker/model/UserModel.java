package com.java.clientTracker.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * @author vht
 *
 */
@Entity
@Table(name="USER_TABLE")
public class UserModel {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="USER_NAME")
	private String name;
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	@Column(name="EMAIL_ID")
	private String emailID;
	@Column(name="ADDRESS")
	private Address address;
	@Column(name="BIRTH_DATE")
	private Date birthDate;
	@Column(name="ANNIVERSARY_DATE")
	private Date anniversaryDate;
	@Column(name="GENDER")
	private String gender;
	@Column(name="USER_REFERENCE")
	private UserReference userReference;
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	@Column(name="USER_POLICY_NUMBER")
	private String userPolicyNumber;
	@Column(name="USER_POLICY_TYPE")
	private String userPolicyType;
	@Column(name="REFERRER_NAME")
	private String referrerName;
	@Column(name="REFERRER_CONTACT_NUMBER")
	private String referrercontactNumber;
	@Column(name="REFERRER_ADDRESS_LINE1")
	private String referrerAddressLine1;
	
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public UserReference getUserReference() {
		return userReference;
	}
	public void setUserReference(UserReference userReference) {
		this.userReference = userReference;
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
