package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface IUser extends CrudRepository <User, Long> {


    Optional<User> findByUsername(String username);
}
