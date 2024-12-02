package dev.java10x.CadastroDeNinjas.Ninjas;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //listar todos os ninjas

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }
}
