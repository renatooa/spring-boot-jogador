package br.com.renato.jogador.model.dto;

public class JogadorDadosDto {

	private String nome;

	private String cpf;

	private String camisa;

	private int timeCodigo;

	public JogadorDadosDto() {
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
