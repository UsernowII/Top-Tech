package com.edu.unbosque.store.controller;

import com.edu.unbosque.store.model.Client;
import com.edu.unbosque.store.service.ClientService;
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
public class ClientAPI {

    @Autowired
    private ClientService clientService;


    @GetMapping("/cliente/listar")
    public String read(Model model){
        List<Client> clientsList = clientService.listar();
        model.addAttribute("clients",clientsList);
        return "clients";
    }

    @GetMapping("/cliente/nuevo")
    public String create(Model model) {
        model.addAttribute("clientNew", new Client());
        return "formClient";
    }


    @PostMapping("/cliente/guardar")
    public String save(@Validated Client client,Model model) {
        clientService.save(client);
        return "redirect:/cliente/listar";
    }


    @GetMapping("/cliente/editar/{idCode}")
    public String update(Client client, Model model) {
        client = clientService.getClientId(client);
        model.addAttribute("clientNew", client);
        return "formClient";
    }

    @GetMapping("/cliente/eliminar/{id}")
    public String delete(Model model, @PathVariable long id) {
        clientService.delete(id);
        return "redirect:/cliente/listar";
    }

}
