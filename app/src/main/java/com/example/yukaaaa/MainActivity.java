package com.example.yukaaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText etNombre,etCompañia,etCalificacion,etMarca,etPuntuacion,etGrasa,etKcal,etAzucar,etSal,etProteina;
    Button btnCrear;
    private DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resgistrar_producto);
        db= FirebaseDatabase.getInstance().getReference("PRODUCTOS YUKA");
        etNombre=(EditText)findViewById(R.id.etNombre);
        etCompañia=(EditText)findViewById(R.id.etCompañia);
        etCalificacion=(EditText)findViewById(R.id.etCalificacion);
        etMarca=(EditText)findViewById(R.id.etMarca);
        etPuntuacion=(EditText)findViewById(R.id.etPuntuacion);
        etGrasa=(EditText)findViewById(R.id.etGrasa);
        etKcal=(EditText)findViewById(R.id.etKcal);
        etAzucar=(EditText)findViewById(R.id.etAzucar);
        etSal=(EditText)findViewById(R.id.etSal);
        etProteina=(EditText)findViewById(R.id.etProteina);
        btnCrear=(Button)findViewById(R.id.btnCrear);
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registarProducto();
            }
        });
    }


    public void registarProducto (){
            String nombre= etNombre.getText().toString();
            String compañia=etCompañia.getText().toString();
            String calificacion=etCalificacion.getText().toString();
            String marca=etMarca.getText().toString();
            String puntuacion = etPuntuacion.getText().toString();
            String  grasa=etGrasa.getText().toString();
            String kcal = etKcal.getText().toString();
            String azucar=etAzucar.getText().toString();
            String sal = etSal.getText().toString();
            String proteina=etProteina.getText().toString();

            String id = db.child("Producto").push().getKey();
            Productos producto = new Productos(id,nombre,compañia,calificacion,marca,puntuacion,azucar,kcal,grasa,sal,proteina);
            db.child("Productos").child(id).setValue(producto);
            Toast.makeText(this,"Producto Registrado",Toast.LENGTH_SHORT).show();

    }
}