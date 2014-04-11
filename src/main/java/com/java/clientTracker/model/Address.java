package com.java.clientTracker.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author vht
 *
 */
@Embeddable
public class Address {
	@Column(name="ADDRESS_LINE")
	private String addressLine;
	@Column(name="CITY")
	private String city;
	@Column(name="PIN_NUMBER")
	private int pinNumber;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="LANDMARK")
	private String landMark;
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
}
