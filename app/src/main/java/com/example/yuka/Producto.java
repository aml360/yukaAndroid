package com.example.yuka;

import java.io.Serializable;

public class Producto implements Serializable {
    private int id;
    private String nombre;
    private String nombreCompañia;
    private int foto;
    private String calificacion;
    private String marca;
    private String puntuacion;

    //Constructor


    public Producto(int id, String nombre, String nombreCompañia, int foto, String calificacion, String marca, String puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCompañia = nombreCompañia;
        this.foto = foto;
        this.calificacion = calificacion;
        this.marca = marca;
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompañia() {
        return nombreCompañia;
    }

    public void setNombreCompañia(String nombreCompañia) {
        this.nombreCompañia = nombreCompañia;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
}
