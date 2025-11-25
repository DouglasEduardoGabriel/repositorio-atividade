package br.edu.fatecou.projetobackend;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.projetobackend.entidades.Produto;
import br.edu.fatecou.projetobackend.repositorios.ProdutoRepositorio;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetobackendApplication implements CommandLineRunner {
	private final ProdutoRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ProjetobackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var produto = new Produto();
		produto.setUuid(UUID.randomUUID().toString());
		produto.setNome("Coca cola 2 litros");
		produto.setPreco(12.50);
		produto.setQuantidade(15);

		repositorio.save(produto);
	}

}
