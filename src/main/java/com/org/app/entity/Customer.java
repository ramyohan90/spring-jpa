package com.org.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "customer")
@Table(name = "customer")
public class Customer extends BaseEntity{
	@Id
	@Column(name = "customerid")
	@SequenceGenerator(name="customer_sequence_id", sequenceName = "customer_sequence_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence_id")
	private int customerid;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address address;
	
	public long getCustomerid() {
		return customerid;
	}

	public String getFirstName() {
		return firstName;
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
		this.address.setCustomer(this);
	}

//	@Override
//	public String toString() {
//		return "Customer [customerid=" + customerid + ", firstName=" + firstName + ", lastName=" + lastName + ", name="
//				+ name + ", address=" + address + "]";
//	}
//	
	

}
