package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main2);


findViewById(R.id.btnproximo);

        btnproximo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View p) {
                Intent proximo = new Intent(SecondMainActivity2.this terceiraActivity2.class);
                startActivity(proximo);    }
}