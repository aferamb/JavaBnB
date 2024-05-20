package javabnb.backend;

import java.io.Serializable;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Reseña implements Serializable{
    
    private ClienteParticular usuario;
    private int calificacion;
    private String comentario;

    /**
     * Constructor de la clase Reseña. Se deben introducir los datos del cliente particular que realiza la reseña, la calificación de la reseña (entre 1 y 5),
     * el comentario de la reseña y el inmueble que se está reseñando. La instancia de la reseña se añade a la lista de reseñas del inmueble, pero el inmueble que se reseña
     * no se almacena en la reseña.
     * 
     * @param usuario el cliente particular que realiza la reseña
     * @param calificacion la calificación de la reseña (entre 1 y 5)
     * @param comentario el comentario de la reseña
     * @param inmueble el inmueble que se está reseñando 
     */
    public Reseña(ClienteParticular usuario, int calificacion, String comentario, Inmueble inmueble) {
        this.usuario = usuario;
        this.calificacion = calificacion;
        this.comentario = comentario;
        inmueble.addReseña(this);
    }

    /**
     * Devuelve el cliente particular que realizó la reseña.
     * 
     * @return el cliente particular que realizó la reseña
     */
    public ClienteParticular getUsuario() {
        return usuario;
    }

    /**
     * Establece el cliente particular que realizó la reseña.
     * 
     * @param usuario el nuevo cliente particular que realizó la reseña
     */
    public void setUsuario(ClienteParticular usuario) {
        this.usuario = usuario;
    }

    /**
     * Devuelve la calificación de la reseña.
     * 
     * @return la calificación de la reseña en formato int
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación de la reseña.
     * 
     * @throws IllegalArgumentException si la calificación no está entre 1 y 5
     * @param calificacion la nueva calificación de la reseña en formato int entre 1 y 5
     */
    public void setCalificacion(int calificacion) throws IllegalArgumentException {
        if (calificacion < 1 || calificacion > 5) {
            throw new IllegalArgumentException("La calificación debe ser un número entre 1 y 5");
        }
        this.calificacion = calificacion;
        // En el caso de que diesemos opcion a modificar las reseñas, habría que actualizar la media de las calificaciones del inmueble
    }


    /**
     * Devuelve el comentario de la reseña.
     * 
     * @return el comentario de la reseña en formato String
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el comentario de la reseña.
     * 
     * @param comentario el nuevo comentario de la reseña en formato String
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Reseña{" + "usuario=" + usuario.getNombre() + ", calificacion=" + calificacion + ", comentario = " + comentario + '}';
    }

}
