package com.unbosque.store.api;



import com.unbosque.store.dao.UsuariosDAO;
import com.unbosque.store.model.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "usuarios")
public class UsuariosAPI {

    @Autowired // //inyecta la dependencia de todos los métodos del JPA para usuarioDAO
    private UsuariosDAO usuariosDAO;



    @PostMapping("/guardar")
    public void guardar(@RequestBody Usuarios usuario){
        usuariosDAO.save(usuario);
    }

    @GetMapping(value = "/listar")
    public List<Usuarios> listar(){
        return usuariosDAO.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        usuariosDAO.deleteById(id);
    }


    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Usuarios usuario){
        usuariosDAO.save(usuario);
    }

}
