package com.vinhos.controller.toexclude;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;;

@Controller
public class CustomerController {

	@Autowired
	private Customers customers;
	
	@PostMapping("/customer")
	public String salvar(Customer customer) {
		System.out.println("Your Message : " + "aaaaaaaaaaaaaaaaaaaaaaaaaoooooooooooooooooooooooooooo");
		customers.save(customer);
		return "xx";
	}
	
	@GetMapping("/customer")
	public String vem(Model model) {
		model.addAttribute(new Customer());
		System.out.println("Your Message : " + "aaaaaaaaaaaaaaaaaaaaaaaaaoooooooooooooooooooooooooooo");
		return "valores/cadastro";
	}
}
