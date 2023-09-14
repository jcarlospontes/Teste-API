package dev.teste.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "pessoas")
public class TesteDadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name")
    private String nome;
    @Column(name = "user_genre")
    private String genero;
    @Column(name = "user_birth")
    private Date nascimento;
    @Column(name = "user_address")
    private String endereco;

}
