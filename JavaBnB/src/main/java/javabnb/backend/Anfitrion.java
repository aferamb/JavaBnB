package javabnb.backend;

import java.util.ArrayList;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Anfitrion extends Persona {
    
    private boolean superanfitrion;
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
        this.superanfitrion = false; 
    }

    /**
     * Devuelve true si el anfitrion es superanfitrion y false si no lo es
     *
     * @return true o false si es superanfitrion o no
     */
    public boolean isSuperanfitrion() {
        return superanfitrion;
    }

    /**
     * Establece si el anfitrion tiene el rango de superanfitrion o no.
     * Esta funcion es llamada cada vez que un inmueble del anfitrion recive una reseña, calcula la media de las calificaciones de los inmuebles del anfitrion,
     * y si es mayor que 4 se establece como superanfitrion (true), si es menor que 4 se establece como no superanfitrion (false)
     */
    public void updateSuperanfitrion() {
        double calificacionTotal = 0;
        for (Inmueble inmueble : inmuebles) {
            calificacionTotal += inmueble.getCalificacion();
        }
        if (calificacionTotal > 4) {
            superanfitrion = true;
        } else if (calificacionTotal < 4) {
            superanfitrion = false;
        }
    }

    /**
     * Devuelve una copia de la lista de inmuebles del anfitrion, para evitar modificar o alterar la original.
     *
     * @return copia de la lista de inmuebles en forma de ArrayList
     */
    public ArrayList<Inmueble> getInmuebles() {
        return new ArrayList<>(inmuebles);
    }

    /**
     * Intercambia una lista de inmuebles que tiene el anfitrion por completo por otra lista
     *
     * @param nuevaListaInmuebles nueva lista de inmuebles tipo ArrayList
     */
    public void setInmuebles(ArrayList<Inmueble> nuevaListaInmuebles) {
        this.inmuebles = nuevaListaInmuebles;
    }

    /**
     * Agrega un inmueble a la lista de inmuebles del anfitrion
     *
     * @param nuevoInmueble nuevo inmueble del anfitrion tipo Inmueble
     */
    public void addInmueble(Inmueble nuevoInmueble) {
        inmuebles.add(nuevoInmueble);
    }

    @Override
    public String toString() {
        return "Anfitrion{" + "superanfitrion=" + superanfitrion + ", inmuebles=" + inmuebles + '}';
    }

}
