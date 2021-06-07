package com.tav.bazar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tav.bazar.Repository.ClientesRepository;

public class ClientesResourcesTest extends BazarApplicationTests{
	
	//private MockMvc mockMvc;
	
	@Autowired
	ClientesRepository clientesrepository;
	
	@Test
	public void criarClientes() throws Exception {
				
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC","root","");
		
		Statement stmt = connection.createStatement();
		
		String sql = "INSERT INTO `teste`.`clientes` (`id`, `nome`) VALUES ('99999', 'Gabriel');";
		
		stmt.execute(sql);
		
		ResultSet resultSet = null;
		
		String nome = "SELECT nome FROM teste.clientes where nome = 'Gabriel'";
		
		resultSet = stmt.executeQuery(nome);
		
		Assertions.assertNotNull(resultSet);
		
		stmt.executeUpdate("DELETE FROM `teste`.`clientes` WHERE (`id` = '99999')");
		
		connection.close();
		stmt.close();
		
	}
	
	@Test
	public void updateClietes() throws Exception{
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC","root","");
		
		Statement stmt = connection.createStatement();
		
		String sql = "INSERT INTO `teste`.`clientes` (`id`, `nome`) VALUES ('99999', 'Gabriel');";
		
		stmt.execute(sql);
		
		ResultSet resultSet = null;
				
		stmt.executeUpdate("UPDATE `teste`.`clientes` SET `nome` = 'Lucas' WHERE (`id` = '99999');");
		
		String nome = "SELECT nome FROM teste.clientes where nome = 'Lucas'";
		
		resultSet = stmt.executeQuery(nome);
		
		Assertions.assertNotNull(resultSet);
		
		stmt.executeUpdate("DELETE FROM `teste`.`clientes` WHERE (`id` = '99999')");
		
		connection.close();
		stmt.close();
		
	}
	
}
