package com.example.javierconde.investigacion;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.javierconde.investigacion.utilidades.utilidades;

public class Principal extends AppCompatActivity {
Intent inCliente, inProveedor;
EditText edInUs, edInCon;
ConexionSQLiteHelper conn;
    public static String sUsuario = "";
    public static String sContraseña = "";
    public static String sPrivilegios = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edInUs = findViewById(R.id.edInUs);
        edInCon = findViewById(R.id.edInCon);
         conn = new ConexionSQLiteHelper(getApplicationContext(), "db_investigacion", null, 1);

    }
    public void Iniciar(View view) {

        String Usuario = edInUs.getText().toString();
        String Contraseña = edInCon.getText().toString();
        Consultar();
        /*Intent Ingresar = new Intent(Principal.this, Cliente.class);
        startActivity(Ingresar);*/

        if(Usuario.equals(sUsuario) && Contraseña.equals(sContraseña) && sPrivilegios.equals("Cliente")){
            Intent Ingresar = new Intent(Principal.this, Cliente.class);
            startActivity(Ingresar);
        }else if(Usuario.equals(sUsuario) && Contraseña.equals(sContraseña) && sPrivilegios.equals("menu_prveedor")) {
            Intent Ingresar = new Intent(Principal.this, menu_prveedor.class);
            startActivity(Ingresar);
        }else{
            Toast.makeText(Principal.this, "Usuario no existe", Toast.LENGTH_SHORT).show();
        }


    }

    public void Consultar(){
        SQLiteDatabase db=conn.getReadableDatabase();
        String[] parametros = {edInUs.getText().toString()};
        String[] campos = {utilidades.USUARIO,utilidades.CONTRASEÑA, utilidades.PRIVILEGIOS};
        Cursor cursor = db.query(utilidades.TABLA_USUARIO, campos, utilidades.USUARIO+"=?", parametros, null, null, null);

        cursor.moveToFirst();
        sUsuario = cursor.getString(0);
        sContraseña = cursor.getString(1);
        sPrivilegios = cursor.getString(2);

        Toast.makeText(Principal.this, cursor.getString(0),Toast.LENGTH_SHORT).show();
        Toast.makeText(Principal.this, cursor.getString(1),Toast.LENGTH_SHORT).show();
        Toast.makeText(Principal.this, cursor.getString(2),Toast.LENGTH_SHORT).show();

    }

    public void Registrar(View view) {
        Intent Registrar = new Intent(Principal.this, registrarUsuario.class);
        startActivity(Registrar);
    }


}
