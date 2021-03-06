package com.example.yukaaaa;

public class Productos {
    String id;
    String nombre;
    String compañia;
    String calificacion;
    String marca;
    String puntuacion,grAzucar,kcal,grGrasa,grSal,grProteina;

    public Productos(String id,String nombre, String compañia, String calificacion, String marca, String puntuacion, String grAzucar, String kcal, String grGrasa, String grSal, String grProteina) {

        this.nombre = nombre;
        this.id=id;
        this.compañia = compañia;
        this.calificacion = calificacion;
        this.marca = marca;
        this.puntuacion = puntuacion;
        this.grAzucar = grAzucar;
        this.kcal = kcal;
        this.grGrasa = grGrasa;
        this.grSal = grSal;
        this.grProteina = grProteina;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
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

    public String getGrAzucar() {
        return grAzucar;
    }

    public void setGrAzucar(String grAzucar) {
        this.grAzucar = grAzucar;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getGrGrasa() {
        return grGrasa;
    }

    public void setGrGrasa(String grGrasa) {
        this.grGrasa = grGrasa;
    }

    public String getGrSal() {
        return grSal;
    }

    public void setGrSal(String grSal) {
        this.grSal = grSal;
    }

    public String getGrProteina() {
        return grProteina;
    }

    public void setGrProteina(String grProteina) {
        this.grProteina = grProteina;
    }
}
