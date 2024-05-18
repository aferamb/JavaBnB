package javabnb.backend;

import java.util.ArrayList;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Anfitrion extends Persona {
    
    private boolean superanfitrion = false;
    private ArrayList<Inmueble> inmuebles;

    /**
     * MODIFICAR hacer automatico superanfitrion
     * Constructor de la clase anfitrion, se deben de introducir los datos del cliente de DNI, nombre, correo, clave y teléfono
     *
     * @param dni
     * @param nombre
     * @param correo
     * @param clave 
     * @param telefono
     */
    public Anfitrion(String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.superanfitrion = superanfitrion; 
    }

    /**
     * Get the value of superanfitrion
     *
     * @return the value of superanfitrion
     */
    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    /**
     * MODIFICAR para que se haga de manera automatica con las reseñas
     *
     * @param superanfitrion new value of superanfitrion
     */
    public void setSuperanfitrion(boolean superanfitrion) {
        this.superanfitrion = superanfitrion;
    }

}
