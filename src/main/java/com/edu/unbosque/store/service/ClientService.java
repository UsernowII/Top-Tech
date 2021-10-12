package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Client;

import java.util.List;



public interface ClientService {

     List<Client> listar();

     Client getClientId(Client client);

     void save(Client client);

     void delete(long id);




}
