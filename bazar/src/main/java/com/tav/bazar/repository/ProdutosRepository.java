package com.tav.bazar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tav.bazar.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos,String>{

	Optional<Produtos> findByReserveNome(String name);
	Optional<Produtos> findById(int id);
	
}


