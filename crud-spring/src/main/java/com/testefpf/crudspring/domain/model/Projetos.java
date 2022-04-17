package com.testefpf.crudspring.domain.model;

//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
public class Projetos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(length = 20, nullable = false)
    private long projectValue;

    @Column(length = 20, nullable = false)
    private int risk;

    //@Column
    //private List<String> partakers = new ArrayList<String>();

}
