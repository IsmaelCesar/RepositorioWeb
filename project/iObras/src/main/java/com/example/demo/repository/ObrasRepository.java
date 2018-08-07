package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Obra;

public interface ObrasRepository  extends JpaRepository<Obra, Long>{

}
