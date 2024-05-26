package javabnb.backend;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Clase que representa una persona de la aplicacion.´
 * Una persona es un usuario de la aplicacion que puede ser tanto un anfitrion como un cliente particular.
 * 
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Persona implements Serializable{
    
    private String dni;
    private String nombre;
    private String correo;
    private String clave;
    private int telefono;
    private LocalDate fechaRegistro;

    /**
     * Constructor de la clase persona, se deben de introducir los datos de la persona de DNI, nombre, correo, clave y teléfono
     * La fecha de registro se establece automáticamente al día de la creación de la persona
     *
     * @param dni String con el DNI de la persona
     * @param nombre String con el nombre de la persona
     * @param correo String con el correo de la persona
     * @param clave  String con la clave de la persona
     * @param telefono int con el teléfono de la persona
     */
    public Persona(String dni, String nombre, String correo, String clave, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
        this.telefono = telefono;
        this.fechaRegistro = LocalDate.now(); 
    }

    /**
     * Devuelve el valor de dni
     *
     * @return valor de dni en tipo String
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el valor de dni
     *
     * @param dni nuevo valor de dni en tipo String
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el valor de nombre
     *
     * @return valor de nombre en tipo String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el valor de nombre
     *
     * @param nombre nuevo valor de nombre en tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor de correo
     *
     * @return valor de correo en tipo String
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el valor de correo
     *
     * @param correo nuevo valor de correo en tipo String
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve el valor de clave
     *
     * @return valor de clave en tipo String
     */
    public String getClave() {
        return clave;
    }

// Igual podemos poner lo de requisitos de la contraseña aquí

    /**
     * Establece el valor de clave
     *
     * @param clave nuevo valor de clave en tipo String
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Devuelve el valor de telefono
     *
     * @return valor de telefono en tipo int
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el valor de telefono
     *
     * @param telefono nuevo valor de telefono en tipo int
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el valor de fechaRegistro
     * 
     *
     * @return valor de fechaRegistro en tipo LocalDate
     */
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Establece el valor de fechaRegistro
     *
     * @param fechaRegistro nuevo valor de fechaRegistro en tipo LocalDate
     */
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro; //quizas necesite un bloque try-catch
    }

    /**
     * Devuelve un resumen de los datos de la persona
     *
     * @return resumen de los datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", telefono=" + telefono + ", fechaRegistro=" + fechaRegistro + '}';
    }

}
