package com.edu.unbosque.store.service.implement;


import com.edu.unbosque.store.model.Provider;
import com.edu.unbosque.store.repository.IProvider;
import com.edu.unbosque.store.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProviderServiceImp implements ProviderService {

    @Autowired
    private IProvider data;


    @Override
    public List<Provider> getProviders() {
        return (List<Provider>) data.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Provider getProviderId(Provider provider){
        return data.findById(provider.getIdProvider()).orElse(null);
    }

    @Override
    public void save(Provider provider) {
        Provider p = data.save(provider);
    }

    @Override
    public void delete(long id) {
        data.deleteById(id);
    }
}