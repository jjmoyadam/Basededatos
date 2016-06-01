package com.example.cursodam.basededatos.Modelo;

/**
 * Clase modelo para la tabla de Socios
 */
public class Socios {

    public int id_socio;
    public String dni;
    public String nombre;
    public String apellidos;
    public String direccion;
    public String telefono;

    //constructor de la clase


    public Socios(int id_socio, String dni, String nombre, String apellidos, String direccion, String telefono) {

        this.id_socio = id_socio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
