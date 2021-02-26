package com.example.yuka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Producto> arrayProd;
    private ArrayList<InformacionNutricional> arrayInfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        ListView laLista;
        laLista = (ListView) this.findViewById(R.id.listaProductos);
        arrayProd= (ArrayList<Producto>) RepositorioProducto.getInstance().getProducto();
        arrayInfo= (ArrayList<InformacionNutricional>) RepoInfo.getInstance().getProducto();
        ArrayAdapter<Producto> miAdapter;
        miAdapter= new ProductoAdapter(this,arrayProd);
        laLista.setAdapter(miAdapter);
        laLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("nombre",arrayProd.get(position).getNombre().toString());
                intent.putExtra("marca",arrayProd.get(position).getMarca().toString());
                intent.putExtra("imagen",arrayProd.get(position).getFoto());
                intent.putExtra("puntuacion",arrayProd.get(position).getPuntuacion().toString());
                intent.putExtra("cali",arrayProd.get(position).getCalificacion().toString());
                intent.putExtra("azucar",arrayInfo.get(position).getGramosAzucar().toString());
                intent.putExtra("kcal",arrayInfo.get(position).getKcal().toString());
                intent.putExtra("grasa",arrayInfo.get(position).getGramosGrasa().toString());
                intent.putExtra("sal",arrayInfo.get(position).getGramosSal().toString());
                intent.putExtra("proteina",arrayInfo.get(position).getGramosProteina());
                intent.putExtra("imagen",arrayProd.get(position).getFoto());

                startActivity(intent);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camara = new Intent (MainActivity.this, Camara.class);
                startActivity(camara);
            }
        });


    }



}