package com.tav.testeintegracao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;

import com.tav.av2.Av2Application;
import com.tav.av2.implement.ValidaCPF;
import com.tav.av2.model.Cliente;
import com.tav.av2.model.Orcamento;
import com.tav.av2.model.Pedido_Aprovacao;
import com.tav.av2.model.Procedimento;
import com.tav.av2.repository.ClienteRepository;
import com.tav.av2.repository.OrcamentoRepository;
import com.tav.av2.repository.Pedido_AprovacaoRepository;
import com.tav.av2.repository.ProcedimentoRepository;
import com.tav.av2.service.ClienteService;

@SpringBootTest(classes = Av2Application.class)
public class ClienteImplements extends ClienteService {
	
	@Autowired
	private ClienteRepository clienterepository;
	
	@Autowired
	private OrcamentoRepository orcamentorepository;
	
	@Autowired
	private ProcedimentoRepository procedimentorepository;
	
	@Autowired
	Pedido_AprovacaoRepository pedido_aprovacaorepository;
		
	@SuppressWarnings("unused")
	private MockMvc mockmvc;
	
	@Before(value = "")
	public void setup() {
		
		this.mockmvc=MockMvcBuilders.standaloneSetup(clienterepository).build();
		this.mockmvc=MockMvcBuilders.standaloneSetup(orcamentorepository).build();
		this.mockmvc=MockMvcBuilders.standaloneSetup(procedimentorepository).build();
		this.mockmvc=MockMvcBuilders.standaloneSetup(pedido_aprovacaorepository).build();
	}
	
	/*Listar todos os clientes ativos com apenas os campos nome, CPF, ultimo atendimento, particular ou plano e nome do plano.
	 *  O nome do cliente deve ser um link para outra página contendo todos os campos do cliente.
	 * */
	
	@SuppressWarnings("deprecation")
	@Test
	void validarCPF() {
		
		ValidaCPF validacpf = new ValidaCPF();
		
		String cpf = "88400988019";
		
		@SuppressWarnings("static-access")
		Boolean requisicao = validacpf.isCPF(cpf);
		
		Assert.isTrue(requisicao);
	}
	
	/*Incluir Cliente é um formulário com todos os campos. Esses campos devem ser validados no backend.*/
	
	@Test
	void incluircliente() throws Exception {
		
		String user = "qualquerusuario";
		String senha = "qualquersenha";
		String nome = "qualquernome";
		String cpf = "88400988019";
		Boolean plano_saude = true;
		String nome_plano_saude = "qualquerplano";
		String tipo_plano_saude = "qualquertipo";
		int numero_prontuario = 1;
		Boolean dependente = true;
		
		Cliente cliente = new Cliente();
		
		cliente.setUser(user);
		cliente.setSenha(senha);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setPlano_saude(plano_saude);
		cliente.setNome_plano_saude(nome_plano_saude);
		cliente.setTipo_plano_saude(tipo_plano_saude);
		cliente.setNumero_prontuario(numero_prontuario);
		cliente.setDependente(dependente);
		
		Integer countUser1 = clienterepository.findAll().size();
		
		clienterepository.save(cliente);
		
        Integer countUser2 = clienterepository.findAll().size() - 1;
                
        assertEquals(countUser1, countUser2);
        
        clienterepository.deleteAll();
        
	}
		
	//Listar um cliente a partir da digitação do CPF.
	@SuppressWarnings("deprecation")
	@Test
	void listarclientescpf() {
		
		String user = "qualquerusuario";
		String senha = "qualquersenha";
		String nome = "qualquernome";
		String cpf = "88400988019";
		Boolean plano_saude = true;
		String nome_plano_saude = "qualquerplano";
		String tipo_plano_saude = "qualquertipo";
		int numero_prontuario = 1;
		Boolean dependente = true;
		
		Cliente cliente = new Cliente();
		
		cliente.setUser(user);
		cliente.setSenha(senha);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setPlano_saude(plano_saude);
		cliente.setNome_plano_saude(nome_plano_saude);
		cliente.setTipo_plano_saude(tipo_plano_saude);
		cliente.setNumero_prontuario(numero_prontuario);
		cliente.setDependente(dependente);
		
		clienterepository.save(cliente);
		
		Assert.notEmpty(clienterepository.findByCpf(cpf));
		
		clienterepository.delete(cliente);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void listarclientes() {
		
		String user = "qualquerusuario";
		String senha = "qualquersenha";
		String nome = "qualquernome";
		String cpf = "88400988019";
		Boolean plano_saude = true;
		String nome_plano_saude = "qualquerplano";
		String tipo_plano_saude = "qualquertipo";
		int numero_prontuario = 1;
		Boolean dependente = true;
		
		Cliente cliente = new Cliente();
		
		cliente.setUser(user);
		cliente.setSenha(senha);
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setPlano_saude(plano_saude);
		cliente.setNome_plano_saude(nome_plano_saude);
		cliente.setTipo_plano_saude(tipo_plano_saude);
		cliente.setNumero_prontuario(numero_prontuario);
		cliente.setDependente(dependente);
		
		clienterepository.save(cliente);
		
		Assert.notEmpty(clienterepository.findAll());
		
		clienterepository.deleteAll();
	}
	
	/*Orçamento de procedimento é um formulário preenchido pelo dentista com as necessidades do cliente. 
	 * O sistema deve identificar o procedimento e colocar o valor do procedimento automaticamente a partir de uma tabela 
	 * de procedimentos. 
	 * No final do formulario o dentista de assinar digitalmente o orçamento.*/
	
	@Test
	void orcamento() {
		
		Orcamento orcamento = new Orcamento();
		
		orcamento.setprocedimento(procedimentorepository.findByName("Dentario"));
		
		orcamento.setDescricao("Descrição generica do orçamento");
		
		orcamento.setAssinatura_dentista("Dr.Dentaduras");
		
		Integer countOrc1 = orcamentorepository.findAll().size();
		
		orcamentorepository.save(orcamento);
		
        Integer countOrc2 = orcamentorepository.findAll().size() - 1;
                
        assertEquals(countOrc1, countOrc2);
        
        orcamentorepository.delete(orcamento);
		
	}
		
	@Test
	void retornarprocedimentovalor() {
		
		Procedimento procedimento = new Procedimento();
		
		procedimento = procedimentorepository.findByName("Dentario");
		
		double valor = 500;
		
		assertEquals(valor, procedimento.getValor());
		
	}
	
	/*Pedir aprovação de um orçamento é uma requisição a uma API do plano de saúde com os dados do orçamento. 
	 * O sistema deve disponibilizar um endpoint para receber um post assíncrono com a resposta do pedido de aprovação.*/
	
	@Test
	void pedirpermissao() {
		
		Pedido_Aprovacao pedido_aprovacao = new Pedido_Aprovacao();
		
		pedido_aprovacao.setData_pedido(null);
		pedido_aprovacao.setData_resposta(null);
		pedido_aprovacao.setDescricao("Descrição generica sobre a aprovacao de um pedido");
		pedido_aprovacao.setAprovacao(true);
		
		Integer countApr1 = pedido_aprovacaorepository.findAll().size();
		
		pedido_aprovacaorepository.save(pedido_aprovacao);
		
		Integer countApr2 = pedido_aprovacaorepository.findAll().size() - 1;
        
        assertEquals(countApr1, countApr2);
        
        pedido_aprovacaorepository.delete(pedido_aprovacao);
		
	}
	
}
