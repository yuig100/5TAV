package com.tav.av2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pedido_Aprovacao")
public class Pedido_Aprovacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	// aprovado/negado
	@Column(name = "aprovacao")
	Boolean aprovacao;

	@Column(name = "descricao")
	String descricao;

	@Column(name = "data_pedido")
	Date data_pedido;

	@Column(name = "data_resposta")
	Date data_resposta;

	public Boolean getAprovacao() {
		return aprovacao;
	}

	public void setAprovacao(Boolean aprovacao) {
		this.aprovacao = aprovacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_pedido() {
		return data_pedido;
	}

	public void setData_pedido(Date data_pedido) {
		this.data_pedido = data_pedido;
	}

	public Date getData_resposta() {
		return data_resposta;
	}

	public void setData_resposta(Date data_resposta) {
		this.data_resposta = data_resposta;
	}

	public int getId() {
		return id;
	}

}
