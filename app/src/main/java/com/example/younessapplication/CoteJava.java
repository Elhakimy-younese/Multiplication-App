package com.example.younessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CoteJava extends AppCompatActivity {
    Button btnre,btnqtt;
    EditText Number;
    TextView tv;

    Button c1,c2,c3;

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btnre=findViewById(R.id.btn_reinitialiser);
        btnqtt=findViewById(R.id.btn_quitter);
        Number=findViewById(R.id.TextNum);
<<<<<<< HEAD
        c1=findViewById(R.id.btn_c1);
        c2=findViewById(R.id.btn_c2);
        c3=findViewById(R.id.btn_c3);

        tv=findViewById(R.id.txtv);

=======
        tv=findViewById(R.id.txtv);
>>>>>>> master

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

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.WHITE);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.argb(100,76,175,80));
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMyScreenColor(Color.argb(100,205,220,57));
            }
        });

    }
    public void setMyScreenColor(int color){
        View v=this.getWindow().getDecorView();
        v.setBackgroundColor(color);
    }
}