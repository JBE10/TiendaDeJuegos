package negocio;

import javax.xml.transform.sax.SAXResult;

public class Juego {
    private final int clasico=0;
    private final int estrenos=1;
    private final int sinClasificar=3;
    private String nombre;
    private String companiaDesarrollo;
    private int genero= sinClasificar;
    private String ubicacion;
    private int cantidadPrestamo;


    public Juego(String nombre, String compania, int genero, String ubicacion,int cantidadPrestamo) {
        this.nombre = nombre;
        this.companiaDesarrollo = compania;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.cantidadPrestamo = cantidadPrestamo;
    }
    public Juego(){
        nombre = "";
        companiaDesarrollo = "";
        genero = sinClasificar;
        ubicacion = "";
        cantidadPrestamo = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCompaniaDesarrollo() {
        return companiaDesarrollo;
    }
    public void setCompaniaDesarrollo(String companiaDesarrollo) {
        this.companiaDesarrollo = companiaDesarrollo;
    }
    public int getGenero() {
        return genero;
    }
    public void setGenero(int genero) {
        this.genero = genero;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getCantidadPrestamo() {
        return cantidadPrestamo;
    }
    public void setCantidadPrestamo(int cantidadPrestamo) {
        this.cantidadPrestamo = cantidadPrestamo;
    }

}
