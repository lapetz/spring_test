package com.vinhos.controller.toexclude;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ValoresController {
	
	@Autowired
	private Vinhos vinhos;
	
	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute(new Vinho());
		return "valores/cadastro";
	}
	
	/*@PostMapping("/novo")
	public String salvar(Vinho vinho) {
		vinhos.save(vinho);
		return "redirect:/novo";
	}*/

}
