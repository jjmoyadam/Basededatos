package com.example.cursodam.basededatos.Fachada;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CursoDam on 31/05/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME="contactos.db";
    private static final int VERSION=1;

    //constuctor de la base de datos
    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DataBaseManager.CREAR_SOCIO);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
