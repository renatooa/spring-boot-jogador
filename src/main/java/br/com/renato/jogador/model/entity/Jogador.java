package br.com.renato.jogador.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	private String nome;

	private String cpf;

	private String camisa;

	private int timeCodigo;

	public Jogador() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

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

	public String getCamisa() {
		return camisa;
	}

	public void setCamisa(String camisa) {
		this.camisa = camisa;
	}

	public int getTimeCodigo() {
		return timeCodigo;
	}

	public void setTimeCodigo(int timeCodigo) {
		this.timeCodigo = timeCodigo;
	}
}
