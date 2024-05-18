package javabnb.backend;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Reseña {
    
    private ClienteParticular usuario; //Igual es mejor hacerlo con un String, con el objeto cliente particular luego abria que extraer el nombre
    private int calificacion;
    private String comentario;

    /**
     * Constructor de la clase resea, se deben de introducir los datos de usuario que la realiza, calificacion del 1 al 5 y comentario.
     * @param usuario
     * @param calificacion
     * @param comentario
     */
    public Reseña(ClienteParticular usuario, int calificacion, String comentario) {
        this.usuario = usuario;
        this.calificacion = calificacion;
        this.comentario = comentario;
    }

    /**
     * Devuelve el valor de comentario
     *
     * @return valor de comentario en tipo String
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el valor de comentario
     *
     * @param comentario nuevo valor de comentario en tipo String
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Devuelve el valor de calificacion
     *
     * @return valor de calificacion en tipo int
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece el valor de calificacion entre 1 y 5
     *
     * @param calificacion nuevo valor de calificacion en tipo int
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Devuelve el valor de usuario
     *
     * @return valor de usuario en tipo ClienteParticular
     */
    public ClienteParticular getUsuario() {
        return usuario;
    }

    /**
     * Establece el valor de usuario
     *
     * @param usuario nuevo valor de usuario en tipo ClienteParticular
     */
    public void setUsuario(ClienteParticular usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Reseña{" + "usuario=" + usuario + "calificacion=" + calificacion + ", comentario=" + comentario + '}'; // xd la ñ me la pone asi Rese\u00f1a en el toString
    }

}
