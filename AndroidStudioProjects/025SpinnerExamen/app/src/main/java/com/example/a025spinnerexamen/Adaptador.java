package com.example.a025spinnerexamen;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Adaptador extends ArrayAdapter<Team> {

    LayoutInflater layoutInflater;

    public Adaptador(@NotNull Context context, int resource, List<Team> objects){
        super(context,resource, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    @NotNull
    @Override
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent){

        return rellenarVista(position, convertView, parent);

    }

    public View getDropDownView(int position, @Nullable View convertView, @NotNull ViewGroup parent){

        return  rellenarVista(position, convertView, parent);
    }

    public View rellenarVista(int position, @Nullable View convertView, @NotNull ViewGroup parent){
        if (convertView==null) {
            View view = layoutInflater.inflate(R.layout.elemento, parent, false);
        }
        Team team = getItem(position);

        @SuppressLint(("MissingInflated"))

        return convertView;
    }
}
