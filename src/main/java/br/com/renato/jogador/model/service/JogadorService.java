package br.com.renato.jogador.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.renato.jogador.model.dto.JogadorDadosDto;
import br.com.renato.jogador.model.dto.JogadorDto;
import br.com.renato.jogador.model.entity.Jogador;
import br.com.renato.jogador.model.repository.JogadorRepository;

@Service
public class JogadorService {

	@Autowired
	private JogadorRepository jogadorRepository;

	public JogadorDto incluir(JogadorDadosDto jogadorDadosDto) {

		Jogador jogador = new Jogador();

		BeanUtils.copyProperties(jogadorDadosDto, jogador);

		jogadorRepository.save(jogador);

		JogadorDto jogadorDto = novoDtoCopia(jogador);

		return jogadorDto;
	}

	public List<JogadorDto> listar() {

		List<Jogador> jogadores = jogadorRepository.findAll();

		List<JogadorDto> jogadorDtos = new ArrayList<>();

		jogadores.forEach(jogador -> {

			jogadorDtos.add(novoDtoCopia(jogador));

		});

		return jogadorDtos;
	}

	private JogadorDto novoDtoCopia(Jogador jogador) {
		JogadorDto jogadorDto = new JogadorDto();

		BeanUtils.copyProperties(jogador, jogadorDto);
		return jogadorDto;
	}
}