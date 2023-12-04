package com.example.a035reciclerviewcontextual;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Datos> list = Datos.poblarDatos();
        /*list.add("China");
        list.add("France");
        list.add("Germany");
        list.add("India");
        list.add("Rusia");
        list.add("United Kingdom");
        list.add("United States");

        list.add("China");
        list.add("France");
        list.add("Germany");
        list.add("India");
        list.add("Rusia");
        list.add("United Kingdom");
        list.add("United States");

        list.add("China");
        list.add("France");
        list.add("Germany");
        list.add("India");
        list.add("Rusia");
        list.add("United Kingdom");
        list.add("United States");

        list.add("China");
        list.add("France");
        list.add("Germany");
        list.add("India");
        list.add("Rusia");
        list.add("United Kingdom");
        list.add("United States");*/

        RecyclerView recyclerView = findViewById(R.id.Reciclaje);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        //para cargar la lista en cada elemento.xml
        MiAdaptador miAdaptador = new MiAdaptador(list);

        recyclerView.setAdapter(miAdaptador);
    }
}
