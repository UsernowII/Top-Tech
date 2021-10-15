package com.edu.unbosque.store.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @Getter @Setter @Column(name = "cod_product")
    private Long idCode;

    @Getter @Setter @Column(name ="iva_buy")
    private double iva;

    @Getter @Setter @Column(name = "nit_provider")
    private Long idProvider;

    @Getter @Setter @Column(name = "name_product")
    private String productName;

    @Getter @Setter @Column(name = "price_product")
    private double priceProduct;

    @Getter @Setter @Column(name = "price_sell")
    private double priceSell;

}