package javabnb.backend;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Direccion {
    
    private String calle;
    private int numero;
    private String detallesDireccion;
    private int codigoPostal;
    private String ciudad;
    private String provincia;
    private String pais;

    /**
     * Constructor de la clase direccion, se deben de introducir los datos de calle, numero, detalles de direccion, codigo postal, ciudad, provincia y pais
     *
     * @param calle String
     * @param numero int
     * @param detallesDireccion String
     * @param codigoPostal int
     * @param ciudad String
     * @param provincia String
     * @param pais String
     */
    public Direccion(String calle, int numero, String detallesDireccion, int codigoPostal, String ciudad, String provincia, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.detallesDireccion = detallesDireccion;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    /**
     * Devuelve el valor de pais
     *
     * @return valor de pais en tipo String
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el valor de pais
     *
     * @param pais  nuevo valor de pais en tipo String
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *  Get the value of provincia
     *
     * @return  the value of provincia en tipo String
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Establece el valor de provincia
     *
     * @param provincia nuevo valor de provincia en tipo String
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Devuelve el valor de ciudad
     *
     * @return valor de ciudad en tipo String
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece el valor de ciudad
     *
     * @param ciudad nuevo valor de ciudad en tipo String
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve el valor de codigoPostal
     *
     * @return valor de codigoPostal en tipo int
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Establece el valor de codigoPostal
     *
     * @param codigoPostal nuevo valor de codigoPostal en tipo int
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Devuelve el valor de detalles de la direccion como piso, puerta, etc
     *
     * @return valor de detallesDireccion en tipo String
     */
    public String getDetallesDireccion() {
        return detallesDireccion;
    }

    /**
     * Establece el valor de detalles de la direccion como piso, puerta, etc
     *
     * @param detallesDireccion nuevo valor de detallesDireccion en tipo String
     */
    public void setDetallesDireccion(String detallesDireccion) {
        this.detallesDireccion = detallesDireccion;
    }

    /**
     * Devuelve el valor de numero de la casa
     *
     * @return valor de numero en tipo int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el valor de numero de la casa
     *
     * @param numero nuevo valor de numero en tipo int
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el valor de calle
     *
     * @return valor de calle en tipo String
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el valor de calle
     *
     * @param calle nuevo valor de calle en tipo String
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Devuelve la direccion completa
     *
     * @return direccion completa en tipo String
     */
    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", detalles=" + detallesDireccion + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + '}';
    }

}
