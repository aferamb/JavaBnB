package javabnb.backend;
import java.time.LocalDate;
/**
 *
 * @author ALEJANDRO
 */
public class TarjetaCredito {
    
    private String titular;
    private long numeroTarjeta; // A la hora de escribir los datos tipo Long, es buena practica Poner al final una "L": ...342L
    private LocalDate fechaCaducidad;

    public TarjetaCredito(String titular, long numeroTarjeta, LocalDate fechaCaducidad) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Get the value of fechaCaducidad
     *
     * @return the value of fechaCaducidad
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Set the value of fechaCaducidad
     *
     * @param fechaCaducidad new value of fechaCaducidad
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Get the value of numeroTarjeta
     *
     * @return the value of numeroTarjeta
     */
    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Set the value of numeroTarjeta
     *
     * @param numeroTarjeta new value of numeroTarjeta
     */
    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getNombre() {
        return titular;
    }

    /**
     * Set the value of titular
     *
     * @param titular new value of titular
     */
    public void setNombre(String titular) {
        this.titular = titular;
    }

    @Override   //Quizas necesite comentarios para javadoc
    public String toString() {
        return "TarjetaCredito{" + "titular=" + titular + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

}
