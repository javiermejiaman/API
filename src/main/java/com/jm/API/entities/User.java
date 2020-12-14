package com.jm.API.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
* Esta clase modela la tabla user y es mapeada en la
* base de datos al iniciarse el contexto de la aplicación.
* */
@Entity
public class User {

    /*-- atributos de los usuarios --*/
    // id del usuario
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    // nombre y apellido
    private String nombre;
    private String apellido;

    /*-- getters & setters --*/
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
