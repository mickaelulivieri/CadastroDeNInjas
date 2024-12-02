package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")  // Para evitar o uso de rota genérica
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Mensagem de boas-vindas
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Olá Mundo";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/adicionar")
    public NinjaModel criarNinja( @RequestBody NinjaModel ninjamodel){
        return ninjaService.criarNinja(ninjamodel);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/mostrar/{id}")
    public NinjaModel ListarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados do ninja (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaPorID(){
        return "Olá Mundo";
    }

    // Deletar ninja (DELETE)
    @DeleteMapping("/delete/{id}")
    public void deletarNinjaPorID(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}