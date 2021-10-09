package com.edu.unbosque.store.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @Getter @Setter @Column
    private String authority;




}
