package javabnb.backend;
import java.time.LocalDate;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class TarjetaCredito {
    
    private String titular;
    private long numeroTarjeta; // A la hora de escribir los datos tipo Long, es buena practica poner al final una "L": ...342L no afecta al valor
    private LocalDate fechaCaducidad;

    /**
     * Constructor de la clase TarjetaCredito
     * 
     * @param titular de tipo String
     * @param numeroTarjeta de tipo long
     * @param fechaCaducidad de tipo LocalDate
     */
    public TarjetaCredito(String titular, long numeroTarjeta, LocalDate fechaCaducidad) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Devuelve el valor de la fecha de caducidad 
     *
     * @return valor de fechaCaducidad en LocalDate
     */
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Establece el valor de la fecha de caducidad
     *
     * @param fechaCaducidad nuevo valor para la fecha de caducidad ed tipo LocalDate
     */
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Devuelve el valor del número de la tarjera
     *
     * @return valor del número de la tarjeta en tipo long
     */
    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Establece el valor del numero de la tarjeta
     *
     * @param numeroTarjeta nuevo valor de numeroTarjeta en long
     */
    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Devuelve el nombre del titular de la tarjeta
     *
     * @return en nombre del titular en String
     */
    public String getNombre() {
        return titular;
    }

    /**
     * Establece el nombre del titular de la tarjeta
     *
     * @param titular nuevo valor del titular en String
     */
    public void setNombre(String titular) {
        this.titular = titular;
    }

    /**
     * toString para la tarjeta de credito
     * 
     * @return datos de la targeta de credito
     */
    @Override   //Quizas necesite comentarios para javadoc
    public String toString() {
        return "TarjetaCredito{" + "titular=" + titular + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

}
