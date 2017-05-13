package com.vinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vinhos.model.Customer;
import com.vinhos.repository.Customers;;

@Controller
public class CustomerController {

	@Autowired
	private Customers customers;
	
	@PostMapping("/customer")
	public String salvar(Customer customer) {
		System.out.println("Your Message : " + "aaaaaaaaaaaaaaaaaaaaaaaaaoooooooooooooooooooooooooooo");
		//customers.save(customer);
		return "foi";
	}
	
	@GetMapping("/customer")
	public String vem(Model model) {
		model.addAttribute(new Customer());
		System.out.println("Your Message : " + "aaaaaaaaaaaaaaaaaaaaaaaaaoooooooooooooooooooooooooooo");
		return "valores/cadastro";
	}
}
