package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")  // Para evitar o uso de rota genérica
public class NinjaController {

    // Mensagem de boas-vindas
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Olá Mundo";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/adicionar")
    public String criarNinja(){
        return "Olá Mundo";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Olá Mundo";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/mostrar/{id}")
    public String mostrarNinjaPorId(@PathVariable Long id){
        return "Olá Mundo";
    }

    // Alterar dados do ninja (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorID(){
        return "Olá Mundo";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/delete/{id}")
    public String deletarNinjaPorID(@PathVariable Long id){
        return "Olá Mundo";
    }
}