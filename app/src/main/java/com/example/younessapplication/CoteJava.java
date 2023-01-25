package com.example.younessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CoteJava extends AppCompatActivity {
    Button btnre,btnqtt;
    EditText Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btnre=findViewById(R.id.btn_reinitialiser);
        btnqtt=findViewById(R.id.btn_quitter);
        Number=findViewById(R.id.TextNum);

        btnre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(null);
            }
        });

        btnqtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}