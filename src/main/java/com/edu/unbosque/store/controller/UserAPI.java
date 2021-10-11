package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.service.UserService;


import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
public class UserAPI {

    @Autowired
    private UserService userService;


    @GetMapping("/usuario/listar")
    public String read(Model model){
        List<User> users = userService.listar();
        model.addAttribute("users",users);
        return "users";
    }

    @GetMapping("/usuario/nuevo")
    public String create(Model model) {
        model.addAttribute("userNew", new User());
        return "formUser";
    }


    @PostMapping("/usuario/guardar")
    public String save(@Validated User p, Model model) {
        userService.save(p);
        return "redirect:/usuario/listar";
    }

    @GetMapping("/usuario/editar/{id}")
    public String update(User user, Model model) {
        user = userService.getUserId(user);
        model.addAttribute("userNew", user);
        return "formUser";
    }

    @GetMapping("/usuario/eliminar/{id}")
    public String delete(Model model, @PathVariable long id) {
        userService.delete(id);
        return "redirect:/usuario/listar";
    }

}
