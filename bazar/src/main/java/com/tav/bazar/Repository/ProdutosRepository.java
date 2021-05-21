package com.tav.bazar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tav.bazar.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos,Integer>{
	
	<ProdMod extends Produtos>ProdMod save(ProdMod entity);
	
	void delete(Produtos produtos);
	
	Produtos findById(int id);
	
	List<Produtos> findAll();
	
}
