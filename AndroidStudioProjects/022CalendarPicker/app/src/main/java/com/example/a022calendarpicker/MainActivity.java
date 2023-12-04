package com.example.a022calendarpicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    CalendarView calendarView;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendario);
        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> onSelectedDayChange(view, year, month, dayOfMonth));
        button = findViewById((R.id.button));
        button.setOnClickListener(v -> onClickListener());
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        TextView textView = findViewById(R.id.fecha);
        String fecha = dayOfMonth + " - " + month + " - " + year;
        textView.setText(fecha);
    }

    public void onClickListener(){
        EditText editText = findViewById(R.id.data);
        String data = editText.getText().toString();
        String parts[] = data.split("/");

        int day = Integer.parseInt(parts[2]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[0]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        long milliTime = calendar.getTimeInMillis();
        calendarView.setDate(milliTime, true, true);
        //calendarView.setDate(largo);
    }
}