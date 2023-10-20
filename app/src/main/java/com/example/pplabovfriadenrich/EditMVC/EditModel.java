package com.example.pplabovfriadenrich.EditMVC;

import com.example.pplabovfriadenrich.ListadoUsuarios;
import com.example.pplabovfriadenrich.Usuario;

public class EditModel {
    static int posicion;
    Usuario usuario;

    public EditModel(){
        posicion = 0;
        this.usuario = new Usuario();
    }

    public static int getPosicion() {
        return posicion;
    }

    public static void setPosicion(int p) {
        posicion = p;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario traerUsuarioActual() {
        return ListadoUsuarios.obtenerUno(posicion);
    }

    public boolean guardar(Usuario usr, Boolean repiteBien) {
        return ListadoUsuarios.editarUno(posicion, usr, repiteBien);
    }
}
