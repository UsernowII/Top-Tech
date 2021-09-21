package com.unbosque.store.dao;

import com.unbosque.store.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

}
