package com.example.log_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.log_in.home.home;
import com.example.log_in.registro.registro;

public class MainActivity extends AppCompatActivity {

    private Button btn_ini;
    private Button btn_reg;

    private Intent int_home;

    private Intent int_registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn_ini = findViewById(R.id.btn_log);

        btn_reg = findViewById(R.id.btn_register);

        EditText txt_u = findViewById(R.id.txt_usr);
        EditText txt_p = findViewById(R.id.txt_psw);

        int_home = new Intent(MainActivity.this, home.class);
        int_registro = new Intent(MainActivity.this, registro.class);



        btn_ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, home.class);
                String txt1,txt2;
                txt1 = txt_u.getText().toString();
                txt2 = txt_p.getText().toString();
                intent.putExtra( "usr",txt1);
                intent.putExtra( "pws",txt2);
                startActivity(intent);
            }
        });

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int_registro = new Intent(MainActivity.this, registro.class);
                startActivity(int_registro);
            }
        });
    }



}