package com.example.yuka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InformacionNutricional implements Serializable {
    private int id;
    private String gramosAzucar;
    private String kcal;
    private String  gramosGrasa;
    private String  gramosSal;
    private String  gramosProteina;
    List<InformacionNutricional> infor = new ArrayList<InformacionNutricional>();

    public InformacionNutricional(int id,String  gramosAzucar, String  kcal, String  gramosGrasa, String  gramosSal, String  gramosProteina) {
        this.gramosAzucar = gramosAzucar;
        this.kcal = kcal;
        this.gramosGrasa = gramosGrasa;
        this.gramosSal = gramosSal;
        this.gramosProteina = gramosProteina;
        this.id=id;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String  getGramosAzucar() {
        return gramosAzucar;
    }

    public void setGramosAzucar(String  gramosAzucar) {
        this.gramosAzucar = gramosAzucar;
    }

    public String  getKcal() {
        return kcal;
    }

    public void setKcal(String  kcal) {
        this.kcal = kcal;
    }

    public String  getGramosGrasa() {
        return gramosGrasa;
    }

    public void setGramosGrasa(String  gramosGrasa) {
        this.gramosGrasa = gramosGrasa;
    }

    public String  getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(String  gramosSal) {
        this.gramosSal = gramosSal;
    }

    public String  getGramosProteina() {
        return gramosProteina;
    }

    public void setGramosProteina(String  gramosProteina) {
        this.gramosProteina = gramosProteina;
    }




}
