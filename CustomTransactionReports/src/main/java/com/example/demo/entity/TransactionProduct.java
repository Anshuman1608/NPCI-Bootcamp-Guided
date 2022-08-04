package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactionproduct")
public class TransactionProduct {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tpid")
	private Integer tpId;
	
	@Column(name = "transactionid")
	private Integer transactionId;
	
	@Column(name = "custid")
	private Integer custId;
	
	@Column(name = "custname")
	private String custName;
	
	@Column(name = "productid")
	private Integer productId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "totalamount")
	private double totalAmount;
	
	public TransactionProduct() {
		
	}

	
		
	public TransactionProduct(Integer transactionId, Integer custId, String custName, Integer productId, Integer quantity,
			double totalAmount) {
		super();
		this.transactionId = transactionId;
		this.custId = custId;
		this.custName = custName;
		this.productId = productId;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}



	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
