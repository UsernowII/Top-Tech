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
	private ClientService clientservice;
	
	@GetMapping("/cliente/listar")
	public String read(Model model) {
		List<Client> client = clientservice.listar();
		model.addAttribute("client",client);
		return "Client";
	}
	
	@GetMapping("/cliente/nuevo")
	public String create(Model model) {
		model.addAttribute("clientNew", new Client());
		return "formClient";
	}
	
	@PostMapping("/cliente/guardar")
	public String save(@Validated Client c, Model model) {
		clientservice.save(c);
		return "redirect:/cliente/listar";
		
	}
	
	@GetMapping("/cliente/editar/{id}")
	public String update(Client client, Model model) {
		client = clientservice.getClientId(client);
		model.addAttribute("clientNew", client);
		return "formClient";
	}
	
	@GetMapping("/cliente/eliminar/{id}")
	public String delete(Model model, @PathVariable long id) {
		clientservice.delete(id);
		return "redirect:/cliente/listar";
	}
}
