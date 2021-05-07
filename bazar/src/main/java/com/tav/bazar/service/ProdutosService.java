package com.tav.bazar.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tav.bazar.model.Produtos;
import com.tav.bazar.repository.ProdutosRepository;

@Service
public class ProdutosService {
	
	@Autowired
	ProdutosRepository produtosRepository;
	
	
	public double quantidadexpreco(String nome) {
		// TODO Auto-generated method stub
		
		Optional<Produtos> produtosOptional = produtosRepository.findByReserveNome(nome);
		
		return produtosOptional.get().getPreco() * produtosOptional.get().getQuantidade();
	}
	
	public int idxnome(String nome) {
		
		Optional<Produtos> produtosOptional = produtosRepository.findByReserveNome(nome);
		
		return produtosOptional.get().getId();
	}
	
	public Class<? extends Produtos> addproduto(Produtos produtos) {
		
		Produtos produtosOptional = produtosRepository.saveAndFlush(produtos);
		
		return produtosOptional.getClass();
		
	}
		
}
