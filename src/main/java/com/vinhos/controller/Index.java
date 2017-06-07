package com.vinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinhos.repository.PontoColetaRepository;

@Controller
public class Index {
	
	@Autowired
	PontoColetaRepository pcRepo;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("list", pcRepo.findAll());
		return "index";
	}
}
