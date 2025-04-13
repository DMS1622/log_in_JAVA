package com.example.log_in.libros.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.log_in.R;

public class libroViewHolder extends RecyclerView.ViewHolder {

    TextView txtNombre;
    TextView txtAutor;
    public libroViewHolder(@NonNull View itemView) {
        super(itemView);
        txtNombre = itemView.findViewById(R.id.txtNombre);
        txtAutor = itemView.findViewById(R.id.txtAutor);
    }

}
