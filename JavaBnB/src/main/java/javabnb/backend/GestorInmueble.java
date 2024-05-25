package javabnb.backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.Serializable;
//import java.time.LocalDate;
import java.time.LocalDate;


/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */

public class GestorInmueble implements Serializable{
    private static ArrayList<Persona> personas = new ArrayList<>();
    private static ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    /**
     * Devuelve el ArrayList de personas
     * 
     * @return personas en tipo ArrayList de Persona
     */
    public static ArrayList<Persona> getPersonas() {
        return personas;
    }

    /**
     * Establece el ArrayList de personas
     * 
     * @param pers nuevo valor de personas de tipo ArrayList de Persona
     */
    public static void setPersonas(ArrayList<Persona> pers) {
        personas = pers;
    }

    /**
     * Añade una persona al ArrayList de personas
     * 
     * @param pers nuevo valor de personas de tipo Persona
     */
    public static void addPersona(Persona pers) {
        personas.add(pers);
    }

    /**
     * Elimina una persona del ArrayList de personas
     * 
     * @param pers valor de personas de tipo Persona
     */
    public static void removePersona(Persona pers) {
        if (personas.contains(pers)) {
            personas.remove(pers);
        } else {
            System.out.println("La persona no se encuentra en el ArrayList de personas.");
        }
    }

    /**
     * Devuelve el ArrayList de inmuebles
     * 
     * @return inmuebles en tipo ArrayList de Inmueble
     */
    public static ArrayList<Inmueble> getInmuebles() {
        return GestorInmueble.inmuebles;
    }

    /**
     * Establece el ArrayList de inmuebles
     * 
     * @param inm nuevo valor de inmuebles de tipo ArrayList de Inmueble
     */
    public static void setInmuebles(ArrayList<Inmueble> inm) {
        inmuebles = inm;
    }

    /**
     * Añade un inmueble al ArrayList de inmuebles
     * 
     * @param inm nuevo valor de inmuebles de tipo Inmueble
     */
    public static void addInmueble(Inmueble inm) {
        inmuebles.add(inm);
    }

    /**
     * Elimina un inmueble del ArrayList de inmuebles
     * 
     * @param inm valor de inmuebles de tipo Inmueble
     */
    public static void removeInmueble(Inmueble inm) {
        if (inmuebles.contains(inm)) {
            inmuebles.remove(inm);
        } else {
            System.out.println("El inmueble no se encuentra en el ArrayList de inmuebles.");
        }
    }

    /**
     * Devuelve el ArrayList de reservas
     * 
     * @return reservas en tipo ArrayList de Reserva
     */
    public static ArrayList<Reserva> getReservas() {
        return reservas;
    }

    /**
     * Establece el ArrayList de reservas
     * 
     * @param res nuevo valor de reservas de tipo ArrayList de Reserva
     */
    public static void setReservas(ArrayList<Reserva> res) {
        reservas = res;
    }

    /**
     * Añade una reserva al ArrayList de reservas
     * 
     * @param res nuevo valor de reservas de tipo Reserva
     */
    public static void addReserva(Reserva res) {
        reservas.add(res);
    }

    /**
     * Elimina una reserva del ArrayList de reservas
     * 
     * @param res valor de reservas de tipo Reserva
     */
    public static void removeReserva(Reserva res) {
        if (reservas.contains(res)) {
            reservas.remove(res);
        } else {
            System.out.println("La reserva no se encuentra en el ArrayList de reservas.");
        }
    }

    /**
     * Devuelve true o false si el inmueble pasado como parametro está disponible en las fechas indicadas
     * 
     * @param inmueble  en tipo Inmueble
     * @param fechaEntrada en tipo LocalDate
     * @param fechaSalida en tipo LocalDate
     */
    public static boolean inmuebleDisponible(Inmueble inmueble, LocalDate fechaEntrada, LocalDate fechaSalida) {
        boolean disponible = true;
        for (Reserva res : reservas) {
            if (res.getInmueble().equals(inmueble)) {
                if (fechaEntrada.isAfter(res.getFechaEntrada()) && fechaEntrada.isBefore(res.getFechaSalida())) {
                    disponible = false;
                } else if (fechaSalida.isAfter(res.getFechaEntrada()) && fechaSalida.isBefore(res.getFechaSalida())) {
                    disponible = false;
                } else if (fechaEntrada.isBefore(res.getFechaEntrada()) && fechaSalida.isAfter(fechaSalida)) {
                    disponible = false;
                }
            }
        }
        return disponible;
    }

    /**
     * Devuelve un ArrayList de reservas ordenados por fecha de reserva.
     * 
     */
    public static ArrayList<Reserva> getReservasPorFecha() {
        Comparator<Reserva> FechaCompar = new Comparator<Reserva>() { //Se ha cambiado el tipo de la variable de Comparator a Comparator<Reserva> para evitar errores de compilación
            @Override
            public int compare(Reserva o1, Reserva o2) {
                String pr1 = o1.getFechaReserva().toString(); // Convert LocalDate to String
                String pr2 = o2.getFechaReserva().toString(); // Convert LocalDate to String
                return pr1.compareTo(pr2);
            }
        };
        Collections.sort(reservas, FechaCompar);
        return reservas;
        
    }
    
    /* Para el caso de que se le pase una fecha de referencia en frontEnd
     * if (fecha == null) {
            return reservas;
        } else if (fecha != null) {
            ArrayList<Reserva> reservasFiltradas = new ArrayList<>();
            for (Reserva res : reservas) {
                if (res.getFechaReserva().compareTo(fecha) >= 0) {
                    reservasFiltradas.add(res);
                }
            }
            return reservasFiltradas;
        }
     */

    /**
     * Devuelve un ArrayList de inmuebles ordenados por calificación de mayor a menor
     * 
     * @return inmuebles en tipo ArrayList de Inmueble
     */
    public static ArrayList<Inmueble> getInmueblesPorCalificacion() {
        Comparator<Inmueble> CalificacionCompar = new Comparator<Inmueble>() { //Se ha cambiado el tipo de la variable de Comparator a Comparator<Inmueble> para evitar errores de compilación
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                Double pr1 = o1.getCalificacion();
                Double pr2 = o2.getCalificacion();
                //return pr1.compareTo(pr2); // De menor a mayor
                return pr2.compareTo(pr1); // De mayor a menor
            }
        };
        Collections.sort(inmuebles, CalificacionCompar);
        return inmuebles;
    }

    /**
     * Devuelve un ArrayList de inmuebles ordenados por precio de menor a mayor
     * 
     * @return inmuebles en tipo ArrayList de Inmueble
     */
    public static ArrayList<Inmueble> getInmueblesPorPrecio (){
        Comparator<Inmueble> PrecioCompar = new Comparator<Inmueble>() {
            @Override
            public int compare(Inmueble o1, Inmueble o2) {
                Double pr1 = o1.getPrecioNoche();
                Double pr2 = o2.getPrecioNoche();
                return pr1.compareTo(pr2); // De menor a mayor
                //return pr2.compareTo(pr1); // De mayor a menor
            }
        };
        Collections.sort(inmuebles, PrecioCompar);
        return inmuebles;
    }
    /*  Se ha cambiado el tipo de la variable de Comparator a Comparator<Inmueble> para evitar errores de compilación
        Comparator PrecioCompar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                Double pr1 = p1.getPrecioNoche();
                Double pr2 = p2.getPrecioNoche();
                return pr1.compareTo(pr2);
            }
        };
    */

    /**
     * Devuelve un ArrayList de inmuebles filtrados por tipo
     * 
     * @param tipoInmueble tipo de inmueble en tipo String
     * @return inmuebles en tipo ArrayList de Inmueble
     */
    public static ArrayList<Inmueble> getInmueblesPorTipo(String tipoInmueble){
        if (tipoInmueble.toUpperCase().equals("CASA")) {
            tipoInmueble = TipoInmueble.CASA.toString();
        } else if (tipoInmueble.toUpperCase().equals("APARTAMENTO")){
            tipoInmueble = TipoInmueble.APARTAMENTO.toString();
        }
        ArrayList<Inmueble> inmueblesFiltrados= new ArrayList<>();
        for (Inmueble inmu : inmuebles) {
            if (inmu.getTipoInmueble().equals(TipoInmueble.valueOf(tipoInmueble))){inmueblesFiltrados.add(inmu);} //Se ha cambiado el método equalsIgnoreCase por equals para evitar errores de compilación
            //if (inmu.getTipoInmueble().toString().equals(tipoInmueble)){inmueblesFiltrados.add(inmu);} // Da igual uno que otro
        } 
        return inmueblesFiltrados; 
    }

    /*
     *
     *
    public void escribirDatos() {
        try {
            if (!inmuebles.isEmpty()) {
                try (FileOutputStream fos = new FileOutputStream("ficheroInmuebles.txt")) {
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(inmuebles);
                }
            } else {
                System.out.println("Error");
            }

        } catch (IOException ioe) {
            System.out.println("Error IO " + ioe.getMessage());
        } 
    }
    */


    /**
     * Establece el atributo personas de la clase GestorInmueble a un objeto de tipo ArrayList de Persona recuperado de un fichero
     * 
     */
    //Por si molesta el warning de unchecked xd
    @SuppressWarnings("unchecked") 
    public static void recuperarDatosPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("ficheroPersonas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            personas = (ArrayList<Persona>) ois.readObject();
            ois.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Clase no encontrada: " + cnfe.getMessage());
        }
        GestorInmueble.setPersonas(personas);
    }

    /**
     * Guarda un objeto de tipo ArrayList de Persona en un fichero
     * 
     * 
     */
    public static void guardarDatosPersonas() {
        try {
            FileOutputStream fos = new FileOutputStream("ficheroPersonas.dat");
            System.out.println("1");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("2");
            oos.writeObject(personas); // Aquí se produce el error, ni puñetera idea de por qué, pero da error de java.awt.image.BufferedImage
            System.out.println("3");
            oos.close();
            System.out.println("4");
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
            ioe.printStackTrace();
        }
    }

    /**
     * Establece el atributo inmuebles de la clase GestorInmueble a un objeto de tipo ArrayList de Inmueble recuperado de un fichero
     * 
     */
    //Por si molesta el warning de unchecked xd
    @SuppressWarnings("unchecked") 
    public static void recuperarDatosInmuebles() {
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("ficheroInmuebles.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            inmuebles = (ArrayList<Inmueble>) ois.readObject();
            ois.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Clase no encontrada: " + cnfe.getMessage());
        }
        GestorInmueble.setInmuebles(inmuebles);
    }

    /**
     * Guarda un objeto de tipo ArrayList de Persona en un fichero
     * 
     * 
     */
    public static void guardarDatosInmuebles() {
        try {
            FileOutputStream fos = new FileOutputStream("ficheroInmuebles.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(inmuebles);
            oos.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        }
    }

    /**
     * Establece el atributo reservas de la clase GestorInmueble a un objeto de tipo ArrayList de Reserva recuperado de un fichero
     * 
     */
    //Por si molesta el warning de unchecked xd
    @SuppressWarnings("unchecked") 
    public static void recuperarDatosReservas() {
        ArrayList<Reserva> reservas = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("ficheroReservas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            reservas = (ArrayList<Reserva>) ois.readObject();
            ois.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Clase no encontrada: " + cnfe.getMessage());
        }
        GestorInmueble.setReservas(reservas);
    }

    /**
     * Guarda un objeto de tipo ArrayList de Reserva en un fichero
     * 
     * 
     */
    public static void guardarDatosReservas() {
        try {
            FileOutputStream fos = new FileOutputStream("ficheroReservas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(reservas);
            oos.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        }
    }


    // qeu se supone que hace esto?
    /**
     *
     * @param indice
     * @return
     */
    public static Inmueble accederInmueble(int indice) {
        Inmueble inm = inmuebles.get(indice);
        return inm;
    }   


}
