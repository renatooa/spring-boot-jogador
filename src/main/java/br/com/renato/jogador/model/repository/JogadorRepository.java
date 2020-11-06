package br.com.renato.jogador.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renato.jogador.model.entity.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {

}