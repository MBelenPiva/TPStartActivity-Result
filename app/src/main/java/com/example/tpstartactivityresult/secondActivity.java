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

        SetearListeners();

    }

    private void ObtenerReferencias(){
        tvNombre = findViewById(R.id.tvNombre);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnCancelar = findViewById(R.id.btnCancelar);
    }

    private void SetearListeners() {
        btnCancelar.setOnClickListener(btnCancelar_Click);
        btnAceptar.setOnClickListener(btnAceptar_Click);
    }

    private View.OnClickListener btnCancelar_Click = new View.OnClickListener() {
    @Override
    public void onClick(View arg0) {
        String message=tvNombre.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("MESSAGE",message);
        setResult(2,intent);
        finish();//finalizar activity
    }
    };

    private View.OnClickListener btnAceptar_Click = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            String message=tvNombre.getText().toString();
            Intent intent=new Intent();
            intent.putExtra("Angi",message);
            setResult(2,intent);
            finish();//finalizar activity
        }
    };

}

