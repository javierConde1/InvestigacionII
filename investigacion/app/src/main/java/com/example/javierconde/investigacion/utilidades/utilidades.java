package com.example.javierconde.investigacion.utilidades;

public class utilidades {
    public static final String TABLA_USUARIO = "tabla_usuario";
    public static final String ID = "id";
    public static final String USUARIO = "usuario";
    public static final String CONTRASEÑA = "contraseña";
    public static final String TELEFONO = "telefono";
    public static final String PRIVILEGIOS = "privilegios";
    public static final String CREAR_TABLA_USUARIO = "CREATE TABLE "+TABLA_USUARIO+" ("+ID+" INTEGER, "+USUARIO+" TEXT, "+CONTRASEÑA+" TEXT, " +TELEFONO+" TEXT, " +PRIVILEGIOS+" TEXT)";
    //public static final String select = "select"+PRIVILEGIOS+" from"+TABLA_USUARIO;

    public static final String TABLA_SALONES= "tabla_proveedor";
    public static final String ID_S = "id_salon";
    public static final String USUARIO_P = "usuario_s";
    public static final String NOMBRE_DE_SALON = "nombre_s";
    public static final String TIPO_DE_EVENTO = "tipo_s";
    public static final String CAPACIDAD = "capacidad";
    public static final String DIRECCION = "direccion";

    public static final String CREAR_TABLA_SALONES= "CREATE TABLE "+TABLA_SALONES+" ("+ID_S+" INTEGER, "+USUARIO_P+" TEXT, "+NOMBRE_DE_SALON+" TEXT, "+TIPO_DE_EVENTO+" TEXT, "+CAPACIDAD+" INTEGER, " +DIRECCION+" TEXT)";
}
