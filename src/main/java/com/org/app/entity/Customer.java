package com.org.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity(name = "customer")
public class Customer{
	@Id
	@Column(name = "customerid")
	@SequenceGenerator(name="customer_sequence_id", sequenceName = "customer_sequence_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence_id")
	private long customerid;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "createdate", nullable = false)
	private LocalDateTime createDate;
	
	@Column(name = "updatedate")
	private LocalDateTime updateDate;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid", referencedColumnName = "customerid", insertable = true)
	private Address address;
	
	public long getCustomerid() {
		return customerid;
	}

	public String getFirstName() {
		return firstName;
	}

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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
