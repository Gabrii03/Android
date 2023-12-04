package com.example.a025spinnerexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    ArrayList<Team> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ArrayList<Team>) Team.crearTeam();
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(new Adaptador(getApplicationContext(), R.layout.elemento, list));
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView textView = findViewById(R.id.nombre);
        ImageView imageView = findViewById(R.id.imageView);
        Team team = (Team) parent.getItemAtPosition(position);

        textView.setText(team.getName().toString());
        imageView.setImageResource();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}