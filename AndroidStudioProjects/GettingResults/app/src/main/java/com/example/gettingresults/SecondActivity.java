package com.example.gettingresults;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String text;
    TextView textView;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.llegada);
        text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(text);

        button2 = findViewById(R.id.volver);
        button2.setOnClickListener(view -> volver(view));
    }

    public void volver(View view){
        Intent returnIntent = new Intent();
        //Pareja clave -->MainActivity.REQUEST_RESULT valor text.toUpperCase
        returnIntent.putExtra(MainActivity.REQUEST_RESULT, text.toUpperCase());
        //metodo especifico de
        setResult(RESULT_OK, returnIntent);
        finish();
    }
}