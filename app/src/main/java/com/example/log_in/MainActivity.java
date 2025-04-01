package com.example.log_in;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.log_in.home.home;
import com.example.log_in.registro.registro;

public class MainActivity extends AppCompatActivity {

    private Button btn_ini;
    private Button btn_reg;

    private Intent intent_h;

    private CheckBox verificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ini = findViewById(R.id.btn_log);
        btn_reg = findViewById(R.id.btn_register);

        EditText txt_u = findViewById(R.id.txt_usr);


        btn_ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_h = new Intent(MainActivity.this, home.class);
                String txt1 = txt_u.getText().toString();;
                intent_h.putExtra( "usr",txt1);
                startActivity(intent_h);
            }
        });
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciar_intent(registro.class);
            }
        });
    }
    public void iniciar_intent(Class cls)
    {
        Intent intent = new Intent(MainActivity.this,cls);
        startActivity(intent);
    }
}