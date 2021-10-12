package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.model.Provider;
import com.edu.unbosque.store.service.ProviderService;
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
public class ProviderAPI {

    @Autowired
    private ProviderService service;


    @GetMapping("/proveedor/listar")
    public String read(Model model){
        List<Provider> providers = service.getProviders();
        model.addAttribute("providersList", providers);
        return "providers";
    }

    @GetMapping("/proveedor/nuevo")
    public String create(Model model) {
        model.addAttribute("providerNew", new Provider());
        return "formProvider";
    }


    @PostMapping("/proveedor/guardar")
    public String save(@Validated Provider p, Model model) {
        service.save(p);
        return "redirect:/proveedor/listar";
    }

    @GetMapping("/proveedor/editar/{idProvider}")
    public String update(Provider provider, Model model) {
        provider = service.getProviderId(provider);
        model.addAttribute("providerNew", provider);
        return "formProvider";
    }

    @GetMapping("/proveedor/eliminar/{idProvider}")
    public String delete(Model model, @PathVariable long id) {
        service.delete(id);
        return "redirect:/proveedor/listar";
    }

}
