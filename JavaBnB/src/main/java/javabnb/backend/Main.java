package javabnb.backend;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author sco23
 */
public class Main {

    public static void main (String[] args) throws IOException{
    ArrayList<String> servicios = new ArrayList<>();
    ArrayList<BufferedImage> fotos = new ArrayList<>();
    TarjetaCredito Tarjeta1 = new TarjetaCredito("pepe",12345678912345678L,LocalDate.of(2024, 5, 19));
    Direccion dir1 = new Direccion ("calle avenida", 1, "AAAAA",19005,"Paris","Perú","peruu");
    Anfitrion anfi1 = new Anfitrion("12356A","Paco","email@email.com","12456",6473728);
    ClienteParticular per1 = new ClienteParticular("12345678A","pepe","email@email.com","1245",1123322,Tarjeta1,true);
    Inmueble inm1 = new Inmueble ("Casa",anfi1,dir1,3,2,1,2,"CASA",43.72,servicios,fotos,0);
    
    Reserva reserva = new Reserva (inm1,Tarjeta1,per1,LocalDate.of(2024, 1, 1),LocalDate.of(2024, 1, 2),LocalDate.of(2024, 3, 12));
   
    Reserva.generarFactura(reserva);
}  
}
