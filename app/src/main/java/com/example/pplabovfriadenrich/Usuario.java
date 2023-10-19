package com.example.pplabovfriadenrich;

import java.io.Serializable;

public class Usuario implements Serializable {
    String nombre;
    String contraseña;
    String tipoUsuario;

    public  Usuario(String nombre, String contraseña, String tipoUsuario){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }
}