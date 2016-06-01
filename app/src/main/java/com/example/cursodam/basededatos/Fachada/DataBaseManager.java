package com.example.cursodam.basededatos.Fachada;

/**
 * Created by CursoDam on 31/05/2016.
 */
public class DataBaseManager {

    //CAMPOS DE LA TABLA CONTADOR
    private static final String TABLA_SOCIOS="Socio";
    //valores
    private static final String ID_SOCIO = "id";
    private static final String DNI = "dni";
    private static final String NOMBRE = "nombre";
    private static final String APELLIDOS = "apellidos";
    private static final String DIRECCION = "direccion";
    private static final String TELEFONO = "telefono";

    //ejecucion de la tabla
    //CREATE TABLE "Socio"
    // ("id_socio" INTEGER PRIMARY KEY AUTOINCREMENT,
    // "nombre" TEXT NOT NULL, "apellidos" TEXT NOT NULL,
    // "direccion" TEXT NOT NULL,
    // "telefono" INTEGER,
    // "dni" TEXT NOT NULL UNIQUE)

    public static final String CREAR_SOCIO="CREATE TABLE "+TABLA_SOCIOS+
            " ("+ID_SOCIO+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            DNI+" TEXT NOT NULL,"+
            NOMBRE+" TEXT NOT NULL,"+
            APELLIDOS+" TEXT NOT NULL,"+
            DIRECCION+" TEXT NOT NULL,"+
            TELEFONO+" INTEGER);";


    //CAMPOS DE LA TABLA CONTADOR
    private static final String TABLA_CONTADOR="Contador";
    private static final String ID_CONTADOR="id_contador";
    private static final String ID_SOCIO_FK="id_socio";
    private static final String ID_ARQUETA_FK="id_arqueta";

    //CREATE TABLE "Contadores" ("id_contador" INTEGER PRIMARY KEY,
    // "id_socio" INTEGER REFERENCES "Socio" ("id_socio") ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE,
    // "id_arqueta" INTEGER REFERENCES "Arqueta" ("id_arqueta") ON UPDATE CASCADE DEFERRABLE)

    public static final String CREAR_CONTADORES="CREATE TABLE "+TABLA_CONTADOR+
            " ("+ID_CONTADOR+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            ID_SOCIO_FK+" INTEGER REFERENCES "+TABLA_SOCIOS+"("+ID_SOCIO+")"+" ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE,"+
            ID_ARQUETA_FK+" INTEGER REFERENCES "+TABLA_SOCIOS+"("+ID_SOCIO+")"+" ON DELETE CASCADE ON UPDATE CASCADE DEFERRABLE,"+
            APELLIDOS+" TEXT NOT NULL,"+
            DIRECCION+" TEXT NOT NULL,"+
            TELEFONO+" INTEGER);";


    //CAMPOS DE LA TABLA ARQUETA

    private static final String TABLA_ARQUETA="Contador";
    private static final String ID_ARQUETA="id_contador";
    private static final String PARAJE="paraje";
    private static final String LATITUD="latitud";
    private static final String LONGITUD="longitud";

    //sentencia sql
    //CREATE TABLE "Arqueta" ("id_arqueta" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE,
    // "paraje" TEXT,
    // "latitud" TEXT,
    // "longitud" TEXT)

    public static final String CREAR_ARQUETA="CREATE TABLE "+TABLA_ARQUETA+
            " ("+ID_ARQUETA+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            PARAJE+" TEXT NOT NULL,"+
            LATITUD+" TEXT NOT NULL,"+
            LONGITUD+" TEXT NOT NULL);";






}
