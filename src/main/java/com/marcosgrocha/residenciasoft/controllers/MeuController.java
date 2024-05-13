package com.marcosgrocha.residenciasoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcosgrocha.residenciasoft.core.openapi.MeuControllerOpenApi;
import com.marcosgrocha.residenciasoft.models.entities.MeuUsuario;
import com.marcosgrocha.residenciasoft.models.repositories.MeuRepository;

@RestController
@RequestMapping("/usuario")
public class MeuController implements MeuControllerOpenApi {
    
        // INJEÇÃO DE DEPENDENCIA
    @Autowired
    private MeuRepository meuRepository;
    
        // CREATE       (INSERÇÃO)
    @PostMapping("/novoUsuario")
    public MeuUsuario novoUsuario(MeuUsuario meuUsuario) {
        meuRepository.save(meuUsuario);
        return meuUsuario;
    }

        // READ         (TODOS)
    @GetMapping("/todos")
    public Iterable<MeuUsuario> obterUsuarios() {
        return meuRepository.findAll();
    }

        // UPDATE       (ALTERAÇÃO)
    @PostMapping("/alterarUsuario")
    public MeuUsuario alterarUsuario(MeuUsuario meuUsuario) {
        meuRepository.save(meuUsuario);
        return meuUsuario;
    }

        // DELETE       (EXCLUIR -> massive-delet)
    @DeleteMapping(path = "/excluirUsuario/{id}")
    public void excluirUsuario(@PathVariable int id) {
        meuRepository.deleteById(id);
    }
}
