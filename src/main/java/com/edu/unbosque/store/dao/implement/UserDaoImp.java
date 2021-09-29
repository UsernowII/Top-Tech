package com.edu.unbosque.store.dao.implement;

import com.edu.unbosque.store.dao.UserDao;
import com.edu.unbosque.store.interfaces.IUser;
import com.edu.unbosque.store.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserDaoImp implements UserDao {

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
