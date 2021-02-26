package com.example.yuka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositorioProducto  {

    private static RepositorioProducto repositorio = new RepositorioProducto();
    private HashMap<Integer, Producto> productos = new HashMap<>();

    public static RepositorioProducto getInstance() {
        return repositorio;
    }


    private RepositorioProducto() {
        //Creamos nuestra lista de productos
        //1
        int x =0;
        saveProducto(new Producto(x, "Espinacas", "DIA", R.drawable.espinacas, "Bueno", "Gutarra", "68/100"));
        x++;
        //2
        saveProducto(new Producto(x, "Crema de espárragos", "Alcampo", R.drawable.crema_esparragos, "Bueno", "Gallina Blanca", "65/100"));
        x++;
        //3
        saveProducto(new Producto(x, "Crema caseta de calabaza", "Hipercor", R.drawable.crema_calabaza, "Regular", "Gallina Blanca", "51/100"));
        x++;
        //4
        saveProducto(new Producto(x, "Col troceada", "DIA", R.drawable.col_troceada, "Mediocre", "Gutarra", "35/100"));
        x++;
        //5
        saveProducto(new Producto(x, "Chips de trigo y chia", "Mercadona", R.drawable.chips_maizchia, "Mediocre", "Mios", "24/100"));
        x++;
        //6
        saveProducto(new Producto(x, "Chips de maiz y cebolla", "Mercadona", R.drawable.chips_maizcebolla, "Malo", "Mios", "42/100"));
        x++;
        //7
        saveProducto(new Producto(x, "Salsa Basilico", "El Corte Ingles", R.drawable.salsa_basilico, "Excelente", "Barilla", "87/100"));
        x++;
        //8
        saveProducto(new Producto(x, "Atun en Aceite de oliva ", "Alcampo", R.drawable.atun_oliva, "Excelente", "Calvo", "82/100"));
        x++;
        //9
        saveProducto(new Producto(x, "Alubia Blanca Vegana", "DIA", R.drawable.alubia_blanca, "Bueno", "Dia", "56 / 100"));
        x++;
        //10
        saveProducto(new Producto(x, "Almendras Fritas", "El Arbol", R.drawable.almendras_fritas, "Excelente", "Borges", "96/100"));
        x++;
        //11
        saveProducto(new Producto(x, "Alubias", "Mercadona", R.drawable.alubias, "Bueno", "Heinz", "67/100"));
        x++;
        //12
        saveProducto(new Producto(x, "Margarina", "Mercadona", R.drawable.margarina, "Excelente", "Hacendado", "56/100"));
        x++;
        //13
        saveProducto(new Producto(x, "Avena", "Mercadona", R.drawable.avena, "Mediocre", "Alitey", "26/100"));
        x++;
        //14
        saveProducto(new Producto(x, "Ensaladilla de cangrejo", "Mercadona", R.drawable.ensaladilla, "Excelente", "Hacendado", "98/100"));
        x++;
        //15
        saveProducto(new Producto(x, "Leche semidesnatada", "Mercadona", R.drawable.leche, "Bueno", "Hacendado", "76/100"));
        x++;
        //16
        saveProducto(new Producto(x, "Mozzarella fresca", "Mercadona", R.drawable.mozzarella, "Mediocre", "Hacendado", "69/100"));
        x++;
        //17
        saveProducto(new Producto(x, "Nesquick", "Mercadona", R.drawable.nesguik, "Horrible", "Nesquick", "4/100"));
        x++;
        //18
        saveProducto(new Producto(x, "Salmon ahumado", "Mercadona", R.drawable.salmon, "Bueno", "Ubago", "72/100"));
        x++;
        //19
        saveProducto(new Producto(x, "Sobrasada", "Mercadona", R.drawable.sobrasada, "Normal", "L'Illa", "48/100"));
        x++;
        //20
        saveProducto(new Producto(x, "Tomate frito", "Mercadona", R.drawable.tomate, "Excelente", "Hacendado", "99/100"));
        x++;
        //21
        saveProducto(new Producto(x, "Sandwich mixto a la plancha", "Mercadona", R.drawable.sandwich, "Excelente", "Hacendado", "79/100"));
        x++;
        //22
        saveProducto(new Producto(x, "Chorizo de pamplona", "Mercadona", R.drawable.chorizo, "Mediocre", "Hacendado", "36/100"));
        x++;
        //23
        saveProducto(new Producto(x, "Queso en lonchas", "Entrepinares", R.drawable.quesolonchas, "Bueno", "Hacendado", "66/100"));
        x++;
        //24
        saveProducto(new Producto(x, "Nuggets de pollo", "Mercadona", R.drawable.nuggets, "Excelente", "Preli", "90/100"));
        x++;
        //25
        saveProducto(new Producto(x, "Guisantes", "Mercadona", R.drawable.guisantes, "Bueno", "Hacendado", "80/100"));
        x++;
        //26
        saveProducto(new Producto(x, "Merluza congelada rodaja", "Mercadona", R.drawable.merluza, "Malo", "Mascato", "32/100"));
        x++;
        //27
        saveProducto(new Producto(x, "Cebolla congelada troceada", "Mercadona", R.drawable.cebolla, "Excelente", "Hacendado", "94/100"));
        x++;
        //28
        saveProducto(new Producto(x, "Sopa deshidratada cebolla", "Mercadona", R.drawable.sopacebolla, "Excelente", "Hacendado", "86/100"));
        x++;
        //29
        saveProducto(new Producto(x, "Salmon fresco", "Mercadona", R.drawable.salmonfresco, "Malo", "Hacendado", "30/100"));
        x++;
        //30
        saveProducto(new Producto(x, "Filetes de dorada", "Mercadona", R.drawable.dorada, "Malo", "De Lonja", "16/100"));

    }


    public List<Producto> getProducto() {
        return new ArrayList<>(productos.values());
    }
    private void saveProducto(Producto elProducto) {
        productos.put(elProducto.getId(), elProducto);
    }
}
