package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//para dizer q a classe e um controlador e pede a notacao pra mapear as rotas
@RestController
@RequestMapping
public class NinjaController {

    //get e apenas um dos comandos q podem ser feitos
    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota!";
    }

}
