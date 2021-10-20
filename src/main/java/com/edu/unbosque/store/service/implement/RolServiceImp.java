package com.edu.unbosque.store.service.implement;


import com.edu.unbosque.store.model.Rol;
import com.edu.unbosque.store.repository.IRol;
import com.edu.unbosque.store.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class RolServiceImp implements RolService {

    @Autowired
    private IRol data;


    @Override
    public List<Rol> getListRol() {
        return (List<Rol>) data.findAll();
    }

    @Override
    public void save(Rol rol) {
        data.save(rol);
    }

    @Override
    @Transactional(readOnly = true)
    public Rol getRolId(Rol rol) {
        return data.findById(rol.getIdUserRol()).orElse(null);
    }
}