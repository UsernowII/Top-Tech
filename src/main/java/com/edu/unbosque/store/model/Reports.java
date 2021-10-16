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
@Table(name="sales")
@AllArgsConstructor
@NoArgsConstructor
public class Reports {

    @Id
    @Getter @Setter @Column(name = "id_sale")
    private Long saleCode;

    @Getter @Setter @Column(name = "id_user")
    private Long idUser;

    @Getter @Setter @Column(name = "id_client")
    private Long idClient;

    @Getter @Setter @Column(name = "name_client")
    private String nameClient;

    @Getter @Setter @Column(name = "price_sale")
    private double salePrice;

    @Getter @Setter @Column(name = "iva_sale")
    private double saleIVA;

    @Getter @Setter @Column(name = "total_sale")
    private double salePriceTotal;

}