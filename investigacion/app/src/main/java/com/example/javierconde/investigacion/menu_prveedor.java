package com.example.javierconde.investigacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu_prveedor extends AppCompatActivity {
Intent inASal, inVSal, inASer, inVSer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor);
    }

    public void agregarSalon(View view) {
        inASal = new Intent(menu_prveedor.this, agregarSalon.class);
        startActivity(inASal);
    }

    public void VerSalion(View view) {
        inVSal = new Intent(menu_prveedor.this, verSalones.class);
        startActivity(inVSal);
    }

    public void agregarServicio(View view) {
        inASer = new Intent(menu_prveedor.this, agregarServicio.class);
        startActivity(inASer);
    }

    public void verServicios(View view) {
        inVSer = new Intent(menu_prveedor.this, verServicio.class);
        startActivity(inVSer);
    }
}
