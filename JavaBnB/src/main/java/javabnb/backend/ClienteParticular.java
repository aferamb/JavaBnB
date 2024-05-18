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
     * Devuelve uan copia de la lista de reservas, para evitar modificar o alterar la original.
     * REVISAR, modificacon se queda o no
     *
     * @return copia de la lista de reservas
     */
    public ArrayList<Reserva> getReservas() {
        return new ArrayList<>(reservas); 
    }

    /**
     * Intercambia una lista de reservas que ha hecho el cliente por completo por otra lista 
     * REVISAR, modificacon se queda o no
     *
     * @param nuevaListaReservas nueva lista de reservas
     */
    public void setReservas(ArrayList<Reserva> nuevaListaReservas) {
        this.reservas = nuevaListaReservas;
    }
    
    /**
     * Agrega una reserv a la lista 
     * REVISAR, modificacon se queda o no
     *
     * @param nuevaReserva nueva reserva del cliente
     */
    public void addReserva(Reserva nuevaReserva) {
        reservas.add(nuevaReserva);
    }
    
    /**
     * Get the value of vip
     *
     * @return the value of vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * Set the value of vip
     *
     * @param vip new value of vip
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * Get the value of tarjetaCredito
     *
     * @return the value of tarjetaCredito
     */
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Set the value of tarjetaCredito
     *
     * @param tarjetaCredito new value of tarjetaCredito
     */
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
//MODIFICAR para que tenga todos los parametros
    @Override
    public String toString() {
        return "ClienteParticular{" + "tarjetaCredito=" + tarjetaCredito + ", vip=" + vip + ", reservas=" + reservas + '}';
    }

}
