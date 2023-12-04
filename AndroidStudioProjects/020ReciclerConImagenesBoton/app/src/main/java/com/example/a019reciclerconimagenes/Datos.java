package com.example.a019reciclerconimagenes;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class Datos {

    //atributos
    String nombre;
    String descripcion;
    int imagen;
    public Datos(String n, String d, int  img){
        this.nombre= n;
        this.descripcion = d;
        this.imagen = img;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen(){ return imagen;}
    public static List<Datos> poblarDatos(){
        List<Datos> lista = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            int avatar = R.drawable.avatar_1;
            Datos datos = new Datos("pais" + i, "descripcion" +i,avatar+i);
            lista.add(datos);
        }
        return lista;
    }
}
