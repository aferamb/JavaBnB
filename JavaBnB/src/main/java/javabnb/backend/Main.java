package javabnb.backend;

import javax.swing.ImageIcon;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.imageio.ImageIO;


/**
 * Clase Main que contiene el método main del programa de prueba para el backend
 * 
 * 
 */
public class Main {
   
   private static ImageIcon cargarFoto(String rutaArchivo) {
      //Image imagen;
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
         
         Image imagen = ImageIO.read(archivo);
         ImageIcon icono = new ImageIcon(imagen);
         return icono;
      } catch (IOException ioe) {
         // Imprimir mensaje de error resaltado
         System.err.println("Error IO:" + ioe.getMessage());
         ioe.printStackTrace();
         return null;
      }
   }

   public static void main (String[] args) throws IOException {
      /* 
   ArrayList<Persona> personas = new ArrayList<>();
   ArrayList<Inmueble> inmuebles = new ArrayList<>();
   ArrayList<Reserva> reservas = new ArrayList<>();
   ArrayList<String> servicios = new ArrayList<>();
   servicios.add("Wifi");
   servicios.add("Desayuno");
   servicios.add("Parking");
   servicios.add("Calefacción");
   servicios.add("Aire acondicionado");

   ArrayList<ImageIcon> fotos1 = new ArrayList<>();
   ArrayList<ImageIcon> fotos2 = new ArrayList<>();
   ArrayList<ImageIcon> fotos3 = new ArrayList<>();
   ArrayList<ImageIcon> fotos4 = new ArrayList<>();
   ArrayList<ImageIcon> fotos5 = new ArrayList<>();
   ArrayList<ImageIcon> fotos6 = new ArrayList<>();
   ArrayList<ImageIcon> fotos7 = new ArrayList<>();
   
   fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/1.jpg"));
   fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/2.jpg"));
   fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/3.jpg"));
   //fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/4.jpg"));
   //fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/5.jpg"));
   //fotos1.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamento3pers1dorm1bano/iloveimg-converted/6.jpg"));
   fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/1.jpg"));
   fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/2.jpg"));
   fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/3.jpg"));
   //fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/4.jpg"));
   //fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/5.jpg"));
   //fotos2.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoAlicante4pers3dorm1bano/iloveimg-converted/6.jpg"));
   fotos3.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoMadera3pers2dorm1bano/iloveimg-converted/1.jpg"));
   fotos3.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoMadera3pers2dorm1bano/iloveimg-converted/2.jpg"));
   //fotos3.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoMadera3pers2dorm1bano/iloveimg-converted/3.jpg"));
   //fotos3.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoMadera3pers2dorm1bano/iloveimg-converted/4.jpg"));
   //fotos3.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/apartamentoMadera3pers2dorm1bano/iloveimg-converted/5.jpg"));
   fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/1.jpg"));
   fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/2.jpg"));
   fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/3.jpg"));
   //fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/4.jpg"));
   //fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/5.jpg"));
   //fotos4.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/ApartamentoPlayaValencia4pers2dorm1bano/iloveimg-converted/6.jpg"));
   fotos5.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCavanaMontana2per1dorm1bano/iloveimg-converted/1.jpg"));
   fotos5.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCavanaMontana2per1dorm1bano/iloveimg-converted/2.jpg"));
   //fotos5.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCavanaMontana2per1dorm1bano/iloveimg-converted/3.jpg"));
   //fotos5.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCavanaMontana2per1dorm1bano/iloveimg-converted/4.jpg"));
   //fotos5.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCavanaMontana2per1dorm1bano/iloveimg-converted/5.jpg"));
   fotos6.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCueva2pers1dorm1bano/iloveimg-converted/1.jpg"));
   fotos6.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCueva2pers1dorm1bano/iloveimg-converted/2.jpg"));
   //fotos6.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCueva2pers1dorm1bano/iloveimg-converted/3.jpg"));
   //fotos6.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCueva2pers1dorm1bano/iloveimg-converted/4.jpg"));
   //fotos6.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaCueva2pers1dorm1bano/iloveimg-converted/5.jpg"));
   fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/1.jpg"));
   fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/2.jpg"));
   fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/3.jpg"));
   //fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/4.jpg"));
   //fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/5.jpg"));
   //fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/6.jpg"));
   //fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/7.jpg"));
   //fotos7.add(Main.cargarFoto("C:/Users/ALEJANDRO/Desktop/Imagenes_casas_vacacionales/casaplaya7pers4dorm3bano/iloveimg-converted/8.jpg"));
   
   


   TarjetaCredito Tarjeta1 = new TarjetaCredito("Hector",5678432197421347L,LocalDate.of(2025, 5, 19));
   TarjetaCredito Tarjeta2 = new TarjetaCredito("Alejandro", 9876546783214567L, LocalDate.of(2026, 5, 19));
   TarjetaCredito Tarjeta3 = new TarjetaCredito("Nico", 7832145987654667L, LocalDate.of(2027, 5, 19));


   ClienteParticular cli1 = new ClienteParticular("12345678A","Hector","hector@gmail.com","1234",633954827,Tarjeta1,true);
   ClienteParticular cli2 = new ClienteParticular("12345678B","Alejandro","alejandro@gmail.com","1234",611994828,Tarjeta2,true);
   ClienteParticular cli3 = new ClienteParticular("12345678C","Nico","nico@gmail.com","1234",648339527,Tarjeta3,true);
   Anfitrion anfi1 = new Anfitrion("12345678C","Sergio","sergio@gmail.com","1234",648339527);
   Anfitrion anfi2 = new Anfitrion("12345678D","Paco","paco@gmail.com","1234",954633827);

   Direccion dir1 = new Direccion ("calle Buena Vista", 1, "Portal B, Bajo A",19005,"Guadalajara","Castilla-La Mancha","Peru");
   Direccion dir2 = new Direccion ("calle Diccionario", 2, "Piso 2, A",19006,"Guadalajara","Castilla-La Mancha","España");
   Direccion dir3 = new Direccion ("calle Java", 3, "Cuarto C",19007,"Guadalajara","Castilla-La Mancha","España");
   Direccion dir4 = new Direccion ("calle Hola", 4, "1C",19008,"Valencia","Comunidad Valenciana","España");
   Direccion dir5 = new Direccion ("calle Que tal", 5, "",19009,"Guadalajara","Castilla-La Mancha","España");
   Direccion dir6 = new Direccion ("calle Jose Luis", 6, "",19010,"Valencia","Comunidad Valenciana","España");
   Direccion dir7 = new Direccion ("calle Pontejos", 7, "",19011,"Valencia","Comunidad Valenciana","España");

   Inmueble inm1 = new Inmueble ("Piso de la luz",anfi1,dir1,3,1,3,1,"apartamento",60.00,servicios,fotos1,0);
   Inmueble inm2 = new Inmueble ("Apatamento tradicional",anfi2,dir2,4,3,3,1,"apartamento",73.44,servicios,fotos2,0);
   Inmueble inm3 = new Inmueble ("Piso roble oscuro",anfi1,dir3,3,2,1,1,"apartamento",45.52,servicios,fotos3,0);
   Inmueble inm4 = new Inmueble ("Apartamento a pie de playa",anfi1,dir4,4,2,2,1,"apartamento",127.72,servicios,fotos4,0);
   Inmueble inm5 = new Inmueble ("Cabaña de montaña",anfi2,dir5,2,1,1,1,"CASA",59.72,servicios,fotos5,0);
   Inmueble inm6 = new Inmueble ("Casa cueva",anfi2,dir6,2,1,1,1,"CASA",91.50,servicios,fotos6,0);
   Inmueble inm7 = new Inmueble ("Casa de playa",anfi1,dir7,7,4,6,3,"CASA",277.77,servicios,fotos7,0);

   Reseña reseña1 = new Reseña(cli1,5,"Estetica 10/10",inm1);
   Reseña reseña2 = new Reseña(cli1,4,"Puede mejorar, sobre todo en moviliario",inm2);
   Reseña reseña3 = new Reseña(cli2,3,"Los tonos de color cansan",inm3);
   Reseña reseña4 = new Reseña(cli2,5,"Genial, decoracion excelente",inm4);
   Reseña reseña5 = new Reseña(cli1,3,"DEMASIADO pequeña",inm5);
   Reseña reseña6 = new Reseña(cli2,4,"Curioso cuanto menos",inm6);
   Reseña reseña7 = new Reseña(cli3,5,"Es flipante",inm7);
   

   Reserva reserva = new Reserva (inm1,Tarjeta1,cli1,LocalDate.of(2024, 6, 16),LocalDate.of(2024, 6, 20)); 
   Reserva reserva2 = new Reserva (inm2,Tarjeta2,cli1,LocalDate.of(2024, 8, 23),LocalDate.of(2024, 8, 30));
   Reserva reserva3 = new Reserva (inm3,Tarjeta1,cli2,LocalDate.of(2024, 5, 14),LocalDate.of(2024, 5, 15));
   Reserva reserva4 = new Reserva (inm4,Tarjeta2,cli2,LocalDate.of(2024, 6, 14),LocalDate.of(2024, 6, 21));
   Reserva reserva5 = new Reserva (inm5,Tarjeta1,cli1,LocalDate.of(2024, 6, 30),LocalDate.of(2024, 7, 5));
   Reserva reserva6 = new Reserva (inm6,Tarjeta2,cli2,LocalDate.of(2024, 5, 12),LocalDate.of(2024, 5, 17));
   Reserva reserva7 = new Reserva (inm7,Tarjeta1,cli3,LocalDate.of(2024, 7, 25),LocalDate.of(2024, 8, 2));
   Reserva reserva8 = new Reserva (inm3,Tarjeta1,cli2,LocalDate.of(2024, 7, 25),LocalDate.of(2024, 8, 2));
   Reserva reserva9 = new Reserva (inm2,Tarjeta2,cli2,LocalDate.of(2024, 6, 2),LocalDate.of(2024, 6, 10));
   Reserva reserva10 = new Reserva (inm5,Tarjeta1,cli1,LocalDate.of(2024, 7, 9),LocalDate.of(2024, 7, 15));

   Reserva.generarFactura(reserva);
   Reserva.generarFactura(reserva2);
   Reserva.generarFactura(reserva3);
   reserva4.generarFactura("C:/Users/ALEJANDRO/Desktop"); //ruta donde se guardará la factura introducida con / en vez de \

   reserva.setFechaReserva(LocalDate.of(2024, 3, 15));
   reserva3.setFechaReserva(LocalDate.of(2024, 3, 16));
   reserva8.setFechaReserva(LocalDate.of(2024, 3, 17));
   reserva4.setFechaReserva(LocalDate.of(2024, 3, 18));
   reserva7.setFechaReserva(LocalDate.of(2024, 3, 19));
   reserva6.setFechaReserva(LocalDate.of(2024, 3, 20));
   reserva5.setFechaReserva(LocalDate.of(2024, 3, 21));
   reserva2.setFechaReserva(LocalDate.of(2024, 3, 22));
   reserva9.setFechaReserva(LocalDate.of(2024, 3, 23));
   reserva10.setFechaReserva(LocalDate.of(2024, 3, 24));

   //ArrayList<Reserva> reservasPorFecha = new ArrayList<>(GestorInmueble.getReservas());
   ArrayList<Reserva> reservasPorFecha = new ArrayList<>(GestorInmueble.getReservasPorFecha());
   for (Reserva r: reservasPorFecha){
      System.out.println(r);
   }
   for (Inmueble i: GestorInmueble.getInmuebles()){
      System.out.println(i.getReseñas());
   }
   for (Persona p: GestorInmueble.getPersonas()){
      System.out.println(p);
   }

   /* 
   GestorInmueble.addInmueble(inm3);
   GestorInmueble.addInmueble(inm2);
   GestorInmueble.addInmueble(inm1);
   GestorInmueble.addInmueble(inm4);
   GestorInmueble.addInmueble(inm5);
   GestorInmueble.addInmueble(inm6);
   GestorInmueble.addInmueble(inm7);
   GestorInmueble.addPersona(cli1);
   GestorInmueble.addPersona(cli2);
   GestorInmueble.addPersona(cli3);
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
   GestorInmueble.addReserva(reserva10);
   
      *

   personas.add(cli1);
   personas.add(cli2);
   personas.add(cli3);
   personas.add(anfi1);
   personas.add(anfi2);
   inmuebles.add(inm1);
   inmuebles.add(inm2);
   inmuebles.add(inm3);
   inmuebles.add(inm4);
   inmuebles.add(inm5);
   inmuebles.add(inm6);
   inmuebles.add(inm7);
   reservas.add(reserva);
   reservas.add(reserva2);
   reservas.add(reserva3);
   reservas.add(reserva4);
   reservas.add(reserva5);
   reservas.add(reserva6);
   reservas.add(reserva7);
   reservas.add(reserva8);
   reservas.add(reserva9);
   reservas.add(reserva10);
   GestorInmueble.setInmuebles(inmuebles);
   GestorInmueble.setPersonas(personas);
   GestorInmueble.setReservas(reservas);


   GestorInmueble.guardarDatosInmuebles();
   System.out.println("Guardando datos de inmuebles");
   GestorInmueble.guardarDatosPersonas();
   System.out.println("Guardando datos de personas");
   GestorInmueble.guardarDatosReservas();
   System.out.println("Guardando datos de reservas");

   ArrayList<Reserva> reservasPorFecha2 = new ArrayList<>(GestorInmueble.getReservasPorFecha());
   for (Reserva r: reservasPorFecha2){
      System.out.println(r);
   }
   for (Inmueble i: GestorInmueble.getInmuebles()){
      System.out.println(i.getReseñas());
   }
   for (Persona p: GestorInmueble.getPersonas()){
      System.out.println(p);
   }



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
   System.out.println(GestorInmueble.getInmuebles());
   System.out.println(GestorInmueble.getPersonas());
   System.out.println(GestorInmueble.getReservas());
   ArrayList<Reserva> reservasPorFecha3 = new ArrayList<>(GestorInmueble.getReservasPorFecha());
   for (Reserva r: reservasPorFecha3){
      System.out.println(r);
   }
   for (Inmueble i: GestorInmueble.getInmuebles()){
      System.out.println(i);
   }
   for (Inmueble i: GestorInmueble.getInmueblesPorTipo("apartamento")){
      System.out.println(i);
   }
   for (Persona p: GestorInmueble.getPersonas()){
      System.out.println(p);
   }
   */
   
   GestorInmueble.recuperarDatosInmuebles();
   GestorInmueble.recuperarDatosPersonas();
   GestorInmueble.recuperarDatosReservas();
   System.out.println(GestorInmueble.getInmuebles());
   System.out.println(GestorInmueble.getPersonas());
   System.out.println(GestorInmueble.getReservas());
   ArrayList<Reserva> reservasPorFecha3 = new ArrayList<>(GestorInmueble.getReservasPorFecha());
   for (Reserva r: reservasPorFecha3){
      System.out.println(r);
   }
   for (Inmueble i: GestorInmueble.getInmuebles()){
      System.out.println(i);
   }
   for (Inmueble i: GestorInmueble.getInmueblesPorTipo("apartamento")){
      System.out.println(i);
   }
   for (Persona p: GestorInmueble.getPersonas()){
      System.out.println(p);
   }
   
}  
}
