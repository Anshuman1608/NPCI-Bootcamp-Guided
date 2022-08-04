package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Embeddable
@Table(name = "merchantpreferences")
public class MerchantPreferences {
	@ManyToOne
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

	public MerchantPreferences(Integer merchantId, double upperLimit, double lowerLimit, long pinCode, String custName) {
		super();
		this.merchantId = merchantId;
		this.upperLimit = upperLimit;
		this.lowerLimit = lowerLimit;
		this.pinCode = pinCode;
		this.custName = custName;
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
	
	
}
