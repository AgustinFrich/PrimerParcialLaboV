package com.example.pplabovfriadenrich;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pplabovfriadenrich.EditMVC.EditController;
import com.example.pplabovfriadenrich.EditMVC.EditModel;
import com.example.pplabovfriadenrich.EditMVC.EditVista;

public class EditActivity extends AppCompatActivity  {


    int posicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        ActionBar actionBar = super.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(R.string.editar);

        Bundle extras = getIntent().getExtras();

        posicion = extras.getInt("posicion");

        EditVista editVista = new EditVista(this);
        EditModel editModel = new EditModel();
        EditController editController = new EditController(editVista, this, editModel, posicion);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            EditModel.setPosicion(-1);
            super.finish();
        }
        return super.onOptionsItemSelected(item);
    }


}