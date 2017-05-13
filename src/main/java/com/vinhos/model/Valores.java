package com.vinhos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Valores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private Integer vlTemperatura;

	private Integer vlPh;

	private Integer umidadeSolo;

	private Integer umidadeAr;

	private String ieIncendio;

	private String dsGeoLocalizacao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVlTemperatura() {
		return vlTemperatura;
	}

	public void setVlTemperatura(Integer vlTemperatura) {
		this.vlTemperatura = vlTemperatura;
	}

	public Integer getVlPh() {
		return vlPh;
	}

	public void setVlPh(Integer vlPh) {
		this.vlPh = vlPh;
	}

	public Integer getUmidadeSolo() {
		return umidadeSolo;
	}

	public void setUmidadeSolo(Integer umidadeSolo) {
		this.umidadeSolo = umidadeSolo;
	}

	public Integer getUmidadeAr() {
		return umidadeAr;
	}

	public void setUmidadeAr(Integer umidadeAr) {
		this.umidadeAr = umidadeAr;
	}

	public String getIeIncendio() {
		return ieIncendio;
	}

	public void setIeIncendio(String ieIncendio) {
		this.ieIncendio = ieIncendio;
	}

	public String getDsGeoLocalizacao() {
		return dsGeoLocalizacao;
	}

	public void setDsGeoLocalizacao(String dsGeoLocalizacao) {
		this.dsGeoLocalizacao = dsGeoLocalizacao;
	}

}
