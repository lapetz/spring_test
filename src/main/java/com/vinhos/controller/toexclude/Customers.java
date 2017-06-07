package com.vinhos.controller.toexclude;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Customers extends JpaRepository<Customer, Long> {

}
