package com.org.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity(name = "address")
public class Address{
	@Id
	@Column(name = "addressid")
	@SequenceGenerator(name="address_sequence_id", sequenceName = "address_sequence_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_sequence_id")
	private long addressid;
	
	@Column(name = "billing_address_st1")
	private String billing_address_st1;
	
	@Column(name = "billing_address_st2")
	private String billing_address_st2;
	
	@Column(name = "billing_address_zip")
	private String billing_address_zip;
	
	@Column(name = "delivery_address_st1")
	private String delivery_address_st1;
	
	@Column(name = "delivery_address_st2")
	private String delivery_address_st2;
	
	@Column(name = "delivery_address_zip")
	private String delivery_address_zip;
	
	@Column(name = "createdate", nullable = false)
	private LocalDateTime createDate;
	
	@Column(name = "updatedate")
	private LocalDateTime updateDate;

//	@OneToOne
//	@JoinColumn(referencedColumnName= "customerid", table = "customer")
//	private long customerid;
	
	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "address")
	private Customer customer;
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getAddressid() {
		return addressid;
	}

	public String getBilling_address_st1() {
		return billing_address_st1;
	}

	public void setBilling_address_st1(String billing_address_st1) {
		this.billing_address_st1 = billing_address_st1;
	}

	public String getBilling_address_st2() {
		return billing_address_st2;
	}

	public void setBilling_address_st2(String billing_address_st2) {
		this.billing_address_st2 = billing_address_st2;
	}

	public String getBilling_address_zip() {
		return billing_address_zip;
	}

	public void setBilling_address_zip(String billing_address_zip) {
		this.billing_address_zip = billing_address_zip;
	}

	public String getDelivery_address_st1() {
		return delivery_address_st1;
	}

	public void setDelivery_address_st1(String delivery_address_st1) {
		this.delivery_address_st1 = delivery_address_st1;
	}

	public String getDelivery_address_st2() {
		return delivery_address_st2;
	}

	public void setDelivery_address_st2(String delivery_address_st2) {
		this.delivery_address_st2 = delivery_address_st2;
	}

	public String getDelivery_address_zip() {
		return delivery_address_zip;
	}

	public void setDelivery_address_zip(String delivery_address_zip) {
		this.delivery_address_zip = delivery_address_zip;
	}
	
	
}
