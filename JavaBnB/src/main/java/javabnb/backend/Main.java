package javabnb.backend;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.imageio.ImageIO;


/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */
public class Main {
   
   private static BufferedImage cargarFoto(String rutaArchivo) {
      BufferedImage imagen;
      try {
         File archivo = new File(rutaArchivo);
         if (!archivo.exists()) {
            throw new IOException("El archivo no existe");
         } else if (!archivo.isFile()) {
            throw new IOException("La ruta no corresponde a un archivo");
         } else if (!archivo.canRead()) {
            throw new IOException("No se puede leer el archivo");
         } else if (!archivo.getName().endsWith(".jpg") && !archivo.getName().endsWith(".jpeg") && !archivo.getName().endsWith(".png")) {
            throw new IOException("El archivo no es una imagen");
         }
         
         imagen = ImageIO.read(archivo);
         return imagen;
      } catch (IOException ioe) {
         // Imprimir mensaje de error resaltado
         System.err.println("Error IO:" + ioe.getMessage());
         ioe.printStackTrace();
         return null;
      }
   }


   public static void main (String[] args) throws IOException {
      
   ArrayList<String> servicios = new ArrayList<>();
   servicios.add("Wifi");
   servicios.add("Desayuno");
   servicios.add("Piscina");
   servicios.add("Parking");
   servicios.add("Calefacción");
   servicios.add("Aire acondicionado");

   ArrayList<BufferedImage> fotos1 = new ArrayList<>();
   ArrayList<BufferedImage> fotos2 = new ArrayList<>();
   ArrayList<BufferedImage> fotos3 = new ArrayList<>();
   ArrayList<BufferedImage> fotos4 = new ArrayList<>();
   ArrayList<BufferedImage> fotos5 = new ArrayList<>();
   ArrayList<BufferedImage> fotos6 = new ArrayList<>();
   
   //fotos.add(ImageIO.read(new File("src/main/java/javabnb/backend/imagenes/casa1.jpg")));
   fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes casas vacacionales/casa1.jpg"));


   TarjetaCredito Tarjeta1 = new TarjetaCredito("Hector",5678432197421347L,LocalDate.of(2025, 5, 19));
   TarjetaCredito Tarjeta2 = new TarjetaCredito("Alejandro", 9876546783214567L, LocalDate.of(2026, 5, 19));

   ClienteParticular cli1 = new ClienteParticular("12345678A","Hector","hector@gmail.com","1245",633954827,Tarjeta1,true);
   ClienteParticular cli2 = new ClienteParticular("12345678B","Alejandro","alejandro@gmail.com","1246",611994828,Tarjeta2,true);
   Anfitrion anfi1 = new Anfitrion("12345678C","Sergio","sergio@gmail.com","1247",648339527);
   Anfitrion anfi2 = new Anfitrion("12345678D","Paco","paco@gmail.com","1248",954633827);

   Direccion dir1 = new Direccion ("calle avenida", 1, "Portal B, Bajo A",19005,"Paris","Perú","Peru");
   Direccion dir2 = new Direccion ("calle avenida", 2, "Piso 2, A",19006,"Madrid","Madrid","España");
   Direccion dir3 = new Direccion ("calle avenida", 3, "Cuarto C",19007,"Barcelona","Barcelona","España");
   Direccion dir4 = new Direccion ("calle avenida", 4, "1C",19008,"Valencia","Comunidad Valenciana","España");
   Direccion dir5 = new Direccion ("calle avenida", 5, "",19009,"Sevilla","Andalucia","España");
   Direccion dir6 = new Direccion ("calle avenida", 6, "",19010,"Bilbao","Vizcaya","España");

   Inmueble inm1 = new Inmueble ("Casaaa",anfi1,dir1,4,3,3,1,"CASA",60.72,servicios,fotos1,0);
   Inmueble inm2 = new Inmueble ("PISO",anfi2,dir2,5,4,5,2,"CASA",73.72,servicios,fotos2,0);
   Inmueble inm3 = new Inmueble ("AVION",anfi1,dir3,3,2,3,2,"apartamento",45.72,servicios,fotos3,0);
   Inmueble inm4 = new Inmueble ("COCHE",anfi1,dir4,7,5,5,3,"CASA",137.72,servicios,fotos4,0);
   Inmueble inm5 = new Inmueble ("BARCO",anfi2,dir5,4,2,3,1,"apartamento",49.72,servicios,fotos5,0);
   Inmueble inm6 = new Inmueble ("TREN",anfi2,dir6,5,4,4,2,"CASA",81.72,servicios,fotos6,0);

   Reseña reseña1 = new Reseña(cli1,5,"Muy bien",inm1);
   Reseña reseña2 = new Reseña(cli1,3,"Puede mejorar",inm2);
   Reseña reseña3 = new Reseña(cli2,4,"Bien",inm3);
   Reseña reseña4 = new Reseña(cli2,5,"Genial",inm4);
   Reseña reseña5 = new Reseña(cli1,5,"Muy bonito",inm5);
   Reseña reseña6 = new Reseña(cli2,4,"Bien",inm6);
   
   
   
   Reserva reserva = new Reserva (inm1,Tarjeta1,cli1,LocalDate.of(2024, 6, 16),LocalDate.of(2024, 6, 20)); //poner bien las fechas
   Reserva reserva2 = new Reserva (inm2,Tarjeta2,cli2,LocalDate.of(2024, 8, 23),LocalDate.of(2024, 8, 30));
   Reserva reserva3 = new Reserva (inm3,Tarjeta1,cli1,LocalDate.of(2024, 5, 14),LocalDate.of(2024, 5, 15));
   Reserva reserva4 = new Reserva (inm4,Tarjeta2,cli2,LocalDate.of(2024, 6, 14),LocalDate.of(2024, 6, 21));
   Reserva reserva5 = new Reserva (inm5,Tarjeta1,cli1,LocalDate.of(2024, 6, 30),LocalDate.of(2024, 7, 5));
   Reserva reserva6 = new Reserva (inm6,Tarjeta2,cli2,LocalDate.of(2024, 5, 12),LocalDate.of(2024, 5, 17));
   Reserva reserva7 = new Reserva (inm1,Tarjeta1,cli1,LocalDate.of(2024, 7, 25),LocalDate.of(2024, 8, 2));
   Reserva reserva8 = new Reserva (inm2,Tarjeta2,cli2,LocalDate.of(2024, 6, 2),LocalDate.of(2024, 6, 10));
   Reserva reserva9 = new Reserva (inm3,Tarjeta1,cli1,LocalDate.of(2024, 7, 9),LocalDate.of(2024, 7, 15));

   Reserva.generarFactura(reserva);
   Reserva.generarFactura(reserva2);
   Reserva.generarFactura(reserva3);
   reserva4.generarFactura("C:/Users/ALEJANDRO/Desktop"); //ruta donde se guardará la factura introducida con / en vez de \

   reserva.setFechaReserva(LocalDate.of(2024, 3, 15));

   System.out.println(GestorInmueble.getReservasPorFecha());
   
   GestorInmueble.addInmueble(inm3);
   GestorInmueble.addInmueble(inm2);
   GestorInmueble.addInmueble(inm1);
   GestorInmueble.addInmueble(inm4);
   GestorInmueble.addInmueble(inm5);
   GestorInmueble.addInmueble(inm6);
   GestorInmueble.addPersona(cli1);
   GestorInmueble.addPersona(cli2);
   GestorInmueble.addPersona(anfi1);
   GestorInmueble.addPersona(anfi2);
   GestorInmueble.addReserva(reserva);
   GestorInmueble.addReserva(reserva2);
   GestorInmueble.addReserva(reserva3);
   GestorInmueble.addReserva(reserva4);
   GestorInmueble.addReserva(reserva5);
   GestorInmueble.addReserva(reserva6);
   GestorInmueble.addReserva(reserva7);
   GestorInmueble.addReserva(reserva8);
   GestorInmueble.addReserva(reserva9);

   GestorInmueble.guardarDatosInmuebles();
   GestorInmueble.guardarDatosPersonas();
   GestorInmueble.guardarDatosReservas();

   /* Para el frontend
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
   */

   

   //System.out.println(GestorInmueble.getInmuebles());
   //System.out.println(GestorInmueble.getInmueblesPorCalificacion());
   //System.out.println(GestorInmueble.getInmueblesPorPrecio());
   //System.out.println(GestorInmueble.getInmueblesPorTipo("apartamento"));
   

   /* 
   GestorInmueble.recuperarDatosInmuebles();
   GestorInmueble.recuperarDatosPersonas();
   GestorInmueble.recuperarDatosReservas();
   System.out.println(GestorInmueble.getPersonas());
   System.out.println(GestorInmueble.getReservas());
   System.out.println(GestorInmueble.getInmuebles());
   */

}  
}
