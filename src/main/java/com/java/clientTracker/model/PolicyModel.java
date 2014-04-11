package com.java.clientTracker.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 * @author vht
 *
 */
@Entity
@Table(name="POLOCY_TABLE")
@Inheritance(strategy=InheritanceType.JOINED)
public class PolicyModel {
	@Id
	@Column(name="POLICY_NUMBER")
	private String policyNumber;
	public enum PolicyType{LIC, MOTOR, MEDICLAIM};
	@Column(name="POLICY_TYPE")
	private PolicyType policyType;
	@Column(name="POLICY_NAME")
	private String policyName;
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="SUM_ASSURED")
	private int sumAssured;
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;
	@Column(name="SATART_PREMIUM_DATE")
	private Date startPremiumDate;
	@Column(name="NEXT_DUE_DATE")
	private Date nextDueDate;
	@Column(name="MODE")
	private String mode;
	@Column(name="PREMIUM_AMOUNT")
	private int premiumAmount;
	public enum Status{ACTIVE, INACTIVE};
	@Column(name="STATUS")
	private Status status;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public PolicyType getPolicyType() {
		return policyType;
	}
	public void setPolicyType(PolicyType policyType) {
		this.policyType = policyType;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getStartPremiumDate() {
		return startPremiumDate;
	}
	public void setStartPremiumDate(Date startPremiumDate) {
		this.startPremiumDate = startPremiumDate;
	}
	public Date getNextDueDate() {
		return nextDueDate;
	}
	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
