package com.edu.unbosque.store.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.userdetails.User;


@RequestMapping
@Controller
public class AppController {


    @GetMapping({"/", "/login"})
    public String inicio(@AuthenticationPrincipal User user){//un User de tipo security.core.Userdatails.User
        return "index";
    }


    //Retorna una pagina de acceso restringido si no tiene permisos
    @GetMapping("/errores")
    public String errores(){
        return "403";
    }


    @GetMapping("/reportes")
    public String mostrarReportes(Model model) {
        return "reports";
    }

}
