package javabnb.backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Alejandro Fernández Ambrós
 * @author Sergio Caballero Ortego
 */

public class GestorInmueble {
    private static ArrayList<Inmueble> inmuebles = new ArrayList<>();
    private static Inmueble inm;
    
    /** Establece el ArrayList de los inmuebles
     * @param inm */
    public static void setProductos(ArrayList<Inmueble> inm) {
        inmuebles = inm;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Inmueble> getInmbueblesPorPrecio (){
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
        Collections.sort(inmuebles, PrecioCompar);
        return inmuebles;}

    /**
     *
     * @param tipoInm
     * @return
     */
    public static ArrayList<Inmueble> getTipoPropiedad(String tipoInm){
        ArrayList<Inmueble> inmFiltr= new ArrayList<>();
     for (Inmueble inmu : inmuebles) {
     if (inmu.getTipoPropiedad().equals(tipoInm)){inmFiltr.add(inmu);}
     } return inmFiltr; }
    
    /**
     *
     * @return
     */
    public static ArrayList<Inmueble> getInmbueblesPorReseña(){
    Comparator PrecioCompar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Inmueble p1 = (Inmueble) o1;
                Inmueble p2 = (Inmueble) o2;
                Double pr1 = p1.getCalificacion();
                Double pr2 = p2.getCalificacion();
                return pr1.compareTo(pr2);
            }
        };
        Collections.sort(inmuebles, PrecioCompar);
        return inmuebles;}
        
    /**
     *
     */
    public static void escribirDatos() {
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

    /**
     *
     */
    public static void leerDatos() {
        try {
            try (FileInputStream fis = new FileInputStream("ficheroInmuebles.txt")) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                inmuebles = (ArrayList<Inmueble>) ois.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Clase no encontrada: " + cnfe.getMessage());
        } 
    }
    
     public static void añadirInmueble(Inmueble inmueble) {
        inmuebles.add(inmueble);
     } 
     /**
     *
     * @param inm
     * @return
     */
    public static boolean eliminarInmueble(Inmueble inm) {
        if (inmuebles.contains(inm)) {
            inmuebles.remove(inm);
            return true;
        } else {
            return false;
        }
    }
    /**
     *
     * @param indice
     * @return
     */
    public static Inmueble accederInmueble(int indice) {
        inm = inmuebles.get(indice);
        return inm;
    }   

   
}
