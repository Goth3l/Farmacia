package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Medicamento;

public class FarmaciaRepository {
	
public interface UsuarioRepository extends JpaRepository<Medicamento, Long>{
		
	}

}