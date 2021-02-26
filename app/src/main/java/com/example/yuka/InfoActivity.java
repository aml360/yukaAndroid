package com.example.yuka;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity{
    private Producto item;
    private InformacionNutricional info;
    private ImageView imagen;
    private TextView producto,marca,puntuacion,calificacion,azucar,valor,grasa,sal,proteina;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infoproducto);

        imagen=(ImageView)findViewById(R.id.imagenProducto);
        producto=(TextView)findViewById(R.id.textoProducto);
        marca = (TextView)findViewById(R.id.textoMarca);
        puntuacion=(TextView)findViewById(R.id.textoPuntuacion);
        calificacion=(TextView)findViewById(R.id.textoCalificacion);
        azucar=(TextView)findViewById(R.id.textAzucar);
        valor=(TextView)findViewById(R.id.textValorEnergia);
        grasa=(TextView)findViewById(R.id.textGrasa);
        sal=(TextView)findViewById(R.id.textSal);
        proteina=(TextView)findViewById(R.id.textProteina);
        String nombre = getIntent().getStringExtra("nombre");
        producto.setText(nombre);
        String marcatxt = getIntent().getStringExtra("marca");
        marca.setText(marcatxt);
        String puntuaciontxt=getIntent().getStringExtra("puntuacion");
        puntuacion.setText(puntuaciontxt);
        String calitxt=getIntent().getStringExtra("cali");
        calificacion.setText(calitxt);
        String azucattxt= getIntent().getStringExtra("azucar");
        azucar.setText(azucattxt);
        String valortxt=getIntent().getStringExtra("kcal");
        valor.setText(valortxt);
        String grasatxt=getIntent().getStringExtra("grasa");
        grasa.setText(grasatxt);
        String saltxt = getIntent().getStringExtra("sal");
        sal.setText(saltxt);
        String proteinatxt = getIntent().getStringExtra("proteina");
        proteina.setText(proteinatxt);
        imagen.setImageResource(getIntent().getIntExtra("imagen",0));
    }
}
