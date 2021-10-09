package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @Getter @Setter @Column(name = "id_client")
    private Long idCode;

    @Getter @Setter @Column(name ="address_client")
    private String addressClient;

    @Getter @Setter @Column(name = "email_client")
    private String emailClient;

    @Getter @Setter @Column(name = "name_client")
    private String nameClient;

    @Getter @Setter @Column(name = "phone_client")
    private String phoneClient;




}
