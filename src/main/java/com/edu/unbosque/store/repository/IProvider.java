package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProvider extends CrudRepository <Provider, Long> {
}
