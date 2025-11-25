package br.edu.fatecou.projetobackend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecou.projetobackend.entidades.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, String> {

}
