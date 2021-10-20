package com.edu.unbosque.store.repository;


import com.edu.unbosque.store.model.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRol extends CrudRepository <Rol, Long> {
}
