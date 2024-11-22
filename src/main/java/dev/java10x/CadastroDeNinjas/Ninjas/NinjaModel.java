package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
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

    @ManyToOne
    @JoinColumn(name = "Missoes_id")
    private MissoesModel missoes;

    //CONSTRUTORES
    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public NinjaModel() {
    }

}
