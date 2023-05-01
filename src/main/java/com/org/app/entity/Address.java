package com.org.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity(name = "address")
@Table(name = "address")
public class Address extends BaseEntity{
	@Id
	@Column(name = "customerid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;
	

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

	@OneToOne
	@JoinColumn(name="customerid")
	@MapsId
	private Customer customer;
		
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getCustomerId() {
		return customerid;
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

//	@Override
//	public String toString() {
//		return "Address [customerid=" + customerid + ", billing_address_st1=" + billing_address_st1
//				+ ", billing_address_st2=" + billing_address_st2 + ", billing_address_zip=" + billing_address_zip
//				+ ", delivery_address_st1=" + delivery_address_st1 + ", delivery_address_st2=" + delivery_address_st2
//				+ ", delivery_address_zip=" + delivery_address_zip + ", customer=" + customer + "]";
//	}
	
	
}
