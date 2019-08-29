package com.marconate.livros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cuca(View view){
        Intent intent = new Intent(this, CucaActivity.class);
        startActivity(intent);
    }

    public void Curupira(View view){
        Intent intent = new Intent(this, CurupiraActivity.class);
        startActivity(intent);
    }

    public void Mula(View view){
        Intent intent = new Intent(this, MulaActivity.class);
        startActivity(intent);
    }

    public void Saci(View view){
        Intent intent = new Intent(this, SaciActivity.class);
        startActivity(intent);
    }
}
