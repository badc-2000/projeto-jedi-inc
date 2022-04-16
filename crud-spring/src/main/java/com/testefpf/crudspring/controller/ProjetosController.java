package com.testefpf.crudspring.controller;

import java.util.List;

import javax.validation.Valid;

import com.testefpf.crudspring.domain.dto.ProjetosDto;
import com.testefpf.crudspring.domain.dto.ResponseDto;
import com.testefpf.crudspring.domain.model.Projetos;
import com.testefpf.crudspring.domain.service.ProjetosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/projetos")
@AllArgsConstructor
public class ProjetosController {
    
    @Autowired
    private ProjetosService projetosService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseDto saveProjeto(@Valid @RequestBody Projetos projetos) {
        return projetosService.saveProjeto(projetos);
    }


    @GetMapping(value = "/list")
    public List<ProjetosDto> getAllProjetos() {
        return projetosService.getAllProjetos();
    }

    @GetMapping(value = "/{id}")
    public ProjetosDto getProjetoById(@PathVariable Long id) {
        return projetosService.getProjetoById(id);
    }

    @PutMapping
    public ResponseDto updateProjeto(@Valid @RequestBody Projetos projetos) {
        return projetosService.updateProjeto(projetos);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseDto deleteProjeto(@PathVariable Long id) {
        return projetosService.deleteProjeto(id);
    }

}
