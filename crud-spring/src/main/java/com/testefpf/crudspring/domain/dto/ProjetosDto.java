package com.testefpf.crudspring.domain.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjetosDto {
    Long id;
    String name;
    Date startDate;
    Date endDate;
    long projectValue;
}
