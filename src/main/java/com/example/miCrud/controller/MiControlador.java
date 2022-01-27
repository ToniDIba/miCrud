package com.example.miCrud.controller;

import com.example.miCrud.modelo.PersonaMdl;
import com.example.miCrud.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class MiControlador {

    @Autowired
    Servicio servicio;

/*
    @PostMapping("/alta")
    PersonaMdl addPerson(@RequestBody PersonaMdl personaMdl)*/


    @PostMapping("/alta")
    PersonaMdl addPerson(@RequestBody PersonaMdl personaMdl) {
        return this.servicio.guardarUsuario(personaMdl);
    }


    @GetMapping("/id/{id}")
    PersonaMdl buscarPorId(@PathVariable("id") Long id) {

        return this.servicio.findById(id);
    }

    @GetMapping("/todosid")
    ArrayList<PersonaMdl> buscaTodos() {
        return this.servicio.absolutamenteTodos();

    }


    @GetMapping("/edad/{edad}")
    ArrayList<PersonaMdl> buscarPorEdad(@PathVariable("edad") String edad)
    {

        return this.servicio.findByEdad(edad);

    }


}
