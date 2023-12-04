package com.example.a021toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> onCheckedChanged(buttonView, isChecked));
        aSwitch = findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener((button, checked) -> manolito((Switch) button, checked));
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        ImageView imageView = findViewById(R.id.imageView);
        if(isChecked)
            imageView.setImageResource(R.drawable.avatar_1);
        else
            imageView.setImageResource(R.drawable.avatar_2);
    }

    public void manolito(CompoundButton button, boolean checked){
        ImageView imageView = findViewById(R.id.imageView);
        if(checked)
            imageView.setImageResource(R.drawable.avatar_3);
        else
            imageView.setImageResource(R.drawable.avatar_4);
    }
}