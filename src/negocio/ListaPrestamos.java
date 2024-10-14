package negocio;

import java.util.ArrayList;

public class ListaPrestamos {
    private ArrayList<Prestamo> listaPrestamos;
    private Prestamo prestamo;
    public ListaPrestamos() {
        listaPrestamos = new ArrayList<>();
        prestamo = null;
    }
    public ListaPrestamos(Prestamo prestamo) {
        this.prestamo = prestamo;
        listaPrestamos = new ArrayList<>();
    }
    public void agregarPrestamo(Prestamo prestamo) {
        for(Prestamo p: listaPrestamos) {
            if(p.getId() == prestamo.getId()) {
                System.out.println("El prestamo ya existe");
                return;
            }
        }
        listaPrestamos.add(prestamo);
        prestamo.getJuego().setCantidadPrestamo(prestamo.getJuego().getCantidadPrestamo() + 1);
        System.out.println("El prestamo ha sido agregado");
    }
    public void eliminarPrestamo(int id) {
        for(Prestamo p: listaPrestamos) {
            if(p.getId() == id) {
                listaPrestamos.remove(prestamo);
                System.out.println("El prestamo ha sido eliminado");
            }
        }
        System.out.println("El prestamo no existe");

    }
    public ArrayList<Prestamo> getListaPrestamosCliente(int numero) {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        for(Prestamo p: listaPrestamos) {
            if (p.getCliente().getNumero() == numero) {
                prestamos.add(p);
            }
        }
        return prestamos;
    }
}
