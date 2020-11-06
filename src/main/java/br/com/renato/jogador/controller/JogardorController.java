package br.com.renato.jogador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.renato.jogador.model.dto.JogadorDadosDto;
import br.com.renato.jogador.model.dto.JogadorDto;
import br.com.renato.jogador.model.service.JogadorService;

@RestController()
@RequestMapping("/jogador")
public class JogardorController {

	@Autowired
	private JogadorService jogadorService;

	@PostMapping
	public JogadorDto incluir(@RequestBody JogadorDadosDto jogadorDto) {
		return jogadorService.incluir(jogadorDto);
	}

	@GetMapping
	public List<JogadorDto> listar() {
		return jogadorService.listar();
	}
}