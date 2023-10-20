package com.example.pplabovfriadenrich;


import java.util.ArrayList;
import java.util.List;

public class ListadoUsuarios {
    public static List<Usuario> usuarios;

    public static void GenerarLista() {
        usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario("P1", "100000", "Administrador"));
        usuarios.add(new Usuario("P2", "100001", "Administrador"));
        usuarios.add(new Usuario("P3", "100002", "Administrador"));
        usuarios.add(new Usuario("P4", "100003", "Usuario"));
        usuarios.add(new Usuario("P5", "100004", "Usuario"));
        usuarios.add(new Usuario("P6", "100005", "Usuario"));
        usuarios.add(new Usuario("P7", "100006", "Usuario"));
        usuarios.add(new Usuario("P8", "100007", "Usuario"));
        usuarios.add(new Usuario("P9", "100008", "Usuario"));
    }

    public static Usuario obtenerUno(int posicion){
        return usuarios.get(posicion);
    }

    public static boolean editarUno(int posicion, Usuario nuevoUsuario, Boolean repiteBien){

        if(nuevoUsuario.nombre.length() >= 3 && repiteBien){
            usuarios.set(posicion, nuevoUsuario);
            return true;
        }
        return false;
    }
}
