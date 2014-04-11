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
@Table(name="MOTOR_TABLE")
@PrimaryKeyJoinColumn(name="ID")
public class MotorModel extends PolicyModel{
	
	public enum MotorType{TWO_WHEELER, THREE_WHEELER, FOUR_WHELLER, HEAVY_VEHICLE};
	@Column(name="MOTOR_TYPE")
	private MotorType motorType;
	@Column(name="VEHICLE_NUMBER")
	private String vehicleNumber;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	@Column(name="BASE_AMOUNT")
	private int baseAmount;
	@Column(name="TOTAL_AMOUNT")
	private int totalAmount;
	@Column(name="NO_CLAIM_BONUS")
	private int noClaimBonus;
	
	public MotorType getMotorType() {
		return motorType;
	}
	public void setMotorType(MotorType motorType) {
		this.motorType = motorType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
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
