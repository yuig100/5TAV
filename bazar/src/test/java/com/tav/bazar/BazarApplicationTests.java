package com.tav.bazar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.tav.bazar.model.Carrinho;
import com.tav.bazar.model.Frete;
import com.tav.bazar.model.ItensCarrinho;
import com.tav.bazar.model.Produtos;

@RunWith(SpringRunner.class)
class BazarApplicationTests {
		
	@Test
	void adicionarproduto_carrinho_test() {
		
		Produtos produto = new Produtos(1, "Mouse", 5, 10, "Xpto");
		
		double preco = 2;

		Frete frete = new Frete(1, null, preco);
		
		Carrinho carrinho = new Carrinho(1, null, 200, frete, null);
		
		ItensCarrinho itenscarrinho = new ItensCarrinho(1, carrinho, produto, 2, preco,"Mouse");
				
		Assertions.assertEquals(itenscarrinho.getNomeProduto(),"Mouse");
		
	}
	
	@Test
	void fechar_pedido_test() {
		
		Frete frete = new Frete(1, null, 50);
		
		Carrinho carrinho = new Carrinho(1, null, 100, frete, null);
		
		double esperado = 150;
		
		double valor_frete_total = carrinho.getValor() + frete.getPreco();
		
		
		Assertions.assertEquals(esperado,valor_frete_total);
		
	}
	
	@Test
	void calcular_frete_test() {
		
		double preco = 2;
		
		Frete frete = new Frete(1, null, preco);
		
		double distancia = 10;
				
		double resposta = frete.calcular_frete(distancia);

		double esperado = 100;
		
		Assertions.assertEquals(esperado,resposta);
		
	}
	
	@Test
	void fazer_pagamento_test() {
		
		double dinheiro = 200;
		
		boolean ver=true;
		
		Frete frete = new Frete(1, null, 50);
		
		Carrinho carrinho = new Carrinho(1, null, 100, frete, null);
		
		double valor = carrinho.getValor() + frete.getPreco();
		
		if(dinheiro >= valor) {
			
			ver = true;
			
		} else {
			
			ver = false;
			
		}
		
		Assertions.assertEquals(ver,true);
		
	}
		
}
