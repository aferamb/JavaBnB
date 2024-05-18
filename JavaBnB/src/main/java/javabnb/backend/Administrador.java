package javabnb.backend;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Administrador {
    
    private String correo = "admin@javabnb.com";
    private String clave = "admin";

    
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
    public void setClave(String clave) {
        this.clave = clave;
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
    public void setCorreo(String correo) {
        this.correo = correo;
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
