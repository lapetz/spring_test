package com.vinhos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vinhos.model.PontoColeta;
import com.vinhos.repository.PontoColetaRepository;;

@Controller
public class PontoColetaController {

	@Autowired
	private PontoColetaRepository pcRepo;
	
	@GetMapping("/setvalues")
	public String vem(@RequestParam(value = "t", defaultValue = "996") Integer vlTemperatura,
			@RequestParam(value = "ph", defaultValue = "997") Integer vlPh,
			@RequestParam(value = "ua", defaultValue = "998") Integer umidadeAr,
			@RequestParam(value = "us", defaultValue = "999") Integer umidadeSolo,
			@RequestParam(value = "i", defaultValue = "n_incendio") String ieIncendio,
			@RequestParam(value = "g", defaultValue = "g_invalid") String dsGeo) {
		//PontoColeta pontoColeta = new PontoColeta(vlTemperatura, vlPh, umidadeAr, umidadeSolo, ieIncendio, dsGeo);
		PontoColeta pontoColeta = new PontoColeta();
		pontoColeta.setVlTemperatura(vlTemperatura);
		pontoColeta.setVlPh(vlPh);
		pontoColeta.setUmidadeAr(umidadeAr);
		pontoColeta.setUmidadeSolo(umidadeSolo);
		pontoColeta.setIeIncendio(ieIncendio);
		pontoColeta.setDsGeoLocalizacao(dsGeo);
		
		pcRepo.save(pontoColeta);
		return "DALE";
	}
}
