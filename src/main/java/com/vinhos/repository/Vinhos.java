package com.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long>{

}
