package com.example.yoso.mascota.pojo;

import com.example.yoso.mascota.R;

import java.util.ArrayList;

/**
 * POJO Y DATOS DUMMY
 * Created by yoso on 22/01/17.
 */

public class Mascota {
    // Atributos
    private String puntos;
    private String nombre;
    private int idDrawable;

    // Constructor
    public Mascota(int idDrawable, String nombre, String puntos) {
        this.idDrawable = idDrawable;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    // Métodos getters&setters
    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    // Declaración arralist de datos dummyl
    public static final ArrayList<Mascota> LISTA_MASCOTAS = new ArrayList<>();
    public static final ArrayList<Mascota> FOTO_MASCOTAS = new ArrayList<>();
    public static final ArrayList<Mascota> MASCOTAS_FAVORITAS = new ArrayList<>();

    static {
        LISTA_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "8"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.copito, "Copito", "3"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.dexter, "Dexter", "9"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.lucky, "Lucky", "7"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.lucy, "Lucy", "6"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.mini, "Mini", "4"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.niki, "Niki", "2"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.nina, "Nina","5"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.pinky, "Pinky", "1"));
        LISTA_MASCOTAS.add(new Mascota(R.drawable.toby, "Toby", "10"));

        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "5"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "0"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "3"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "10"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "2"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "3"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "5"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "6"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "8"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "1"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "4"));
        FOTO_MASCOTAS.add(new Mascota(R.drawable.alfie, "Alfie", "5"));

        MASCOTAS_FAVORITAS.add(new Mascota(R.drawable.alfie, "Alfie", "8"));
        MASCOTAS_FAVORITAS.add(new Mascota(R.drawable.lucy, "Lucy", "6"));
        MASCOTAS_FAVORITAS.add(new Mascota(R.drawable.toby, "Toby", "10"));
        MASCOTAS_FAVORITAS.add(new Mascota(R.drawable.niki, "Niki", "2"));
        MASCOTAS_FAVORITAS.add(new Mascota(R.drawable.nina, "Nina","5"));


    }


}


