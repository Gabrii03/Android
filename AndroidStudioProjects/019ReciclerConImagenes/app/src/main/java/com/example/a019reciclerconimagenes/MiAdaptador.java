package com.example.a019reciclerconimagenes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiViewHolder> {



    private List<Datos> nameList;
    public MiAdaptador(List<Datos> list){
        nameList = list;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.elemento, parent, false);
        MiViewHolder miViewHolder = new MiViewHolder(view);
        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        //cargar dos cadenas en dos textviews
        final Datos cadenas= nameList.get(position);
        holder.texto.setText(cadenas.getNombre());
        holder.detalle.setText(cadenas.getDescripcion());
        holder.imagen.setImageResource(cadenas.getImagen());
    }

    @Override
    public int getItemCount() {
        if (nameList == null){
            return 0;
        }else {
            return nameList.size();
        }
    }


    public class MiViewHolder extends RecyclerView.ViewHolder{
        public TextView texto;
        public TextView detalle;
        public ImageView imagen;

        public MiViewHolder(View itemView){
            super(itemView);
            texto = itemView.findViewById(R.id.texto);
            detalle = itemView.findViewById(R.id.detalle);
            imagen = itemView.findViewById(R.id.imageView);

        }
    }
}