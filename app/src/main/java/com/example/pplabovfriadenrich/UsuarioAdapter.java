package com.example.pplabovfriadenrich;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioViewHolder> {
    private List<Usuario> usuarios;
    private IOnUsuarioClick listener;

    public UsuarioAdapter(List<Usuario> usuarios, IOnUsuarioClick listener){
        this.usuarios = usuarios;
        this.listener = listener;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.usuario_ojo, parent, false);
        return new UsuarioViewHolder(v, this.listener);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        Usuario u = usuarios.get(position);
        holder.tvName.setText(u.nombre);
        holder.tvTipo.setText(u.tipoUsuario);

        holder.setPosicion(position);
    }

    @Override
    public int getItemCount() {
        return this.usuarios.size();
    }
}