package dev.java10x.CadastroDeNinjas.Missoes;


import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.TypeAlias;
import java.util.List;

@Entity
@Table(name = "tb_Missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nome_da_Missão")
    private String nomeMissao;

    @Column(name = "Dificuldade_da_missão")
    private String dificuldade;

    //significa q um ninja pode ter muitas missoes
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
