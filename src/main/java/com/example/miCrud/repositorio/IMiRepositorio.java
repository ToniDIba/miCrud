package com.example.miCrud.repositorio;

import com.example.miCrud.modelo.PersonaMdl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
    public interface IMiRepositorio extends CrudRepository<PersonaMdl, Long> {


    ArrayList<PersonaMdl> findByEdad(String edad);




    }



