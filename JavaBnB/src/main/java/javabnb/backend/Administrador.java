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
     * Constructor de la clase Administrador. 
     * No se necesita introducir ningún dato, ya que el correo y la clave del administrador son fijos por defecto.
     * Y si no existe un administrador guardado en archivo, se establece este como administrador.
     *
     */
    public Administrador() {
        /* 
        if (GestorInmueble.getAdmin() == null) {
            System.out.println("No hay administrador guardado, se establece el administrador por defecto");
            GestorInmueble.setAdmin(this);
        } else if (GestorInmueble.getAdmin() != null) {
            System.out.println("Ya hay un administrador guardado, se establece el administrador guardado");
            Administrador.correo = GestorInmueble.getAdmin().getCorreo();
            Administrador.clave = GestorInmueble.getAdmin().getClave();
        }
        */
    }
    
    
    /**
     * Devuelve el valor del correo del adminitrador
     *
     * @return the value of correo
     */
    public String getCorreo() {
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
    public String getClave() {
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
