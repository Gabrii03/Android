package com.example.a029griddosbotones;

import static android.graphics.Color.rgb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        añadeHijos();
        recorrer();
    }

    //sirve para resetear los botones a color blanco
    public void recorrer(){
        View v;
        GridLayout g = (GridLayout) findViewById(R.id.rejilla);
        /*recorre toodo lo que cuelga del grid*/
        for (int i =0; i< g.getChildCount(); i++){
            v = g.getChildAt(i);

            Button b = (Button) v;
            b.setBackgroundColor(rgb(0xFF, 0xFF, 0xFF));

        }
    }

    @SuppressLint("ResourceType")
    public void añadeHijos(){
        GridLayout g =(GridLayout) findViewById(R.id.rejilla);
        Button b;
        for (int i =0; i<17; i++){
            b = new Button(this);
            //los botones instanciados y añadidos al grid layout tienen parametros de ancho y alto ajustados a wrap content
            b.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            b.setText("btn" + i);
            b.setId(View.generateViewId());
            b.setOnClickListener(this);
            //añade el boton al contenedor
            g.addView(b,i);
        }
        b = new Button(this);
        b.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        b.setText("SET");
        b.setId(18);
        b.setOnClickListener(this);
        //añade el boton al contenedor
        g.addView(b);
    }

    @SuppressLint("ResourceType")
    public void onClick(View view){
        Button b = (Button) view;
        if (view.getClass().getSimpleName().equals("Button") && b.getId()!=18) {
            //Random el color
            Random r1 = new Random();
            Random r2 = new Random();
            Random r3 = new Random();

            b.setBackgroundColor(rgb(r1.nextInt(255), r2.nextInt(255), r3.nextInt(255)));
        }else
            recorrer();
    }
}