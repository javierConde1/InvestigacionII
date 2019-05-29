package com.example.javierconde.investigacion.entidades;

public class usuario {

    private Integer id;
    private String usuario;
    private String contraseña;
    private String privilegio;

    public usuario(Integer id, String usuario, String contraseña, String privilegio) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.privilegio = privilegio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
}