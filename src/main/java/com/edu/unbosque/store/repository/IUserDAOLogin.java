package com.edu.unbosque.store.repository;

import com.edu.unbosque.store.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserDAOLogin extends JpaRepository<User, Long> {

    User findByUsername(String username); //recupera un objeto usuario filtrado por username
}
