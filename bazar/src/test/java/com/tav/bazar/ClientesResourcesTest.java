package com.tav.bazar;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.test.web.servlet.MockMvc;

import com.tav.bazar.Repository.ClientesRepository;
import com.tav.bazar.model.Clientes;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ClientesResourcesTest extends BazarApplicationTests{
	
	@MockBean
	ClientesRepository clientesrepository;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@TestConfiguration
	static class Config{
		
		public RestTemplateBuilder restTemplateBuilder() {
			
			return new RestTemplateBuilder().basicAuthentication("root", "");
			
		}
		
	}
	
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
	
	@Test
	public void criar_clientes_repository() {
		
		int id = 9999;
		
		String name = "Pedro";
		
		Clientes clientes = new Clientes(id, name, null, null, null, null);
		
		clientesrepository.save(clientes);
				
		assertThat(clientes.getNome()).isEqualTo(name);
		
	}
	
	@Test
	public void update_clientes_repository() {
		
		int id = 9999;
		
		String name = "Pedro";
		
		Clientes clientes = new Clientes(id, name, null, null, null, null);
		
		clientesrepository.save(clientes);
		
		clientes.setNome("Lucas");
		
		assertThat(clientes.getNome()).isEqualTo("Lucas");
		
	}
	
}
