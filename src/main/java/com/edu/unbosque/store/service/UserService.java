package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.User;


import java.util.List;



public interface UserService {

     List<User> listUsers();

     User getUserId(User user);

     void save(User user);

     void delete(long id);



}
