package com.example.younessapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoteJava extends AppCompatActivity {
    Button btnre,btnqtt,btnaff;
    EditText Number;
    TextView tv;

    Button c1,c2,c3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cote_xml);
        btnre=findViewById(R.id.btn_reinitialiser);
        btnqtt=findViewById(R.id.btn_quitter);
        btnaff=findViewById(R.id.btn_afficher);
        Number=findViewById(R.id.TextNum);
        c1=findViewById(R.id.btn_c1);
        c2=findViewById(R.id.btn_c2);
        c3=findViewById(R.id.btn_c3);

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

        Toast t;
        t= Toast.makeText(CoteJava.this,"veuillez saisir un entier !!",Toast.LENGTH_SHORT);

        btnaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    int N = Integer.parseInt(Number.getText().toString());
                    String show="";
                    for (int i=1;i<=10;i++) {
                        int rslt= N*i;
                        show+=String.format(" %d*%d=%d \n",N,i,rslt);
                        rslt=0;

                    }
                    tv.setText(show);



                }catch (NumberFormatException e){
                    btnre.callOnClick();

                    t.show();
                }

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