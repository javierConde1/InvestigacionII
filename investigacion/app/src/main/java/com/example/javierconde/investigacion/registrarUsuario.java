package com.example.javierconde.investigacion;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.javierconde.investigacion.utilidades.utilidades;

public class registrarUsuario extends AppCompatActivity {
EditText edRegId, edRegUs, edRegCon;
Spinner privilegios;
    public static String sSpiner = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        edRegId = findViewById(R.id.edRegId);
        edRegUs = findViewById(R.id.edRegUs);
        edRegCon = findViewById(R.id.edRegCon);
       privilegios = findViewById(R.id.spPrivilegios);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.privilegios, android.R.layout.simple_spinner_item);
        privilegios.setAdapter(adapter);

        privilegios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sSpiner = parent.getItemAtPosition(position).toString();
                Toast.makeText(registrarUsuario.this, sSpiner, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void Registrar(View view) {
        registrarUsuarios();
    }

    private void registrarUsuarios() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "db_investigacion", null, 1);

        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(utilidades.ID, edRegId.getText().toString());
        values.put(utilidades.USUARIO, edRegUs.getText().toString());
        values.put(utilidades.CONTRASEÑA, edRegCon.getText().toString());
        values.put(utilidades.PRIVILEGIOS, sSpiner.toString());

        Long idResultante = db.insert(utilidades.TABLA_USUARIO,utilidades.ID,values);

        Toast.makeText(getApplicationContext(), "ID registro: " + idResultante, Toast.LENGTH_SHORT).show();
        finish();
    }

    public void Regresar(View view) {
        finish();

    }

}
