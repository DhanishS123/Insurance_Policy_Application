package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Table(name="policy")
@Entity
public class Policy {
	
	@Id
	private int policyId;
	private int user_id;
	private String policyName;
	private int insuranceTenure;
	private int premiumAmount;
	private int sumInsured;
	
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getInsuranceTenure() {
		return insuranceTenure;
	}
	public void setInsuranceTenure(int insuranceTenure) {
		this.insuranceTenure = insuranceTenure;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(int sumInsured) {
		this.sumInsured = sumInsured;
	}
	
}
