package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Product;
import com.edu.unbosque.store.model.Provider;

import java.util.List;


public interface ProviderService {

     List<Provider> getProviders();

     Provider getProviderId(Provider provider);

     void save(Provider provider);

     void delete(long id);



}
