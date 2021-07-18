package com.tav.av2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "Orcamento")
public class Orcamento {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id_orcamento;

	// Dente ou protese
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_procedimento", nullable = true)
	Procedimento procedimento;
	
	@Column(name = "descricao")
	String descricao;

	@Column(name = "data_avaliacao")
	Date data_avaliacao;

	@Column(name = "assinatura_dentista")
	String assinatura_dentista;

	public Procedimento getprocedimento() {
		return procedimento;
	}

	public void setprocedimento(Procedimento tipo_procedimento) {
		this.procedimento = tipo_procedimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData_avaliacao() {
		return data_avaliacao;
	}

	public void setData_avaliacao(Date data_avaliacao) {
		this.data_avaliacao = data_avaliacao;
	}

	public String getAssinatura_dentista() {
		return assinatura_dentista;
	}

	public void setAssinatura_dentista(String assinatura_dentista) {
		this.assinatura_dentista = assinatura_dentista;
	}

	public int getId_orcamento() {
		return id_orcamento;
	}
	
}
