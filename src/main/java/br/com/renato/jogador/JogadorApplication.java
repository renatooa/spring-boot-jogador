package br.com.renato.jogador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class JogadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(JogadorApplication.class, args);
	}
}