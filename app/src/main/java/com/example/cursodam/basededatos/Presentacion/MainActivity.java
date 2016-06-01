package com.example.cursodam.basededatos.Presentacion;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cursodam.basededatos.Fachada.DataBaseHelper;
import com.example.cursodam.basededatos.R;

public class MainActivity extends AppCompatActivity {

    private Button btdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DataBaseHelper dataBaseHelper=new DataBaseHelper(this);
        //la devuelve
        SQLiteDatabase bd=dataBaseHelper.getWritableDatabase();

        btdelete=(Button)findViewById(R.id.btdeletebd);

        btdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    deleteDatabase("contactos");
                    Toast tmensaje = Toast.makeText(getApplication(), "Borrado de la base de datos", Toast.LENGTH_SHORT);
                    tmensaje.show();
                }catch (Exception ex){

                    Toast tmensaje = Toast.makeText(getApplication(), "No hay base de datos que borrar", Toast.LENGTH_LONG);
                    tmensaje.show();
                }

            }
        });

    }
}
