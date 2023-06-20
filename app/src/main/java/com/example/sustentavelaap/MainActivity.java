package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnentrar = (Button) findViewById(R.id.btnentrar);

        btnentrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View e) {
                Intent Entrar = new Intent(MainActivity.this,SecondMainActivity2.class);
                startActivity(btnentrar);


            }
        });
    }
}
