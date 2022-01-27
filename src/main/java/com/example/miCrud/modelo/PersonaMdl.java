package com.example.miCrud.modelo;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "persona")
public class PersonaMdl
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    private String nombre;
    private String edad;
    private String mail;
    private String prioridad;

}
