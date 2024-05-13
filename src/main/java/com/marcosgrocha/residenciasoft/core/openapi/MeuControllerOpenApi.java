package com.marcosgrocha.residenciasoft.core.openapi;

import org.springframework.web.bind.annotation.PathVariable;

import com.marcosgrocha.residenciasoft.models.entities.MeuUsuario;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "API - CRUD")
public interface MeuControllerOpenApi {
    
    @Operation(summary = "Create - Usuário")
    MeuUsuario novoUsuario(MeuUsuario meuUsuario);

    @Operation(summary = "Read - Usuário")
    Iterable<MeuUsuario> obterUsuarios();

    @Operation(summary = "Update - Usuário")
    MeuUsuario alterarUsuario(MeuUsuario meuUsuario);

    @Operation(summary = "Delete - Usuário")
    void excluirUsuario(@PathVariable int id);
}
