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

	public Product() {
		super();
	}

	public Product(Long idCode, double iva, Long idProvider, String productName, double priceProduct,
			double priceSell) {
		super();
		this.idCode = idCode;
		this.iva = iva;
		this.idProvider = idProvider;
		this.productName = productName;
		this.priceProduct = priceProduct;
		this.priceSell = priceSell;
	}

	public Long getIdCode() {
		return idCode;
	}

	public void setIdCode(Long idCode) {
		this.idCode = idCode;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Long getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(Long idProvider) {
		this.idProvider = idProvider;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}

 
}
