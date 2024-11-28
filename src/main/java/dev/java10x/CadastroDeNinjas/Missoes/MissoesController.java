package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missao listada";
    }
}
