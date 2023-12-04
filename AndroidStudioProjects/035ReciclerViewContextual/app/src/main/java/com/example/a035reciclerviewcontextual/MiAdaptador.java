package com.example.a035reciclerviewcontextual;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.MiViewHolder> implements SelectMode {

    AdapterView.OnItemSelectedListener mListener;

    private List<Datos> nameList;

    private SparseArray<Boolean> selectedList = new SparseArray<>();
    public MiAdaptador(List<Datos> list){
        nameList = list;
    }

    public void remove(int position){
        nameList.remove(position);
        //no se si cambiar por notify datasetchange
        //notifyItemRemoved(position);
        notifyDataSetChanged();
    }

    //cuando hago click en el menu borrar todos
    public void deleteAllSelected(){
        if(selectedList.size() == 0){
            return;
        }
        for(int index = nameList.size() - 1; index >=0; index++){
            if(selectedList.get(index, false)){
                selectedList.remove(index);
            }
        }
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
    public void onBindViewHolder(@NonNull MiViewHolder holder, @SuppressLint("RecyclerView") int position) {
        //cargar dos cadenas en dos textviews
        final Datos cadenas= nameList.get(position);
        holder.texto.setText(cadenas.getNombre());
        holder.detalle.setText(cadenas.getDescripcion());
        holder.imagen.setImageResource(cadenas.getImagen());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
           /* @Override
            public void onClick(View v) {
                remove(position);
            }*/

            @Override
            public void onClick(View v) {
                holder.itemView.setSelected(!holder.itemView.isSelected());
            }
        });

        }


    @Override
    public int getItemCount() {
        if (nameList == null){
            return 0;
        }else {
            return nameList.size();
        }
    }

    public void onSelect(){
        if(mListener != null){
            mListener.onItemSelected(List,View, 0,                     );
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