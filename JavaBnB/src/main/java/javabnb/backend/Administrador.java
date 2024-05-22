package javabnb.backend;

import java.io.Serializable;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Administrador implements Serializable{
    
    private static String correo = "admin@javabnb.com";
    private static String clave = "admin";
    
    /**
     * Devuelve el valor del correo del adminitrador
     * 
     *
     * @return the value of correo
     */
    public static String getCorreo() {
        return correo;
    }

    /**
     * Establece el valor del correo de administrador
     *
     * @param correo new value of correo
     */
    public static void setCorreo(String correo) {
        Administrador.correo = correo;
    }

    /**
     * Devuelve el valor de la clave del adminitrador
     *
     * @return clave tipo String
     */
    public static String getClave() {
        return clave;
    }

    /**
     * Establece el valor de la clave de administrador
     *
     * @param clave nuevo valor de la clave tipo String
     */
    public static void setClave(String clave) {
        Administrador.clave = clave;
    }

    /**
     * toString para Administrador
     * 
     * @return los datos del administrador
     */
    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}';
    }

}
