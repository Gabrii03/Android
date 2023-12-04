package com.example.a013;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button izq, der;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        izq = findViewById(R.id.buttonIzq);
        izq.setOnClickListener(view -> ClickIzquierdo(view));

    }

    public void ClickIzquierdo(View view){
        setContentView(R.layout.activity_main2);
        der = findViewById(R.id.buttonDer);
        der.setOnClickListener(v -> ClickDerecho(view));
    }

    public void ClickDerecho(View view){
        setContentView(R.layout.activity_main);
        izq = findViewById(R.id.buttonIzq);
        izq.setOnClickListener(v -> ClickIzquierdo(view));
    }
}