package com.example.pplabovfriadenrich;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class UsuarioViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView tvName;
    public TextView tvTipo;
    public Button btnEdit;

    private IOnUsuarioClick listener;
    private int posicion;

    public UsuarioViewHolder(@NonNull View itemView, IOnUsuarioClick listener) {
        super(itemView);
        this.tvName = itemView.findViewById(R.id.tv_nombre);
        this.tvTipo = itemView.findViewById(R.id.tv_tipoUsuario);
        this.btnEdit = itemView.findViewById(R.id.btn_edit);
        this.listener = listener;

        itemView.setClickable(true);
        btnEdit.setOnClickListener(this);
    }

    public void setPosicion(int p){
        this.posicion = p;
    }

    @Override
    public void onClick(View view) {
            listener.onUsuarioClick(posicion);
    }
}
