package javabnb.backend;

/**
 *
 * @author ALEJANDRO
 */
public class Direccion {
    
    private String calle;
    private int numero;
    private int codigoPostal;
    private String ciudad;
    private String provincia;
    private String pais;

    /**
     * Constructor de la clase direccion, se deben de introducir los datos de calle, numero, codigo postal, ciudad, provincia y pais
     *
     * @param calle
     * @param numero
     * @param codigoPostal
     * @param ciudad 
     * @param provincia
     * @param pais
     */
    public Direccion(String calle, int numero, int codigoPostal, String ciudad, String provincia, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
    }

    /**
     * Get the value of pais
     *
     * @return the value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Set the value of pais
     *
     * @param pais new value of pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Get the value of provincia
     *
     * @return the value of provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Set the value of provincia
     *
     * @param provincia new value of provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Get the value of ciudad
     *
     * @return the value of ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Set the value of ciudad
     *
     * @param ciudad new value of ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Get the value of codigoPostal
     *
     * @return the value of codigoPostal
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Set the value of codigoPostal
     *
     * @param codigoPostal new value of codigoPostal
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Get the value of calle
     *
     * @return the value of calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Set the value of calle
     *
     * @param calle new value of calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", provincia=" + provincia + ", pais=" + pais + '}';
    }

}
