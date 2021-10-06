package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.model.Product;
import com.edu.unbosque.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class ProductAPI {

    @Autowired
    private ProductService service;


    @GetMapping("/producto/listar")
    public String read(Model model){
        List<Product> products = service.listar();
        model.addAttribute("products",products);
        return "productos";
    }

    @GetMapping("/producto/nuevo")
    public String create(Model model) {
        model.addAttribute("productNew", new Product());
        return "formProduct";
    }


    @PostMapping("/producto/guardar")
    public String save(@Validated Product p, Model model) {
        service.save(p);
        return "redirect:/producto/listar";
    }

    @GetMapping("/producto/editar/{idCode}")
    public String update(Product product, Model model) {
        product = service.getProductId(product);
        model.addAttribute("productNew", product);
        return "formProduct";
    }

    @GetMapping("/producto/eliminar/{id}")
    public String delete(Model model, @PathVariable long id) {
        service.delete(id);
        return "redirect:/producto/listar";
    }

}
