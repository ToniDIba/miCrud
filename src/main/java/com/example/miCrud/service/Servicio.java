package com.example.miCrud.service;

import com.example.miCrud.modelo.PersonaMdl;
import com.example.miCrud.repositorio.IMiRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class Servicio  {

    @Autowired
    IMiRepositorio iMiRepositorio;


    public PersonaMdl guardarUsuario(PersonaMdl personaMdl) {

        return  iMiRepositorio.save(personaMdl);
    }

    public PersonaMdl findById(long id) {

        return iMiRepositorio.findById(id).get();
    }

    public ArrayList<PersonaMdl> todosConId(Long id) {

        return (ArrayList<PersonaMdl>) iMiRepositorio.findAllById(Collections.singleton(id));
    }


    public ArrayList<PersonaMdl> absolutamenteTodos() {

        return (ArrayList<PersonaMdl>) iMiRepositorio.findAll();
    }

    public ArrayList<PersonaMdl>findByEdad(String edad) {

        return (ArrayList<PersonaMdl>)  iMiRepositorio.findByEdad(edad);
    }



}
