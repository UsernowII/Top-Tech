package com.edu.unbosque.store.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id_rol")
    private Long idRol;



    @Getter @Setter
    private String name;

}
