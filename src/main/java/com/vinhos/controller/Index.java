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
		model.addAttribute("media0", pcRepo.obterMediaDia(0));
		model.addAttribute("media1", pcRepo.obterMediaDia(1));
		model.addAttribute("media2", pcRepo.obterMediaDia(2));
		model.addAttribute("media3", pcRepo.obterMediaDia(3));
		model.addAttribute("media4", pcRepo.obterMediaDia(4));
		model.addAttribute("media5", pcRepo.obterMediaDia(5));
		model.addAttribute("media6", pcRepo.obterMediaDia(6));
		model.addAttribute("list", pcRepo.findAll());
		return "index";
	}
}
