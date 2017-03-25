package com.fiap.facade;

import com.fiap.entity.CarroEntity;
import com.fiap.entity.UsuarioEntity;
import com.fiap.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by logonrm on 25/03/2017.
 */
@RestController
@RequestMapping("/carro")
public class CarroFacade {

    @Autowired
    CarroRepository repository;

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public String criar(@RequestBody CarroEntity carro){
        repository.save(carro);
        return "Carro criado!";
    }

    @RequestMapping("/listar")
    public List<CarroEntity> listar(){
        return repository.findAll();
    }

    @RequestMapping("/buscar")
    public CarroEntity buscar(Integer placa){
        return repository.findOne(Long.valueOf(placa));
    }
}
