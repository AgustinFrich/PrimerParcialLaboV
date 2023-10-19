package com.example.pplabovfriadenrich;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNombre;
    EditText etContra;
    EditText etRepetir;
    RadioGroup radioGroup;

    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = super.getSupportActionBar();
        Bundle extras = getIntent().getExtras();
        Button b = findViewById(R.id.ed_btn_save);

        posicion = extras.getInt("posicion");
        Usuario usr = ListadoUsuarios.usuarios.get(posicion);

        etNombre = findViewById(R.id.et_nombre);
        etContra = findViewById(R.id.et_contraseña);
        etRepetir = findViewById(R.id.et_repetirContraseña);
        radioGroup = findViewById(R.id.radioGroup);

        etNombre.setText(usr.nombre);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(R.string.editar);
        b.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        RadioButton radioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        Usuario usr = new Usuario(etNombre.getText().toString(), etContra.getText().toString(), radioButton.getText().toString());
       boolean resultado = ListadoUsuarios.EditarUno(posicion, usr, etRepetir.getText().toString());
        if(resultado) {
            super.finish();
        }
    }
}