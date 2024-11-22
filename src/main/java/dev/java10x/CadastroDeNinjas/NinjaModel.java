package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_Ninjas_Cadastrados")
public class NinjaModel {

    //notations para manipular id e entender como sera feito, no caso, numeros sequenciais
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "IDADE")
    private int idade;

    //CONSTRUTORES
    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public NinjaModel() {
    }

}
