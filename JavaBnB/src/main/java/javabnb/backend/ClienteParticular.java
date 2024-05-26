package javabnb.backend;

//import java.io.Serializable; //implements Serializable redundante en esta clase
import java.util.ArrayList; 

/**
 * Clase que representa un cliente particular de la aplicacion, hereda de la clase Persona.
 * Un cliente particular es una persona que reserva inmuebles para pasar una estancia.
 * Puede tener el rango de VIP si paga por el.
 * 
 * @see Persona
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class ClienteParticular extends Persona{
    
    private TarjetaCredito tarjetaCredito; //Si la clase fuese de otro paquete habría que especificar así: javabnb.backend.TarjetaCredito
    private boolean vip;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    /**
     * Constructor de la clase cliente particular, se deben de introducir los datos del cliente de DNI, nombre, correo, clave, teléfono, tarjeta de crédito y si es VIP o no
     *
     * @param dni String con el dni del cliente
     * @param nombre String con el nombre del cliente
     * @param correo String con el correo del cliente
     * @param clave  String con la clave del cliente
     * @param telefono int con el telefono del cliente
     * @param tarjetaCredito objeto de la clase TarjetaCredito
     * @param vip boolean si el cliente es VIP o no
     */
    public ClienteParticular(String dni, String nombre, String correo, String clave, int telefono, TarjetaCredito tarjetaCredito, boolean vip) {
        super(dni, nombre, correo, clave, telefono);
        this.tarjetaCredito = tarjetaCredito;
        this.vip = vip;
        GestorInmueble.addPersona(this);
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
     * Devuelve la lista de reservas del cliente particular
     *
     * @return lista de reservas en forma de ArrayList de Reserva   
     */
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Intercambia una lista de reservas que ha hecho el cliente por completo por otra lista 
     *
     * @param nuevaListaReservas nueva lista de reservas en forma de ArrayList de Reserva
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
     * Elimina una reserva de la lista. Si la reserva no existe, se imprime un mensaje de error.
     *
     * @param reserva reserva a eliminar de tipo Reserva
     */
    public void removeReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.remove(reserva);
        } else {
            System.out.println("La reserva a eliminar no existe.");
        }
    }

    /**
     * toString para el cliente particular
     *
     * @return datos del cliente particular en String con el numero de la tarjeta de credito ocultos por seguridad, excepto los ultimos 4 digitos
     */
    @Override
    public String toString() {
        return super.toString() + "ClienteParticular{" + "tarjetaCredito=" + tarjetaCredito + ", vip=" + vip +'}';
    }

}
