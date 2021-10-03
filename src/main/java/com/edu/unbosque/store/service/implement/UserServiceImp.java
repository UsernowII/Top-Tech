package com.edu.unbosque.store.service.implement;

import com.edu.unbosque.store.service.UserService;
import com.edu.unbosque.store.repository.IUser;
import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private IUser data;


    @Override
    public List<User> listar() {
        return (List<User>) data.findAll();
    }

    @Override
    public Optional<User> getUserId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(User user) {
        int res = 0;
        User u = data.save(user);
        if(!u.equals(null)){
            res =1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

}