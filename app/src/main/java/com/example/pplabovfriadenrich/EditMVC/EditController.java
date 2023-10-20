package com.example.pplabovfriadenrich.EditMVC;

import android.app.Activity;
import android.view.View;
import com.example.pplabovfriadenrich.Usuario;

public class EditController implements View.OnClickListener {
    private EditVista vista;
    private Activity ac;
    private EditModel modelo;

    public  EditController(EditVista vista, Activity activity, EditModel modelo, int posicion) {
        this.vista = vista;
        this.ac = activity;
        this.modelo = modelo;
        EditModel.setPosicion(posicion);
        modelo.setUsuario(modelo.traerUsuarioActual());
        this.vista.asignarElementos(modelo.getUsuario().nombre);
        this.vista.btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Usuario usr = vista.obtenerUsuarioDesdeVista();
        if(modelo.guardar(usr, vista.contraseñasCoinciden())) {
            this.ac.finish();
        }
    }
}
