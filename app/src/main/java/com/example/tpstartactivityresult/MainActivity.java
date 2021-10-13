package com.example.tpstartactivityresult;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAbrirActivity, btnAbrirContactos, btnAbrirCamara;
    ImageView ivImagen;
    TextView tvOutPut;

    private static_int PICK_CONTACT = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObtenerReferencias();

        SetearListeners();


        Button btnActivity2 = findViewById(R.id.btnAbrirActivity);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAbrirActivity) {
                    Intent intent = new Intent(MainActivity.this, secondActivity.class);
                    startActivityForResult(intent, 1);
                } else {

                }
            }
        });
    }


    private void ObtenerReferencias() {
        btnAbrirActivity = findViewById(R.id.btnAbrirActivity);
        btnAbrirCamara = (Button)findViewById(R.id.btnAbrirCamara);
        btnAbrirContactos = (Button)findViewById(R.id.btnAbrirContactos);
        ivImagen = (ImageView)findViewById(R.id.ivImagen);
        tvOutPut = (TextView)findViewById(R.id.tvOutPut);
    }

    private void SetearListeners() {

        btnAbrirCamara.setOnClickListener(btnAbrirCamara_Click);
        btnAbrirContactos.setOnClickListener(btnAbrirContactos_Click);
    }


    private View.OnClickListener btnAbrirCamara_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // ir a acercaDeFragment
        }
    };

    
    private View.OnClickListener btnAbrirContactos_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts);
            i setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE);
            startActivityForResult(i,PICK_CONTACT);
        }
    };

}