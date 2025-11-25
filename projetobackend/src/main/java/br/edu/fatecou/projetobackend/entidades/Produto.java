package br.edu.fatecou.projetobackend.entidades;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Data
@Entity
public class Produto {
    @Id
    private String uuid;
    private String nome;
    private Integer quantidade;
    private Double preco;
}
