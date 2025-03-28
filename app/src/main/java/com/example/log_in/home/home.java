package com.example.log_in.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.log_in.R;

public class home extends AppCompatActivity {

    private TextView user;
    private TextView passw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        String cad;
        Intent intent = getIntent();

        user = findViewById(R.id.usr);
        passw = findViewById(R.id.psw);

        String usr = intent.getStringExtra("usr");
        String pws = intent.getStringExtra("pws");

        cad = user.getText().toString();
        cad = cad+usr;
        user.setText(cad);
        passw.setText(pws);

    }

}