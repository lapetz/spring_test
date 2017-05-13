package com.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinhos.model.Customer;

public interface Customers extends JpaRepository<Customer, Long> {

}
