package com.edu.unbosque.store.service;

import com.edu.unbosque.store.model.Rol;
import com.edu.unbosque.store.model.User;

import java.util.List;


public interface RolService {

     List<Rol> getListRol();

     void save(Rol rol);

     Rol getRolId(Rol rol);
}
