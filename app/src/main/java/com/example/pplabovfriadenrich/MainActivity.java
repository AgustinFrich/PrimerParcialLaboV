package com.example.pplabovfriadenrich;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.pplabovfriadenrich.EditMVC.EditModel;

public class MainActivity extends AppCompatActivity implements IOnUsuarioClick {
    UsuarioAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListadoUsuarios.GenerarLista();

        adapter = new UsuarioAdapter(ListadoUsuarios.usuarios, this);

        RecyclerView rv = super.findViewById(R.id.recycler_view);

        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(llm);
    }

    @Override
    protected void onResume() {
        super.onResume();
        int pos = EditModel.getPosicion();
        if(pos != -1) {
            adapter.notifyItemChanged(pos);
        }
    }

    @Override
    public void onUsuarioClick(int posicion) {
        Intent i = new Intent(this, EditActivity.class);

        i.putExtra("posicion", posicion);
        this.startActivity(i);
    }
}