package br.edu.fatecou.projetobackend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecou.projetobackend.entidades.Carro;

public interface CarroRepositorio extends JpaRepository<Carro, String> {

}
