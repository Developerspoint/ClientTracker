package com.java.clientTracker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * @author vht
 *
 */
@Entity
@Table(name="MEDICLAIM_TABLE")
@PrimaryKeyJoinColumn(name="ID")
public class MediclaimModel extends PolicyModel{
	@Column(name="DPENDENT_AGE")
	private int dependentAge;
	@Column(name="BASE_AMOUNT")
	private int baseAmount;
	@Column(name="TOTAL_AMOUNT")
	private int totalAmount;
	@Column(name="NO_CLAIM_BONUS")
	private int noClaimBonus;

	public int getDependentAge() {
		return dependentAge;
	}
	public void setDependentAge(int dependentAge) {
		this.dependentAge = dependentAge;
	}
	public int getBaseAmount() {
		return baseAmount;
	}
	public void setBaseAmount(int baseAmount) {
		this.baseAmount = baseAmount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getNoClaimBonus() {
		return noClaimBonus;
	}
	public void setNoClaimBonus(int noClaimBonus) {
		this.noClaimBonus = noClaimBonus;
	}
}
