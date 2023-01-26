package com.example.younessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CoteJava extends AppCompatActivity {
    Button btnre,btnqtt;
    EditText Number;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btnre=findViewById(R.id.btn_reinitialiser);
        btnqtt=findViewById(R.id.btn_quitter);
        Number=findViewById(R.id.TextNum);
        tv=findViewById(R.id.txtv);

        btnre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Number.setText(null);
                tv.setText("? * 1 =?\n ? * 2 =?\n ? * 3 =?\n ? * 4 =?\n ? * 5 =?\n ? * 6 =?\n ? * 7 =?\n ? * 8 =?\n ? * 9 =?\n ? * 10 =?");
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