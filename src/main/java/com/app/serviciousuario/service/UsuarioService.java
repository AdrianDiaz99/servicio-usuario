package com.app.serviciousuario.service;

import com.app.serviciousuario.entity.Usuario;
import com.app.serviciousuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public Usuario getById(int id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario guardar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
