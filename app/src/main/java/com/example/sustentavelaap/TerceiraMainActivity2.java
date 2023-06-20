package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TerceiraMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_main3);


findViewById(R.id.btnsus);

findViewById(R.id.btnreci);

findViewById(R.id.btnpontos);



        btnsus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View s) {
                Intent susten = new Intent(TerceiraMainActivity2.this MainActivity2quarta.class);
                startActivity(susten);


        btnreci.setOnClickListener(new View.OnClickListener() {
            public void onClick(View n) {
                Intent recicla = new Intent(TerceiraMainActivity2.this MainActivity2quarta.class);
                startActivity(recicla);


        btnpontos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View c) {
                Intent pontos  = new Intent(TerceiraMainActivity2.this MainActivity2quarta.class);
                startActivity(pontos);


    }
}