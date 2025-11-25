package br.edu.fatecou.projetobackend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecou.projetobackend.entidades.Produto;


public interface ProdutoRepositorio extends JpaRepository<Produto, String> {

}
