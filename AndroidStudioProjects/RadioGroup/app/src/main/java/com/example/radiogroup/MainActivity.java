package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.pico);
        radioGroup.setOnCheckedChangeListener(group, checkedId) -> onCheckedChanged(group, checkedId);
        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> );
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //Toast.makeText(this, "HAS PICADO"+i, Toast.LENGTH_LONG).show();
        TextView t = (TextView) findViewById(R.id.respuesta);
        if(R.id.Button1 == checkedId) {
            t.setText("El Albacete no es el mismo desde que se fue Iniesta");
        }else if(R.id.Button2 == checkedId) {
            t.setText("El Albacete no es el mismo desde que se fue Iniesta");
        }else if (R.id.Button3 == checkedId) {
            t.setText("El Albacete no es el mismo desde que se fue Iniesta");
        } else{
            t.setText("El Albacete no es el mismo desde que se fue Iniesta");
        }
    }

    public void onCheckedChanged(CompoundButton c, boolean b){
        TextView t = findViewById(R.id.respuesta);
        if(b){
            t.setText("Te gusta el fútbol");
        }else {

        }
    }
}