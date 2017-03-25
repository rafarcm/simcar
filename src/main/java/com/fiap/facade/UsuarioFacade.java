package com.fiap.facade;

import com.fiap.entity.UsuarioEntity;
import com.fiap.repository.UsuarioRepository;
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
@RequestMapping("/usuario")
public class UsuarioFacade {

    @Autowired
    UsuarioRepository repository;

    @RequestMapping("/listar")
    public List<UsuarioEntity> listar(){
        return repository.findAll();
    }

    @RequestMapping("/buscar")
    public UsuarioEntity buscar(String email, String senha){

        UsuarioEntity  usuario = repository.findOne(email);

        if(usuario != null){
            if(!senha.equals(usuario.getSenha())){
                usuario = null;
            }
        }
        return usuario;
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public String criar(@RequestBody UsuarioEntity usuario){
        repository.save(usuario);
        return "Usuario criado!";
    }

}