package com.example.a018recylcerview;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    //atributos
    String nombre;
    String descripcion;
    public Datos(String n, String d){
        this.nombre= n;
        this.descripcion = d;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public static List<Datos> poblarDatos(){
        List<Datos> lista = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            Datos datos = new Datos("pais" + i, "descripcion" +i);
            lista.add(datos);
        }
        return lista;
    }
}
