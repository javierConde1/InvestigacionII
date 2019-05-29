package com.example.javierconde.investigacion.entidades;

public class Salones {
    private Integer id_s;
    private String usuario_p;
    private String nombre_de_salon;
    private String tipo_de_evento;
    private Integer capacidad;
    private String direccion;

    public Salones(Integer id_s, String usuario_p, String nombre_de_salon, String tipo_de_evento, Integer capacidad, String direccion) {
        this.id_s = id_s;
        this.usuario_p = usuario_p;
        this.nombre_de_salon = nombre_de_salon;
        this.tipo_de_evento = tipo_de_evento;
        this.capacidad = capacidad;
        this.direccion = direccion;
    }

    public Integer getId_s() {
        return id_s;
    }

    public void setId_s(Integer id_s) {
        this.id_s = id_s;
    }

    public String getUsuario_p() {
        return usuario_p;
    }

    public void setUsuario_p(String usuario_p) {
        this.usuario_p = usuario_p;
    }

    public String getNombre_de_salon() {
        return nombre_de_salon;
    }

    public void setNombre_de_salon(String nombre_de_salon) {
        this.nombre_de_salon = nombre_de_salon;
    }

    public String getTipo_de_evento() {
        return tipo_de_evento;
    }

    public void setTipo_de_evento(String tipo_de_evento) {
        this.tipo_de_evento = tipo_de_evento;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}