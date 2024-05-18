package javabnb.backend;
import java.time.LocalDate;

/**
 *
 * @author ALEJANDRO
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;
    private LocalDate fechaRegistro;

    /**
     * Constructor de la clase cliente particular se deben de introducir los datos del cliente de DNI, nombre, correo, clave y teléfono
     *
     * @param dni
     * @param nombre
     * @param correo
     * @param clave 
     * @param telefono
     */
    public Persona(String dni, String nombre, String correo, String clave, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro; // MODIFICAR para que al crearlo se establezca la fecha actual
    }

    /**
     * Get the value of fechaRegistro
     *
     * @return the value of fechaRegistro
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Set the value of fechaRegistro
     *
     * @param fechaRegistro new value of fechaRegistro
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

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

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of dni
     *
     * @return the value of dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Set the value of dni
     *
     * @param dni new value of dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro + '}';
    }

}
