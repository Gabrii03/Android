package com.example.a011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    static TextView textView1;
    static TextView textView2;
    static Button sumar;
    static Button restar;
    static Button multiplicar;
    static Button dividir;

    String texto1;
    String texto2;
    Integer result;

public static void mostrar(){
    textView1= findViewById(R.id.num1);
    textView2= findViewById(R.id.texto2);

    Bundle llegar = getIntent().getExtras();
    String texto1 = llegar.getString("n1");
    String texto2 = llegar.getString("n2");
    textView1.setText(texto1);
    textView2.setText(texto2);
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mostrar();
        Layout layout = findViewById(R.id.sumar);
        sumar.setOnClickListener((view -> onClick(view)));


    }
        public void sumar(View view){
        Intent returnIntent = new Intent();

        }

        public void onClick(View view){
            Intent returnIntent = new Intent();

            switch (view.getId()){
                case(R.id.sumar) {
                    res = Integer.parseInt(texto1)
                    break;
                }
                case(R.id.restar);
                    break;
                case(R.id.multiplicar);
                    break;
                case(R.id.dividir);
                    break;

            }
        }
}