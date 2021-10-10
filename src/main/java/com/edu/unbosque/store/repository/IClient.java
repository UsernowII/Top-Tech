package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IClient extends CrudRepository <Client, Long> {

}
