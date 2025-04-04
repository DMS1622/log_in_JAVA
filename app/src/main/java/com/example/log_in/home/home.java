package com.example.log_in.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.log_in.R;

public class home extends AppCompatActivity {

    private TextView user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String cad;
        Intent intent = getIntent();

        user = findViewById(R.id.usr);


        String usr = intent.getStringExtra("usr");


        cad = user.getText().toString();
        cad = cad+usr;
        Toast.makeText(this, cad, Toast.LENGTH_SHORT).show();


    }

}