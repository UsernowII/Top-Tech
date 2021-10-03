package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Getter @Setter @Column(name = "id_user")
    private int id;

    @Getter @Setter @Column(name = "name_user")
    private String nameUser;

    @Getter @Setter @Column(name = "email_user")
    private String emailUser;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "user")
    private String nick;


}