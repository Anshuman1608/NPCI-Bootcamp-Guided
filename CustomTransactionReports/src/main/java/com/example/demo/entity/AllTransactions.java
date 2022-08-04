package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class AllTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transactionid")
	private Integer transactionId;
	
	@Column(name = "merchantid")
	private Integer merchantId;
	
	@Column(name = "billingaddress")
	private String billingAddress;
	
	@Column(name = "timestamps")
	private String timeStamp;
	
	@Column(name = "pincode")
	private long pinCode;
	
	
	public AllTransactions() {
		
	}

	public AllTransactions(Integer transactionId, Integer merchantId, String billingAddress, String timeStamp, long pinCode) {
		super();
		this.transactionId = transactionId;
		this.merchantId = merchantId;
		this.billingAddress = billingAddress;
		this.timeStamp = timeStamp;
		this.pinCode = pinCode;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
}
