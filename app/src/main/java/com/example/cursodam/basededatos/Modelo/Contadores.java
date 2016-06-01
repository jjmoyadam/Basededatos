package com.example.cursodam.basededatos.Modelo;

/**
 * Created by CursoDam on 31/05/2016.
 */
public class Contadores {
    public int id_contador;
    public int id_socio;
    public int id_arqueta;


    //constuctor de la clase

    public Contadores(int id_contador, int id_socio, int id_arqueta) {
        this.id_contador = id_contador;
        this.id_socio = id_socio;
        this.id_arqueta = id_arqueta;
    }
}
