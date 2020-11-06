package br.com.renato.jogador.model.dto;

public class JogadorDto extends JogadorDadosDto {

	private Integer codigo;

	public JogadorDto() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}