package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Product;


import java.util.List;


public interface ProductService {

     List<Product> listProducts();

     Product getProductId(Product product);

     void save(Product product);

     void delete(long id);



}
