package com.example.log_in;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.log_in.home.home;
import com.example.log_in.registro.registro;

public class MainActivity extends AppCompatActivity {

    private Toolbar menu_act;
    private Button btn_ini;
    private Button btn_reg;

    private Intent intent_h;

    private CheckBox verificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolBar();
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
                finish();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_xx, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_agregar){
//Realizar acción
        }
        return super.onOptionsItemSelected(item);
    }
    public void setToolBar()
    {
        menu_act = findViewById(R.id.menu_tab);
        setSupportActionBar(menu_act);
        setTitle("Log In Libros");
    }
}