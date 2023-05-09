package com.example.practica01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //objetos del diseño
    private Button btnSaludar, btnLimpiar, btnCerrar;
    private TextView lblSaludo;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relación de los objetos de java con las vistas xml
        btnSaludar = (Button) findViewById(R.id.btnSaludar);
        lblSaludo = (TextView) findViewById(R.id.lblSaludo);
        txtNombre= (EditText)  findViewById(R.id.txtSaludo);
        btnLimpiar = (Button) findViewById(R.id.btnLimpiar);
        btnCerrar = (Button) findViewById(R.id.btnCerrar);

        //Evento click del botón
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNombre.getText().toString().matches("")){
                    Toast.makeText(MainActivity.this, "Favor de ingresar el nombre", Toast.LENGTH_SHORT).show();
                } else {
                    Editable saludar = txtNombre.getText();
                    lblSaludo.setText("Hola " + saludar + " como estas?");
                }

            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblSaludo.setText("");
                txtNombre.setText("");
                txtNombre.requestFocus();
                Toast.makeText(MainActivity.this, "Limpiando campos...", Toast.LENGTH_SHORT).show();
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
