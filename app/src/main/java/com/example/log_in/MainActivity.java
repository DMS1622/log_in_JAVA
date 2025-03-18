package com.example.log_in;

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

public class MainActivity extends AppCompatActivity {

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

        Button btn_ini = findViewById(R.id.btn_log);

        Button btn_reg = findViewById(R.id.btn_register);

        EditText txt_u = findViewById(R.id.txt_usr);
        EditText txt_p = findViewById(R.id.txt_psw);





        btn_ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1,txt2;
                txt1 = txt_u.getText().toString();
                txt2 = txt_p.getText().toString();
                Log.d("MainActivity", txt1);
                Log.d("MainActivity", txt2);

            }
        });
    }



}