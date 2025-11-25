package br.edu.fatecou.projetobackend.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pessoa {

    @Id
    private String uuid;
    private String nome;
    private String cpf;
    private Double altura;
    private Double peso;
}
