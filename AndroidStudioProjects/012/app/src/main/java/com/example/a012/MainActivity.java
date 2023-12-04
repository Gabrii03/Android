package com.example.a012;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String KEY_COUNTER = "CONTADOR";
    private int miContador = 0;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Contador(View view) {
        miContador++;
        textView = findViewById(R.id.Resultado);
        textView.setText("Contador: "+Integer.toString(miContador));
    }

    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, miContador);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        miContador = savedInstanceState.getInt(KEY_COUNTER);
        textView = findViewById(R.id.Resultado);
        textView.setText("Contador: "+ Integer.toString(miContador));
    }
}