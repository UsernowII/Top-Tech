package com.edu.unbosque.store.service.implement;


import com.edu.unbosque.store.model.Client;
import com.edu.unbosque.store.repository.IClient;
import com.edu.unbosque.store.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private IClient data;

    @Override
    public List<Client> listar() {
        return (List<Client>) data.findAll();
    }

    @Override
    @Transactional
    public void save(Client client) {
        Client c = data.save(client);

    }

    @Transactional(readOnly = true)
    @Override
    public Client getClientId(Client client) {
        return data.findById(client.getIdCode()).orElse(null);
    }


    @Override
    public void delete(long id) {
        data.deleteById(id);
    }
}