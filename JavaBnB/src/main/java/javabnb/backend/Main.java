package javabnb.backend;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Main {
   //private static ArrayList<Inmueble> inmuebles = new ArrayList<>();
   //private static Inmueble inm;
   public static void main (String[] args) throws IOException{
   ArrayList<String> servicios = new ArrayList<>();
   servicios.add("Wifi");
   servicios.add("Desayuno");
   ArrayList<BufferedImage> fotos = new ArrayList<>();
   TarjetaCredito Tarjeta1 = new TarjetaCredito("pepe",1234567891234567L,LocalDate.of(2024, 5, 19));
   System.out.println(Tarjeta1.getNumeroTarjeta());
   Direccion dir1 = new Direccion ("calle avenida", 1, "AAAAA",19005,"Paris","Perú","peruu");
   Anfitrion anfi1 = new Anfitrion("12356A","Paco","email@email.com","12456",6473728);
   ClienteParticular per1 = new ClienteParticular("12345678A","pepe","email@email.com","1245",1123322,Tarjeta1,true);
   ClienteParticular per2 = new ClienteParticular("12345678A","pepe", "coreo@ee" ,"1245",1123322,Tarjeta1,false);
   Inmueble inm1 = new Inmueble ("Casaaa",anfi1,dir1,3222,222,1,2,"CASA",40.72,servicios,fotos,0);
   Inmueble inm2 = new Inmueble ("PISO",anfi1,dir1,32,22,1,2,"CASA",43.72,servicios,fotos,0);
   Inmueble inm3 = new Inmueble ("AVION",anfi1,dir1,32,22,1,2,"CASA",43.72,servicios,fotos,0);

   Reseña reseña = new Reseña(per1,5,"Muy bien",inm1);
   System.out.println(reseña);
   System.out.println(inm1.getCalificacion());
   
   Reserva reserva = new Reserva (inm1,Tarjeta1,per1,LocalDate.of(2024, 3, 16),LocalDate.of(2024, 3, 15));
   Reserva reserva2 = new Reserva (inm2,Tarjeta1,per2,LocalDate.of(2024, 3, 12),LocalDate.of(2024, 3, 15));
   
   System.err.println("Inmueble 1");
   GestorInmueble.añadirInmueble(inm3);
   GestorInmueble.añadirInmueble(inm2);
   GestorInmueble.añadirInmueble(inm1);

   Reserva.generarFactura(reserva);
   Reserva.generarFactura(reserva2);

   System.out.println("Inmueble 2");
   GestorInmueble.leerDatos();
   System.out.println("Inmueble 2");
}  
}
