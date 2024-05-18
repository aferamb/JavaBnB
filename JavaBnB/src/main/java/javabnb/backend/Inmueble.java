package javabnb.backend;
import java.util.ArrayList; 

import java.awt.image.BufferedImage;    // ni idea de si funciona
import javax.imageio.ImageIO;
/**
 *
 * @author ALEJANDRO
 */

enum TipoInmueble {CASA, APARTAMENTO}

public class Inmueble {
    
    private BufferedImage imagen;
    
    private String titulo;
    private Direccion direccion;
    private int huespedesMax;
    private int habitaciones;
    private int camas;
    private String baños;
    private TipoInmueble tipoPropiedad; // OJO cuidado
    private double precioNoche;
    private ArrayList<String> servicios;
    private ArrayList<BufferedImage> fotos;
    private double calificacion;

    public Inmueble(BufferedImage imagen, String titulo, Direccion direccion, int huespedesMax, int habitaciones, int camas, String baños, TipoInmueble tipoPropiedad, double precioNoche, ArrayList<String> servicios, ArrayList<BufferedImage> fotos, double calificacion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.direccion = direccion;
        this.huespedesMax = huespedesMax;
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.baños = baños;
        this.tipoPropiedad = tipoPropiedad;
        this.precioNoche = precioNoche;
        this.servicios = servicios;
        this.fotos = fotos;
        this.calificacion = calificacion;
    }

    
    public void añadirFoto(String rutaArchivo) throws IOException {
        imagen = ImageIO.read(new File(rutaArchivo));
    }
    public void guardarFoto (String rutaArchivo) throws IOException {
        ImageIO.write(imagen, "jpg", new File(rutaArchivo));
    }
    /**
     * Get the value of fotos
     * REVISAR LO MISMO QUE LOS OTROS ARRAYS
     *
     * @return the value of fotos
     */
    public ArrayList<BufferedImage> getFotos() {
        return fotos;
    }

    /**
     * a;ade the value of fotos
     *
     * @param nuevafoto new value of fotos
     */
    public void setFotos(BufferedImage nuevafoto) {
        fotos.add(nuevafoto);
    }

    /**
     * Get the value of calificacion
     *
     * @return the value of calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Set the value of calificacion
     * MODIFICAR para que sea automatico
     *
     * @param calificacion new value of calificacion
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Get the value of servicios
     * REVISAR, modificacon se queda o no
     * @return the value of servicios
     */
    public ArrayList<String> getServicios() {
        return new ArrayList<>(servicios);
    }

    /**
     * Set the value of servicios
     * REVISAR, modificacon se queda o no
     *
     * @param servicios new value of servicios
     */
    public void setServicios(ArrayList<String> servicios) {
        this.servicios = servicios;
    }

    /**
     * Agrega una reserv a la lista 
     * REVISAR, modificacon se queda o no/ para frontend modificacion
     *
     * @param nuevoservicio nuevo servicio de la vivienda del cliente
     */
    public void addServicios(String nuevoservicio) {
        servicios.add(nuevoservicio);
    }
    
    /**
     * Get the value of precioNoche
     *
     * @return the value of precioNoche
     */
    public double getPrecioNoche() {
        return precioNoche;
    }

    /**
     * Set the value of precioNoche
     *
     * @param precioNoche new value of precioNoche
     */
    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    /**
     * Get the value of tipoPropiedad
     *
     * @return the value of tipoPropiedad
     */
    public TipoInmueble getTipoPropiedad() {
        return tipoPropiedad;
    }

    /**
     * Set the value of tipoPropiedad
     *
     * @param tipoPropiedad new value of tipoPropiedad
     */
    public void setTipoPropiedad(TipoInmueble tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    /**
     * Get the value of baños
     *
     * @return the value of baños
     */
    public String getBaños() {
        return baños;
    }

    /**
     * Set the value of baños
     *
     * @param baños new value of baños
     */
    public void setBaños(String baños) {
        this.baños = baños;
    }

    /**
     * Get the value of camas
     *
     * @return the value of camas
     */
    public int getCamas() {
        return camas;
    }

    /**
     * Set the value of camas
     *
     * @param camas new value of camas
     */
    public void setCamas(int camas) {
        this.camas = camas;
    }

    /**
     * Get the value of habitaciones
     *
     * @return the value of habitaciones
     */
    public int getHabitaciones() {
        return habitaciones;
    }

    /**
     * Set the value of habitaciones
     *
     * @param habitaciones new value of habitaciones
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * Get the value of huespedesMax
     *
     * @return the value of huespedesMax
     */
    public int getHuespedesMax() {
        return huespedesMax;
    }

    /**
     * Set the value of huespedesMax
     *
     * @param huespedesMax new value of huespedesMax
     */
    public void setHuespedesMax(int huespedesMax) {
        this.huespedesMax = huespedesMax;
    }

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Get the value of titulo
     *
     * @return the value of titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Set the value of titulo
     *
     * @param titulo new value of titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
