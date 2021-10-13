package com.example.tpstartactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private TextView tvNombre;
    private Button btnAceptar;
    private Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Activity 2");

        ObtenerReferencias();

    }

    private void ObtenerReferencias(){
        tvNombre = findViewById(R.id.tvNombre);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnCancelar = findViewById(R.id.btnCancelar);
    }
}
