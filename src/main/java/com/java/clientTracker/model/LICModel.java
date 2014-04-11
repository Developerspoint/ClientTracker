package com.java.clientTracker.model;

import java.util.Date;

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
@Table(name="LIC_TABLE")
@PrimaryKeyJoinColumn(name="ID")
public class LICModel extends PolicyModel{
	
	@Column(name="GROUP_TYPE")
	private String groupType;
	@Column(name="TABLE_NUMBER")
	private int tableNumber;
	@Column(name="TERM")
	private String term;
	@Column(name="PROPOSAL_NUMBER")
	private int proposalNumber;
	@Column(name="PROPOSAL_DATE")
	private Date proposalDate;
	@Column(name="PARTY_COMMISSION")
	private String partyCommission;
	
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public int getProposalNumber() {
		return proposalNumber;
	}
	public void setProposalNumber(int proposalNumber) {
		this.proposalNumber = proposalNumber;
	}
	public Date getProposalDate() {
		return proposalDate;
	}
	public void setProposalDate(Date proposalDate) {
		this.proposalDate = proposalDate;
	}
	public String getPartyCommission() {
		return partyCommission;
	}
	public void setPartyCommission(String partyCommission) {
		this.partyCommission = partyCommission;
	}
}
