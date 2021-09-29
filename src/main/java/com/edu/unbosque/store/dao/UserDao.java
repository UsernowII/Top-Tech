package com.edu.unbosque.store.dao;

import com.edu.unbosque.store.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

     List<User> listar();
     Optional<User> getUserId(int id);
     void delete(int id);
     void save(User user);
     void update(User user);


}
