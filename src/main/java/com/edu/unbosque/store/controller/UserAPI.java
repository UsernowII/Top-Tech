package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.service.UserService;


import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;
import java.util.Optional;


@Controller
public class UserAPI {

    @Autowired
    private UserService userService;

    /**
     * Handle the root (/) and return start page Login
     * @param model data spring boot
     * @return index
     */
    @GetMapping("/listar")
    public String read(Model model){
        List<User> users = userService.listar();
        model.addAttribute("users",users);
        return "usuarios";
    }

    @GetMapping("/nuevo")
    public String create(Model model) {
        model.addAttribute("userNew", new User());
        return "form";
    }


    @PostMapping("/guardar")
    public String save(@Validated User p, Model model) {
        userService.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String update(@PathVariable int id, Model model) {
        Optional<User> persona = userService.getUserId(id);
        model.addAttribute("userNew", persona);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id) {
        userService.delete(id);
        return "redirect:/listar";
    }

}
