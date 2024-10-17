package usuario;

import negocio.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Empresa e=new Empresa();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    agregarJuego();
                    break;
                case 3:
                    getClientes();
                    break;
                case 4:
                    alquiler();
                    break;
                case 5:
                    juegosprestados();
                    break;
                case 6:
                    juegosSinprestamos();
                    break;

                case 7:
                    clientePrestamo();
                    break;
            }
        } while (opcion != -1);
    }
    public static void agregarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dni: ");
        int dni = sc.nextInt();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese 1 si el cliente es especial| Ingrese 2 si el cliente es comun|");
        int opcion1 = sc.nextInt();
        if (opcion1==1){
            Cliente cliente=new Especiales(dni,nombre,apellido,direccion);
            e.agregarCliente(cliente);
        }
    }
    public static void agregarJuego(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del juego: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nomrbe de la compania del juego: ");
        String compania = sc.nextLine();
        System.out.println("Ingrese el genero(1 si es estreno|0 si es clasico|3 sin clasificar): ");
        int genero = sc.nextInt();
        System.out.println("Ingrese la ubicacion del juego: ");
        String ubicacion = sc.nextLine();

        int prestamos=0;
        Juego juego=new Juego(nombre,compania,genero,ubicacion,prestamos);
        e.agregarJuego(juego);
    }
    public static ArrayList<Cliente> getClientes(){
        ArrayList<Cliente> c=e.getClientes();
        return c;
    }
    public static void alquiler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del prestamo: ");
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre del juego: ");
        Juego juego= e.buscarJuego(sc.next());
        System.out.println("Ingrese el dni del cliente: ");
        Cliente cliente=e.obtenerCLiente(sc.nextInt());

        System.out.println("Ingrese la fecha: ");
        String fecha = sc.next();
        System.out.println("Ingrese el precio: ");
        double precio = sc.nextDouble();
        Prestamo prestamo=new Prestamo(id,juego,cliente,fecha,precio);
        e.agregarPrestamo(prestamo);
    }
    public static void juegosprestados(){
        ArrayList<Juego> juegos=e.juegosAlquilados();
        for(Juego j:juegos){
            System.out.println(j.getNombre());
        }
    }
    public static void juegosSinprestamos(){
        ArrayList<Juego> juegos=e.juegosSinAlquiler();
        for(Juego j:juegos){
            System.out.println(j.getNombre());
        }
    }
    public static void clientePrestamo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dni del cliente: ");
        ArrayList<Prestamo>prestamos =e.getListaPrestamosCliente(sc.nextInt());
        for(Prestamo p:prestamos){
            System.out.println(p.getJuego().getNombre());
        }
    }


}