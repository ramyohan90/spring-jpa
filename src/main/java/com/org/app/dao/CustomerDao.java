package com.org.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.app.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long>{

}
