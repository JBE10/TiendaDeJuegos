package negocio;

import java.util.ArrayList;

public class Empresa {
    private Cliente cliente;
    private ArrayList<Cliente> clientes;
    private Juego juego;
    private ArrayList<Juego> listaJuegos;
    private ArrayList<Prestamo> listaPrestamo;
    private Prestamo prestamo;
    public Empresa() {
        clientes = new ArrayList<>();
        listaJuegos = new ArrayList<>();
        listaPrestamo = new ArrayList<>();
        prestamo =null;
        juego = null;
        cliente=null;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void agregarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.equals(cliente)) {
                System.out.println("El cliente ya existe");
                return;
            }
        }
        clientes.add(cliente);
        System.out.println("Cliente agregado");
    }

    public void eliminarCliente(int cliente) {
        for(Cliente c : clientes) {
            if (c.getNumero()==cliente) {
                clientes.remove(c);
                System.out.println("El Cliente eliminado correctamente");
                return;

            }
        }
        System.out.println("El cliente no fue encotrado");
    }
    public Cliente obtenerCLiente (int numero) {
        for (Cliente c : clientes) {
            if (c.getNumero() == numero) {
                return c;
            }

        }
        System.out.println("El cliente no encontrado");
        return null;
    }
    public ArrayList<Juego> getListaJuegos() {
        return listaJuegos;
    }
    public void agregarJuego(Juego juego) {
        for (Juego j : listaJuegos) {
            if (j.getNombre().equals(juego.getNombre())) {
                System.out.println("El juego ya existe");
            }

        }
        listaJuegos.add(juego);
        System.out.println("El juego agregado exitosamente");
    }
    public void eliminarJuego(Juego juego) {
        for (Juego j : listaJuegos) {
            if (j.getNombre().equals(juego.getNombre())) {
                listaJuegos.remove(j);
                System.out.println("El juego eliminado exitosamente");
                return;
            }
        }
        System.out.println("Jeugo no existe");
    }
    public Juego buscarJuego(String nombre) {
        for (Juego j : listaJuegos) {
            if (j.getNombre().equals(nombre)) {
                return j;
            }
        }
        System.out.println("Juego no existe");
        return null;
    }
    public ArrayList<Juego> juegosSinAlquiler(){
        ArrayList<Juego> juegos = new ArrayList<>();
        for (Juego j : listaJuegos) {
            if (j.getCantidadPrestamo()==0){
                juegos.add(j);
            }
        }
        return juegos;
    }
    public ArrayList<Juego> juegosAlquilados(){
        ArrayList<Juego> juegos = new ArrayList<>();
        for (Juego j: listaJuegos) {
            if (j.getCantidadPrestamo()>0){
                juegos.add(j);
            }
        }
        return juegos;
    }
    public void agregarPrestamo(Prestamo prestamo) {
        for(Prestamo p: listaPrestamo) {
            if(p.getId() == prestamo.getId()) {
                System.out.println("El prestamo ya existe");
                return;
            }
        }
        listaPrestamo.add(prestamo);
        prestamo.getJuego().setCantidadPrestamo(prestamo.getJuego().getCantidadPrestamo() + 1);
        System.out.println("El prestamo ha sido agregado");
    }
    public void eliminarPrestamo(int id) {
        for(Prestamo p: listaPrestamo) {
            if(p.getId() == id) {
                listaPrestamo.remove(prestamo);
                System.out.println("El prestamo ha sido eliminado");
            }
        }
        System.out.println("El prestamo no existe");

    }
    public ArrayList<Prestamo> getListaPrestamosCliente(int numero) {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        for(Prestamo p: listaPrestamo) {
            if (p.getCliente().getNumero() == numero) {
                prestamos.add(p);
            }
        }
        return prestamos;
    }
}
