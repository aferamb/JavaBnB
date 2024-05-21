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


 
   private static ArrayList<Persona> personas = new ArrayList<>();
   public static void main (String[] args) throws IOException{
    /*   
   ArrayList<String> servicios = new ArrayList<>();
   servicios.add("Wifi");
   servicios.add("Desayuno");
   ArrayList<BufferedImage> fotos = new ArrayList<>();
   TarjetaCredito Tarjeta1 = new TarjetaCredito("pepe",1234567891234567L,LocalDate.of(2024, 5, 19));
   System.out.println(Tarjeta1.getNumeroTarjeta());
   Direccion dir1 = new Direccion ("calle avenida", 1, "AAAAA",19005,"Paris","Perú","peruu");
   Anfitrion anfi1 = new Anfitrion("12356A","Paco","email@email.com","12456",6473728);
   ClienteParticular per1 = new ClienteParticular("12345678A","Francisco","email@email.com","1245",1123322,Tarjeta1,true);
   ClienteParticular per2 = new ClienteParticular("12335678A","pepo", "coreo@ee" ,"1245",1123322,Tarjeta1,false);
   Inmueble inm1 = new Inmueble ("Casaaa",anfi1,dir1,3222,222,1,2,"CASA",40.72,servicios,fotos,0);
   Inmueble inm2 = new Inmueble ("PISO",anfi1,dir1,32,22,1,2,"CASA",43.72,servicios,fotos,0);
   Inmueble inm3 = new Inmueble ("AVION",anfi1,dir1,32,22,1,2,"apartamento",45.72,servicios,fotos,0);

   Reseña reseña = new Reseña(per1,5,"Muy bien",inm1);
   Reseña reseña2 = new Reseña(per2,3,"Muy mal",inm2);
   Reseña reseña3 = new Reseña(per1,4,"Bien",inm3);
   System.out.println(reseña);
   System.out.println(inm1.getCalificacion());
   
   Reserva reserva = new Reserva (inm1,Tarjeta1,per1,LocalDate.of(2024, 3, 16),LocalDate.of(2024, 3, 15));
   Reserva reserva2 = new Reserva (inm2,Tarjeta1,per2,LocalDate.of(2024, 3, 12),LocalDate.of(2024, 3, 15));
   //System.out.println(per1.getReservas());
   //System.out.println(anfi1.getInmuebles());
   
   personas.add(per2);
   personas.add(per1);
   personas.add(anfi1);

   for (Persona p: personas){
      if (p instanceof ClienteParticular){
         System.out.println("Cliente Particular");
         ClienteParticular pe1 = (ClienteParticular) p;
         pe1.getReservas();
      }
      else if (p instanceof Anfitrion){
         System.out.println("Anfitrion");
         anfi1 = (Anfitrion) p;
      }
   }
   for (Persona p: personas){
      if (p.getClass().getSimpleName().equals("ClienteParticular")){
         System.out.println("Cliente Particular");
      }
      else if (p.getClass().getSimpleName().equals("Anfitrion")){
         System.out.println("Anfitrion");
      }
   }


   System.err.println("Inmueble 1");
   GestorInmueble.addInmueble(inm3);
   GestorInmueble.addInmueble(inm2);
   GestorInmueble.addInmueble(inm1);
   GestorInmueble.addPersona(per1);
   GestorInmueble.addPersona(per2);
   GestorInmueble.addPersona(anfi1);
   GestorInmueble.addReserva(reserva);
   GestorInmueble.addReserva(reserva2);
   System.out.println(GestorInmueble.getPersonas());
   System.out.println(GestorInmueble.getReservas());
   System.out.println(GestorInmueble.getInmuebles());

   GestorInmueble.guardarDatosAdmin();
   GestorInmueble.guardarDatosInmuebles();
   GestorInmueble.guardarDatosPersonas();
   GestorInmueble.guardarDatosReservas();



   //System.out.println(GestorInmueble.getInmuebles());
   //System.out.println(GestorInmueble.getInmueblesPorCalificacion());
   //System.out.println(GestorInmueble.getInmueblesPorPrecio());
   //System.out.println(GestorInmueble.getInmueblesPorTipo("apartamento"));

   Reserva.generarFactura(reserva);
   Reserva.generarFactura(reserva2);

   System.out.println("Inmueble 2");
   GestorInmueble.recuperarDatosInmuebles();
   System.out.println("Inmueble 2");

   */


   GestorInmueble.recuperarDatosAdmin();
   GestorInmueble.recuperarDatosInmuebles();
   GestorInmueble.recuperarDatosPersonas();
   GestorInmueble.recuperarDatosReservas();
   System.out.println(GestorInmueble.getPersonas());
   System.out.println(GestorInmueble.getReservas());
   System.out.println(GestorInmueble.getInmuebles());
   System.out.println(GestorInmueble.getAdmin());

}  
}
