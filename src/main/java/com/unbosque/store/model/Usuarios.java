package com.unbosque.store.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @Getter @Setter @Column(name = "cedula")
    private long cedula;

    @Getter @Setter @Column(name = "email_usuario")
    private String email_usuario;

    @Getter @Setter @Column(name = "nombre_usuario")
    private String nombre_usuario;

    @Getter @Setter @Column(name = "password")
    private String usuario;

    @Getter @Setter @Column(name = "usuario")
    private String password;

}
