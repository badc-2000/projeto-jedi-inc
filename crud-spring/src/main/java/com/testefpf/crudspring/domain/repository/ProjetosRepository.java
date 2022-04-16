package com.testefpf.crudspring.domain.repository;

import com.testefpf.crudspring.domain.model.Projetos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetosRepository extends JpaRepository<Projetos, Long>{
    
}
