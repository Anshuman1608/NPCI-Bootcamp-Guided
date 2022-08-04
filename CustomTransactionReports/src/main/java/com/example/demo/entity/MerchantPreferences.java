package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "merchantpreferences")
public class MerchantPreferences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "preferid")
	private Integer preferId;
	
	@Column(name = "merchantid")
	private Integer merchantId;
	
	@Column(name = "upperlimit")
	private double upperLimit;
	
	@Column(name = "lowerlimit")
	private double lowerLimit;
	
	@Column(name = "pincode")
	private long pinCode;
	
	@Column(name = "custname")
	private String custName;
	
	public MerchantPreferences() {
		
	}

	public Integer getPreferId() {
		return preferId;
	}

	public void setPreferId(Integer preferId) {
		this.preferId = preferId;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public double getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(double upperLimit) {
		this.upperLimit = upperLimit;
	}

	public double getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(double lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public MerchantPreferences(Integer preferId, Integer merchantId, double upperLimit, double lowerLimit, long pinCode,
			String custName) {
		super();
		this.preferId = preferId;
		this.merchantId = merchantId;
		this.upperLimit = upperLimit;
		this.lowerLimit = lowerLimit;
		this.pinCode = pinCode;
		this.custName = custName;
	}

	
}