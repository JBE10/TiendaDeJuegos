package negocio;



public class Prestamo {
    private int id;
    private Juego juego;
    private Cliente cliente;
    private String fecha;
    private double precio;
    public Prestamo(int id,Juego juego, Cliente cliente, String fecha, double precio) {
        this.juego = juego;
        this.cliente = cliente;
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
    }
    public Prestamo() {
        juego = null;
        cliente = null;
        id = 0;
        fecha = null;
        precio = 0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Juego getJuego() {
        return juego;
    }
    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
