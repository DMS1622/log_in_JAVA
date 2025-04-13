package com.example.log_in.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.log_in.R;
import com.example.log_in.libros.Adapter.Adapter;
import com.example.log_in.libros.Libro;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {


    private Toolbar menu_tab;
    private RecyclerView.LayoutManager layoutManager;
    private List<Libro> l2;
    private RecyclerView rvLibros;

    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setToolBar();

        layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvLibros = findViewById(R.id.rvLibros);
        adapter = new Adapter(l2);
        rvLibros.setAdapter(adapter);
        adapter.setLibros(getLibros());


    }

    private List<Libro> getLibros() {
        return new ArrayList<Libro>() {{
            add(new Libro(1, "Harry Potter", "J.K. Rowling"));
            add(new Libro(2, "Game of Thrones", "George Martin"));
            add(new Libro(3, "Maze Runner", "James Dashner"));
            add(new Libro(4, "Señor de los anillos", "J. R. R. Tolkien"));
            add(new Libro(5, "Señor de los anillos 2", "J. R. R. Tolkien"));
        }};
    }


    public void setToolBar()
    {
        menu_tab = findViewById(R.id.menu_tab);
        setSupportActionBar(menu_tab);
        setTitle("Inicio");
    }
}