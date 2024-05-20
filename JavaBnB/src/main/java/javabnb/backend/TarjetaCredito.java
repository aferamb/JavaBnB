package javabnb.backend;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class TarjetaCredito implements Serializable{
    
    private String titular;
    private long numeroTarjeta; // A la hora de escribir los datos tipo Long, es buena practica poner al final una "L": ...342L no afecta al valor(de hecho sin la l el main no va)
    private LocalDate fechaCaducidad;

    /**
     * Constructor de la clase TarjetaCredito. Se deben de introducir los datos de nombre del titular, número de tarjeta y fecha de caducidad
     * 
     * @param titular String con el nombre del titular
     * @param numeroTarjeta long con el número de la tarjeta
     * @param fechaCaducidad LocalDate con la fecha de caducidad de la tarjeta
     */
    public TarjetaCredito(String titular, long numeroTarjeta, LocalDate fechaCaducidad) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
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
     * Devuelve el valor del número de la tarjera
     *
     * @return valor del número de la tarjeta en tipo long
     */
    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Establece el valor del numero de la tarjeta, de 16 digitos
     *
     * @param numeroTarjeta nuevo valor de numeroTarjeta en long
     */
    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    /**
     * Método que oculta todos los dígitos de la tarjeta excepto los últimos 4
     * 
     * @param numero de la tarjeta
     * @return el número de la tarjeta con todos los dígitos ocultos excepto los últimos 4
     */
    public static String ocultarTarjeta(long numero) {
        int len = String.valueOf( numero).length();
        if (len <= 4) {
            return String.valueOf( numero);
        }
        String cover = "*".repeat(len - 4);
        String lastFourDigits = String.valueOf( numero).substring(len - 4);
        return cover + lastFourDigits;
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
     * toString para la tarjeta de credito
     * 
     * @return datos de la targeta de credito en String, con el numero de la tarjeta oculto por seguridad, excepto los ultimos 4 digitos
     */
    @Override   
    public String toString() {
        return "TarjetaCredito{" + "titular=" + titular + ", numeroTarjeta=" + ocultarTarjeta(numeroTarjeta) + ", fechaCaducidad=" + fechaCaducidad + '}';
    }

}
