package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProduct extends CrudRepository <Product, Long> {
}
