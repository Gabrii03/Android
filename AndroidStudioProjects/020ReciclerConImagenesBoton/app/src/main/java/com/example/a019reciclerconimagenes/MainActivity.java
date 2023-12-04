package com.example.a019reciclerconimagenes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public Button button;

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

        button = findViewById(R.id.boton);
        button.setOnClickListener(view -> miAdaptador.añadir());
    }
}
