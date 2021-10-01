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
        return Optional.empty();
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public void save(User user) {
        data.save(user);
    }

    @Override
    public void update(User user) {
        data.save(user);
    }
}
