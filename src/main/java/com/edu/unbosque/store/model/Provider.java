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
@Table(name="providers")
@AllArgsConstructor
@NoArgsConstructor
public class Provider {

    @Id
    @Getter @Setter @Column(name = "nit_provider")
    private Long idProvider;

    @Getter @Setter @Column(name = "city_provider")
    private String city;

    @Getter @Setter @Column(name ="address_provider")
    private String addressProvider;

    @Getter @Setter @Column(name = "name_provider")
    private String name;

    @Getter @Setter @Column(name = "phone_provider")
    private String phone;









}
