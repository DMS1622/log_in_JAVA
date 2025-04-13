package com.example.log_in.libros.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.log_in.R;
import com.example.log_in.libros.Libro;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.libroViewHolder> {

    private List<Libro> listaLib = new ArrayList<>();

    public Adapter(List<Libro> listaLib) {
        this.listaLib = listaLib;
    }

    @NonNull
    @Override
    public libroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLibro =
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.item_libro, parent, false);
        return new libroViewHolder(itemLibro);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.libroViewHolder holder, int position) {
        holder.txtNombre.setText(listaLib.get(position).getNombre());
        holder.txtAutor.setText(listaLib.get(position).getAutor());
    }

    @Override
    public int getItemCount() {
        return listaLib.size();
    }

    public static class libroViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre;
        TextView txtAutor;

        libroViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtAutor = itemView.findViewById(R.id.txtAutor);
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    public void setLibros(List<Libro> libros) {
        this.listaLib = libros;
        notifyDataSetChanged();
    }
}