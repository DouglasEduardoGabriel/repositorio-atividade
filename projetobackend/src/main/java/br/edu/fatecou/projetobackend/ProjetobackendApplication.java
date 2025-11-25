package br.edu.fatecou.projetobackend;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.fatecou.projetobackend.entidades.Produto;
import br.edu.fatecou.projetobackend.entidades.Pessoa;
import br.edu.fatecou.projetobackend.entidades.Carro;

import br.edu.fatecou.projetobackend.repositorios.ProdutoRepositorio;
import br.edu.fatecou.projetobackend.repositorios.PessoaRepositorio;
import br.edu.fatecou.projetobackend.repositorios.CarroRepositorio;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class ProjetobackendApplication implements CommandLineRunner {

	private final ProdutoRepositorio produtoRepositorio;
	private final PessoaRepositorio pessoaRepositorio;
	private final CarroRepositorio carroRepositorio;

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
        produtoRepositorio.save(produto);

        var pessoa = new Pessoa();
        pessoa.setUuid(UUID.randomUUID().toString());
        pessoa.setNome("João Silva");
        pessoa.setCpf("123.456.789-00");
        pessoa.setAltura(1.75);
        pessoa.setPeso(82.0);
        pessoaRepositorio.save(pessoa);

        var carro = new Carro();
        carro.setUuid(UUID.randomUUID().toString());
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2020);
        carro.setAnoModelo(2021);
        carro.setValor(115000.00);
        carroRepositorio.save(carro);
	}
}
