package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Getter @Setter @Column(name = "id_user")
    private Long id;

    @Getter @Setter @Column(name = "name_user")
    private String name;

    @Getter @Setter @Column(name = "email_user")
    private String emailUser;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "user")
    private String username;

    @OneToMany // relacion uno a muchos / user puede tener muchos roles
    @JoinColumn(name = "id_user") //tabla Rol foreign key
    @Getter @Setter
    private List<Rol> roles;
}