/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabnb.backend;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author sco23
 */
public class Reserva {
    
    private Inmueble inm;
    private double importe; //el importe se calcula a partir de las fechas
    private TarjetaCredito tarjeta; // Es necesario poner tarjeta como atributo?? se puede obtener desde cliente
    private ClienteParticular cliente;
    private LocalDate fechaReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    /**
     * Constructor de la clase Reserva se deben de introducir los datos de la reserva: inmueble, fecha de entrada, fecha de salida, fecha de reserva, tarjeta de crédito, importe
´    *
     * @param inm
     * @param importe
     * @param tarjeta
     * @param fechaReserva
     * @param fechaEntrada
     * @param fechaSalida
     * @param cliente
     */
    public Reserva(Inmueble inm, double importe, TarjetaCredito tarjeta, ClienteParticular cliente, LocalDate fechaReserva, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.inm = inm;
        this.importe = importe;
        this.tarjeta = tarjeta;
        this.cliente = cliente;
        this.fechaReserva = fechaReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    
    /**
     * Devuelve el valor de inm
     * 
     * @return el valor de inm
     */
    public Inmueble getInm() {
        return inm;
    }

    /**
     * Establece el valor de inmueble
     * 
     * @param inm nuevo valor inmueble
     */
    public void setInm(Inmueble inm) {
        this.inm = inm;
    }

    /**
     * Devuelve el valor de importe
     * 
     * @return el valor de importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Establece el valor de importe
     * 
     * @param importe nuevo valor de importe
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * Devuelve el valor de tarjeta
     * 
     * @return el valor de tarjeta
     */
    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    /**
     * Establece el valor de tarjeta
     * 
     * @param tarjeta nuevo valor de tarjeta
     */
    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    /**
     * Devuelve el valor de cliente
     * 
     * @return el valor de cliente
     */
    public ClienteParticular getCliente() {
        return cliente;
    }

    /**
     * Establece el valor de cliente
     * 
     * @param cliente nuevo valor cliente
     */
    public void setCliente(ClienteParticular cliente) {
        this.cliente = cliente;
    }

    /**
     * Devuelve el valor de fechaReserva
     * 
     * @return el valor de fechaReserva
     */
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece el valor de fechaReserva
     * 
     * @param fechaReserva nuevo valor fechaReserva
     */
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Devuelve el valor de fechaEntrada
     * 
     * @return el valor de fechaEntrada
     */
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *Establece el valor de fechaEntrada
     * 
     * @param fechaEntrada nuevo valor fechaEntrada
     */
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * Devuelve el valor de fechaSalida
     * 
     * @return el valor de fechaSalida
     */
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    /**
     *Establece el valor de fechasalida
     * 
     * @param fechaSalida nuevo valor fechaSalida
     */
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     *
     * @return 
     */
    @Override
    public String toString() {
        return "Reserva{" + "Inmueble= " + inm + ", importe= " + importe + ", tarjeta= " + tarjeta + ", cliente= " + cliente +", fecha de reserva= " + fechaReserva +  ",fechade entrada= "+ fechaEntrada + ", fecha de salida= " + fechaSalida +"}";
    }

    /**
     * devuelve el importe de la reserva
     * 
     * @return el importe de la reserva
     */
    public double calcularImporte(){
     long dias = ChronoUnit.DAYS.between(this.fechaEntrada, this.fechaSalida);
     double res = inm.getPrecioNoche() * dias;
     if (cliente.isVip()) {
         res = 0.9*res; }
     return res;
    }

    /**
     *
     * @param reserva
     * @throws IOException
     */
    public static void generarFactura(Reserva reserva) throws IOException {
        double importefactura = reserva.calcularImporte();
        long numeroTarjeta = reserva.getCliente().getTarjetaCredito().getNumeroTarjeta();
        LocalDate fecha = reserva.getFechaReserva();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yy");        
        String fn = fecha.format(formatoCorto);
     String rutaFicheroFactura = "./Facturas/Factura--" + reserva.getInm().getTitulo().replace(' ','-')+ "__(" + fn.replace('/', '_') + ").txt";
        try {
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }
            
            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("---------------------------- Factura de reserva ---------------------------");
                salida.println("\n");
                salida.println("-------------------------------- Fecha: " + fn + " -------------------------------");
                salida.println("\n");
                salida.println("Fecha de entrada: " + reserva.getFechaEntrada().format(formatoCorto));
                salida.println("Fecha de salida: "+ reserva.getFechaSalida().format(formatoCorto));
                salida.println("\n");
                salida.println("-------------------------------- Inmueble -------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + reserva.getInm().getTitulo());
                salida.println("Dirección: " + reserva.getInm().getDireccion().toString());
                salida.println("Tipo: " + reserva.getInm().getTipoPropiedad());
                salida.println("Huéspedes máximos: " + reserva.getInm().getHuespedesMax());
                salida.println("Habitaciones: " + reserva.getInm().getHabitaciones());
                salida.println("Camas: " + reserva.getInm().getCamas());
                salida.println("Baños: " + reserva.getInm().getBaños());
                salida.println("Servicios adicionales: " + reserva.getInm().getServicios());
                salida.println("\n");
                salida.println("--------------------------DATOS DEL CLIENTE-----------------------------------");
                salida.println("\n");
                salida.println("Nombre: " + reserva.getCliente().getNombre());
                salida.println("DNI: " + reserva.getCliente().getDni());
                salida.println("Teléfono: " + reserva.getCliente().getTelefono());
                salida.println("Correo: " + reserva.getCliente().getCorreo());
                salida.println("Tarjeta: " + TarjetaCredito.ocultarTarjeta(numeroTarjeta));
                salida.println("\n");
                salida.println("-----------------------------IMPORTE--------------------------------------");
                salida.println("\n");
                salida.println("Precio por noche: " + reserva.getInm().getPrecioNoche() + "€");
                if (reserva.getCliente().isVip()) { 
                    salida.println("Descuento VIP: -" + importefactura  *0.1 );
                    importefactura = 0.9*importefactura;}
                salida.println("Precio final: " + importefactura);
                salida.println("\n");
                salida.println("-------------------------------------------------------------------------------");
            }
        } 
        catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
    }
    
    

