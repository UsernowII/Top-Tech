package com.edu.unbosque.store.controller;


import com.edu.unbosque.store.service.UserService;


import com.edu.unbosque.store.model.User;
import com.edu.unbosque.store.util.Encrypt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@Controller
@Slf4j
public class UserAPI {

    @Autowired
    private UserService userService;


    @GetMapping("/usuario/listar")
    public String read(Model model){
        List<User> users = userService.listUsers();
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
        Encrypt encrypt = new Encrypt();
        String hashPass = encrypt.encryptPassword(p.getPassword());
        p.setPassword(hashPass);
        log.info(p.getPassword());
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
