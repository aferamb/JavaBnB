package javabnb.backend;

import java.util.ArrayList; 

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class ClienteParticular extends Persona {
    
    private TarjetaCredito tarjetaCredito; //Si la clase fuese de otro paquete habría que especificar así: javabnb.backend.TarjetaCredito
    private boolean vip;
    private ArrayList<Reserva> reservas;

    /**
     * Constructor de la clase cliente particular se deben de introducir los datos del cliente de DNI, nombre, correo, clave, teléfono, tarjeta de crédito y si es VIP o no
     *
     * @param dni
     * @param nombre
     * @param correo
     * @param clave 
     * @param telefono
     * @param tarjetaCredito
     * @param vip
     */
    public ClienteParticular(String dni, String nombre, String correo, String clave, int telefono, TarjetaCredito tarjetaCredito, boolean vip) {
        super(dni, nombre, correo, clave, telefono);
        this.tarjetaCredito = tarjetaCredito;
        this.vip = vip;
    }
    
    /**
     * Devuelve una copia de la lista de reservas, para evitar modificar o alterar la original.
     *
     * @return copia de la lista de reservas en forma de ArrayList
     */
    public ArrayList<Reserva> getReservas() {
        return new ArrayList<>(reservas); 
    }

    /**
     * Intercambia una lista de reservas que ha hecho el cliente por completo por otra lista 
     * REVISAR, modificacon se queda o no
     *
     * @param nuevaListaReservas nueva lista de reservas en forma de ArrayList
     */
    public void setReservas(ArrayList<Reserva> nuevaListaReservas) {
        this.reservas = nuevaListaReservas;
    }
    
    /**
     * Agrega una reserva a la lista 
     *
     * @param nuevaReserva nueva reserva del cliente de tipo Reserva
     */
    public void addReserva(Reserva nuevaReserva) {
        reservas.add(nuevaReserva);
    }
    
    /**
     * Devuelve true si el cliente es VIP y false si no lo es
     *
     * @return true o false si es VIP o no
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * Establece si el cliente tiene el rango de VIP o no
     *
     * @param vip true o false si es VIP o no
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * Devuelve el valor de tarjetaCredito con solo los ultimos 4 digitos visibles
     *
     * @return datos de la targeta de credito(solo los ultimos 4 digitos visibles)
     */
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Establece el valor de la tarjeta de credito
     *
     * @param tarjetaCredito nuevo valor de tarjeta de credito de tipo TarjetaCredito
     */
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     * toString para el cliente particular
     *
     * @return datos del cliente particular en String con el numero de la tarjeta de credito ocultos por seguridad, excepto los ultimos 4 digitos
     */
    @Override
    public String toString() {
        return super.toString() + "ClienteParticular{" + "tarjetaCredito=" + tarjetaCredito + ", vip=" + vip + ", reservas=" + reservas + '}';
    }

}
