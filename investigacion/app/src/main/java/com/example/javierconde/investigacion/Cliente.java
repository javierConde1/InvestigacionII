package com.example.javierconde.investigacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Cliente extends AppCompatActivity {
ImageButton btnAgregarEvento, btnVerEventos, btnBuscarServicio, btnVerServicio;
Intent inAgregarEv, inVerEv, inBuscarSe, inVerSer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void agregarEvento(View view) {
        inAgregarEv = new Intent(Cliente.this, agregarEvento.class);
        startActivity(inAgregarEv);
    }

    public void VerEvento(View view) {
        inVerEv = new Intent(Cliente.this, viewEvento.class);
        startActivity(inVerEv);
    }

    public void buscarServicio(View view) {
        inBuscarSe = new Intent(Cliente.this, searchServicio.class);
        startActivity(inBuscarSe);
    }

    public void verServicio(View view) {
        inVerSer = new Intent(Cliente.this, viewServicio.class);
        startActivity(inVerSer);
    }
}
