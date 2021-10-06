package com.edu.unbosque.store.service.implement;

import com.edu.unbosque.store.model.Product;
import com.edu.unbosque.store.repository.IProduct;
import com.edu.unbosque.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private IProduct data;


    @Override
    public List<Product> listar() {
        return (List<Product>) data.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Product getProductId(Product product){
        return data.findById(product.getIdCode()).orElse(null);
    }

    @Override
    public void save(Product product) {
        Product p = data.save(product);
    }

    @Override
    public void delete(long id) {
        data.deleteById(id);
    }

}