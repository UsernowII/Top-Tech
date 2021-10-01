package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.service.UserService;


import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


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

}
