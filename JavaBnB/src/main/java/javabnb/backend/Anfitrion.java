package javabnb.backend;

//import java.io.Serializable; //implements Serializable redundante en esta clase
import java.util.ArrayList;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Anfitrion extends Persona {
    
    private boolean superanfitrion;
    private ArrayList<Inmueble> inmuebles;

    /**
     * Constructor de la clase anfitrion, se deben de introducir los datos del anfitrion de DNI, nombre, correo, clave y teléfono
     * El rango de superanfitrion se establece a false por defecto, y se cambia a true si la media de las calificaciones de los inmuebles del anfitrion es mayor que 4
     *
     * @param dni String con el dni del anfitrion
     * @param nombre String con el nombre del anfitrion
     * @param correo String con el correo del anfitrion
     * @param clave  String con la clave del anfitrion
     * @param telefono int con el telefono del anfitrion
     */
    public Anfitrion(String dni, String nombre, String correo, String clave, int telefono) {
        super(dni, nombre, correo, clave, telefono);
        this.superanfitrion = false; 
        this.inmuebles = new ArrayList<>();
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
     * Si no hay reseñas para calcular la calificación de la vivienda, se imprime un mensaje de error y se establece como no superanfitrion
     */
    public void updateSuperanfitrion() {
        double calificacionTotal = 0;
        for (Inmueble inmueble : inmuebles) {
            calificacionTotal += inmueble.getCalificacion();
        }
        try {
            calificacionTotal = calificacionTotal / inmuebles.size();
            if (calificacionTotal > 4) {
            superanfitrion = true;
            } else if (calificacionTotal < 4) {
            superanfitrion = false;
            }
        } catch (ArithmeticException e) {
            // Manejo division entre zero error
            System.err.println("Error: Division by zero => No hay reseñas para calcular la calificación de la vivienda");
            System.err.println("    Codigo de error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Devuelve una copia de la lista de inmuebles del anfitrion, para evitar modificar o alterar la original.
     *
     * @return copia de la lista de inmuebles en forma de ArrayList de Inmueble
     */
    public ArrayList<Inmueble> getInmuebles() {
        return new ArrayList<>(inmuebles);
    }

    /**
     * Intercambia una lista de inmuebles que tiene el anfitrion por completo por otra lista
     * REVISAR, modificacon se queda o no
     *
     * @param nuevaListaInmuebles nueva lista de inmuebles tipo ArrayList de Inmueble
     */
    public void setInmuebles(ArrayList<Inmueble> nuevaListaInmuebles) {
        this.inmuebles = nuevaListaInmuebles;
        this.updateSuperanfitrion();
    }

    /**
     * Agrega un inmueble a la lista de inmuebles del anfitrion
     *
     * @param nuevoInmueble nuevo inmueble del anfitrion tipo Inmueble
     */
    public void addInmueble(Inmueble nuevoInmueble) {
        inmuebles.add(nuevoInmueble);
        updateSuperanfitrion();
    }

    /**
     * Elimina un inmueble de la lista de inmuebles del anfitrion
     *
     * @param inmueble inmueble a eliminar de tipo Inmueble
     */
    public void removeInmueble(Inmueble inmueble) {
        inmuebles.remove(inmueble);
        updateSuperanfitrion();
    }

    /**
     * toString para el anfitrion
     *
     * @return datos del anfitrion en String
     */
    @Override
    public String toString() {
        return super.toString() + "Anfitrion{" + "superanfitrion=" + superanfitrion + '}';
    }

}
