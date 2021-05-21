package com.tav.bazar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tav.bazar.model.Carrinho;

public interface CarrinhoRepository  extends JpaRepository<Carrinho,Integer>{
	
	<CarrinhoMod extends Carrinho>CarrinhoMod save(CarrinhoMod entity);
	
	void delete(Carrinho carrinho);
	
	Carrinho findById(int id);
	
	List<Carrinho> findAll();
	
}
