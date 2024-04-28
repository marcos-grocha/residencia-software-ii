package com.marcosgrocha.residenciasoft.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosgrocha.residenciasoft.models.entities.MeuUsuario;

public interface MeuRepository extends JpaRepository<MeuUsuario, Integer> {
    
}
