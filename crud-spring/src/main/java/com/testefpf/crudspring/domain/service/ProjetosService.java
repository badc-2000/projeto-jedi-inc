package com.testefpf.crudspring.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import com.testefpf.crudspring.domain.dto.ProjetosDto;
import com.testefpf.crudspring.domain.dto.ResponseDto;
import com.testefpf.crudspring.domain.enumeration.Status;
import com.testefpf.crudspring.domain.model.Projetos;
import com.testefpf.crudspring.domain.repository.ProjetosRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProjetosService {
    
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ResponseDto responseDto;

    ProjetosRepository projetosRepository;

    public ResponseDto saveProjeto(Projetos projetos) {
        responseDto.setId(projetosRepository.save(projetos).getId());
        responseDto.setMessage("Projeto Salvo");
        responseDto.setStatus(Status.SUCCESS.value());
        return responseDto;
    }

    public List<ProjetosDto> getAllProjetos() {
        List<ProjetosDto> listAllProjetosDto = projetosRepository.findAll().stream()
            .map(Projetos -> modelMapper.map(Projetos, ProjetosDto.class))
            .collect(Collectors.toList());
        return listAllProjetosDto;
    }

    public ProjetosDto getProjetoById(Long id) {
        return modelMapper.map(projetosRepository.findById(id).get(), ProjetosDto.class);
    }

    public ResponseDto updateProjeto(Projetos projetos) {
        responseDto.setId(projetosRepository.save(projetos).getId());
        if (projetos.getId() > 0) {
            projetosRepository.save(projetos);
            responseDto.setMessage("Projeto Alterado");
            responseDto.setStatus(Status.SUCCESS.value());
        } else {
            responseDto.setMessage("ID do Projeto inválido");
            responseDto.setStatus(Status.ERROR.value());
        }
        return responseDto;
    }

    public ResponseDto deleteProjeto(Long id) {
        responseDto.setId(id);
        if (id > 0) {
            projetosRepository.deleteById(id);
            responseDto.setMessage("Projeto Deletado");
            responseDto.setStatus(Status.SUCCESS.value());
        } else {
            responseDto.setMessage("ID de Projeto inválido");
            responseDto.setStatus(Status.ERROR.value());
        }
        return responseDto;
    }


}
