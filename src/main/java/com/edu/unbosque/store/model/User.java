package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @Getter @Setter @Column
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
    @Getter @Setter
    private Set<Authority> authority;


}