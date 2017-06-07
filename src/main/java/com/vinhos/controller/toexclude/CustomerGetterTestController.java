package com.vinhos.controller.toexclude;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;;

@Controller
public class CustomerGetterTestController {

	@Autowired
	private Customers customers;
	
	@GetMapping("/getcustomer")
	public String vem(@RequestParam(value = "nome", defaultValue = "tret") String nome,
			@RequestParam(value = "sobre", defaultValue = "fsz") String sobre) {
		Customer cust = new Customer();
		cust.setFirstname(nome);
		cust.setLastname(sobre);
		customers.save(cust);
		return "DALE";
	}
}
