package com.testefpf.crudspring.domain.config;

import com.testefpf.crudspring.domain.dto.ResponseDto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DtoConfig {
    
    @Bean
    public ResponseDto ResponseDto(){
        return new ResponseDto();
    }
}
