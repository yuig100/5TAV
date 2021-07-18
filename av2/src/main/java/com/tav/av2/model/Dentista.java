package com.tav.av2.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Dentista")
public class Dentista extends Usuario {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	String nome;

	@Column(name = "cpf")
	String cpf;

	@OneToMany(mappedBy = "dentista")
	private List<Acompanhamento_execucao> acompanhamento_execucao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
