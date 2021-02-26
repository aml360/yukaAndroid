package com.example.yuka;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

;

import com.bumptech.glide.Glide;

import java.util.List;

public class ProductoAdapter extends ArrayAdapter<Producto> {
    public ProductoAdapter(Context context, List<Producto> objetos){
        super(context,0,objetos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater =(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView=inflater.inflate(R.layout.itemproducto,parent,false);
        }

        ImageView avatar = (ImageView)convertView.findViewById(R.id.imagenProd);
        TextView nombre = (TextView)convertView.findViewById(R.id.textitemNombre);
        TextView marca = (TextView)convertView.findViewById(R.id.textoItemMarca);
        TextView calificacion = (TextView)convertView.findViewById(R.id.textoitemCalificacion);

        Producto producto = getItem(position);
        Glide.with(getContext()).load(producto.getFoto()).into(avatar);
        nombre.setText(producto.getNombre());
        marca.setText(producto.getMarca());
        calificacion.setText(producto.getCalificacion());




        return convertView;
    }
}
