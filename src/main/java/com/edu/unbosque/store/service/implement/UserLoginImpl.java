package com.edu.unbosque.store.service.implement;


import com.edu.unbosque.store.model.Rol;
import com.edu.unbosque.store.model.User;
import com.edu.unbosque.store.repository.IUserDAOLogin;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("userDetailsService")
@Slf4j // Imprimir en consola con Log
public class UserLoginImpl implements UserDetailsService {

    @Autowired
    private IUserDAOLogin usuarioDAOLogin;


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userFind = usuarioDAOLogin.findByUsername(username);

        if(userFind == null){
            throw new UsernameNotFoundException(username); // si no lo encuentra arroja una excepciòn con el usuario no encontrado
        }

        List roles = new ArrayList<GrantedAuthority>(); // envoltura grantedAuthority para poder usar roles con JPA
        for (Rol rol: userFind.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getName())); // por cada rol del usuario se va a envolver en un tipo simpleGrandAuthority
        }

        return new org.springframework.security.core.userdetails.User(userFind.getUsername(), userFind.getPassword(),roles);
        // retornamos un usuario del tipo userDatilsService de Spring
    }
}
