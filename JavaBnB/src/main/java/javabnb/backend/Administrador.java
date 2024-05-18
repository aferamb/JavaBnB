package javabnb.backend;

/**
 *
 * @author ALEJANDRO
 */
public class Administrador {
    
    private String correo = "admin@javabnb.com";
    private String clave = "admin";

    /**
     * Get the value of clave
     *
     * @return the value of clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * Set the value of clave
     *
     * @param clave new value of clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Get the value of correo
     *
     * @return the value of correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Set the value of correo
     *
     * @param correo new value of correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}';
    }

}
