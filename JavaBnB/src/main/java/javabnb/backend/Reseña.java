package javabnb.backend;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Reseña {
    
    private Persona usuario; //QuizaS ES NECESARIA
    private int calificacion;
    private String comentario;

    /**
     * Constructor de la clase reseña, se deben de introducir los datos calificacion y comentario
     *
     * @param calificacion
     * @param comentario
     */
    public Reseña(int calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    /**
     * Get the value of comentario
     *
     * @return the value of comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Set the value of comentario
     *
     * @param comentario new value of comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Get the value of calificacion
     *
     * @return the value of calificacion
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Set the value of calificacion
     *
     * @param calificacion new value of calificacion
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Rese\u00f1a{" + "calificacion=" + calificacion + ", comentario=" + comentario + '}';
    }

}
