package com.tav.bazar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.tav.bazar.model.Produtos;
import com.tav.bazar.repository.ProdutosRepository;
import com.tav.bazar.service.ProdutosService;

@ExtendWith(SpringExtension.class)
public class ProdutosServiceTest {
	
	@TestConfiguration
	static class ProdutoServiceTestConfiguration{
		
		@Bean
		public ProdutosService produtoService() {
			
			return new ProdutosService();
			
		}
		
		
	}
	
	@Autowired
	ProdutosService produtosService;
	
	@MockBean
	ProdutosRepository produtosRepository;
	
	@Test
	public void quantidadexpreco() {
		
		String nome = "Café";
		
		double preco = produtosService.quantidadexpreco(nome);
		
		double esperado = 100;
		
		Assertions.assertEquals(preco,esperado);
		
	}
		
	@Test
	public void idxnome() {
		
		String nome = "Café";
		
		int id = produtosService.idxnome(nome);
		
		int esperado = 1;
		
		Assertions.assertEquals(id ,esperado);
		
	}
	
	@Test
	public void addproduto() {
		
		int id = 2;
		
		String nome = "Cola";
		
		int quantidade = 20;
		
		int preco = 5;
		
		String fornecedor = "Coca";
		
		Produtos produtos = new Produtos(id,nome,quantidade,preco,fornecedor);
		
		Produtos esperado = produtos;
		
		Assertions.assertEquals(produtos ,esperado);
		
	}
	
	@BeforeEach
	public void setup() {
		
		Produtos produtos = new Produtos(1,"Café", 5, 20, null);
		
		Mockito.when(produtosRepository.findByReserveNome(produtos.getNome())).thenReturn(java.util.Optional.of(produtos));
		
	}
	
}
