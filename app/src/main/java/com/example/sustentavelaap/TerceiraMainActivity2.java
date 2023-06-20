package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceiraMainActivity2 extends AppCompatActivity {
Button btnsus;
Button btnreci;
Button btnpontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_main3);


        btnsus=(Button) findViewById(R.id.btnsus);
                btnsus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View s) {
                Intent susten = new Intent(TerceiraMainActivity2.this, MainActivity2quarta.class);

            }
        });


        btnreci=(Button) findViewById(R.id.btnreci);

                btnreci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View n) {
                Intent recicla = new Intent(TerceiraMainActivity2.this, MainActivity2quinta.class);

            }
        });

        btnpontos=(Button) findViewById(R.id.btnpontos);

        btnpontos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent pontos = new Intent(TerceiraMainActivity2.this, MainActivity2sexta.class);


            }
        });

    }
}