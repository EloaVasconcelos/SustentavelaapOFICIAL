package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2sexta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2sexta);



findViewById(R.id.bntvoltar3);  
  
  
 btnsus.setOnClickListener(new View.OnClickListener() {  
              public void onClick(View volta) {  
                  Intent voltar3 = new Intent(MainActivity2quarta.this TerceiraMainActivity2.class);  
                  startActivity(voltar3);  

   }
}