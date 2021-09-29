package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.dao.UserDao;


import com.edu.unbosque.store.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;


@Controller
public class UserAPI {


    private UserDao userDao;

    /**
     * Handle the root (/) and return start page Login
     * @param model data spring boot
     * @return index
     */
    @GetMapping("/listar")
    public String read(Model model){
        List<User> users = userDao.listar();
        model.addAttribute("users", users);
        return "index";

    }

}
