package com.example.pplabovfriadenrich;

import java.io.Serializable;

public class Usuario implements Serializable {
    public String nombre;
    public String contraseña;
    public String tipoUsuario;

    public  Usuario(String nombre, String contraseña, String tipoUsuario){
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
    }
    public  Usuario() {
        this.nombre = "";
        this.contraseña = "";
        this.tipoUsuario = "";
    }
}