package com.tav.av2.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Acompanhamento_execucao")
public class Acompanhamento_execucao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name = "data_inicio")
	Date data_inicio;

	@Column(name = "data_conclusao")
	Date data_conclusao;

	@OneToOne
	@JoinColumn(name = "id_orcamento", referencedColumnName = "id_orcamento")
	Orcamento id_orcamento;

	@ManyToOne
	@JoinColumn(name = "dentista_cpf", nullable = false)
	Dentista dentista;

	@Column(name = "ordem_atendimento")
	int ordem_atendimento;

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Date data_conclusao) {
		this.data_conclusao = data_conclusao;
	}

	public Orcamento getId_orcamento() {
		return id_orcamento;
	}

	public void setId_orcamento(Orcamento id_orcamento) {
		this.id_orcamento = id_orcamento;
	}

	public Dentista getDentista() {
		return dentista;
	}

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	public int getOrdem_atendimento() {
		return ordem_atendimento;
	}

	public void setOrdem_atendimento(int ordem_atendimento) {
		this.ordem_atendimento = ordem_atendimento;
	}
	
}
