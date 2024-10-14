package negocio;

import java.util.ArrayList;

public class ListaJuegos {
    private Juego juego;
    private ArrayList<Juego> listaJuegos;
    public ListaJuegos() {
        listaJuegos = new ArrayList<>();
        juego = null;
    }
    public ListaJuegos(Juego juego) {
        this.juego = juego;
        listaJuegos = new ArrayList<>();
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

}
