package com.example.pplabovfriadenrich.EditMVC;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.pplabovfriadenrich.R;
import com.example.pplabovfriadenrich.Usuario;

public class EditVista {

    EditText etNombre;
    EditText etContra;
    EditText etRepetir;
    RadioGroup radioGroup;
    public Button btnSave;

    Activity ac;

    public EditVista(Activity activity){
        this.ac = activity;
    }

    public void asignarElementos(String nombre){
        etNombre = this.ac.findViewById(R.id.et_nombre);
        etContra = this.ac.findViewById(R.id.et_contraseña);
        etRepetir = this.ac.findViewById(R.id.et_repetirContraseña);
        radioGroup = this.ac.findViewById(R.id.radioGroup);
        btnSave = this.ac.findViewById(R.id.ed_btn_save);

        etNombre.setText(nombre);
    }

    public Usuario obtenerUsuarioDesdeVista() {
        RadioButton radioButton = this.ac.findViewById(radioGroup.getCheckedRadioButtonId());
        return new Usuario(etNombre.getText().toString(), etContra.getText().toString(), radioButton.getText().toString());
    }

    String obtenerContraseñaRepetida(){
        return etRepetir.getText().toString();
    }

    boolean contraseñasCoinciden() {
        return etContra.getText().toString().compareTo(etRepetir.getText().toString()) == 0;
    }
}
