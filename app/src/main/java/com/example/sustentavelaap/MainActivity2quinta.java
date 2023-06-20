package com.example.sustentavelaap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2quinta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2quinta)



findViewById(R.id.bntvoltar2);  
  
 btnsus.setOnClickListener(new View.OnClickListener() {  
              public void onClick(View vol) {  
                  Intent voltar2 = new Intent(MainActivity2quarta.this TerceiraMainActivity2.class);  
                  startActivity(voltar2); 
    }
}