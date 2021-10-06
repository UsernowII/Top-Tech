package com.edu.unbosque.store.service.implement;

import com.edu.unbosque.store.service.UserService;
import com.edu.unbosque.store.repository.IUser;
import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
public class UserServiceImp implements UserService {

    @Autowired
    private IUser data;


    @Override
    public List<User> listar() {
        return (List<User>) data.findAll();
    }
    /**
    @Override
    public Optional<User> getUserId(long id) {
        return data.findById(id);
    }*/

    @Override
    @Transactional(readOnly = true)
    public User getUserId(User user){
        return data.findById(user.getId()).orElse(null);
    }

    @Override
    public void save(User user) {
        User u = data.save(user);
    }

    @Override
    public void delete(long id) {
        data.deleteById(id);
    }

}