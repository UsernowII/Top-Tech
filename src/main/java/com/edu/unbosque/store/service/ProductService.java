package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Product;
import com.edu.unbosque.store.model.User;

import java.util.List;


public interface ProductService {

     List<Product> listar();

     Product getProductId(Product product);
     void save(Product product);
     void delete(long id);



}
