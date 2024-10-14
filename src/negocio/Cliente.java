package negocio;

public abstract class Cliente {
    private int numero;
    private String nombre;
    private String apellido;
    private String direccion;

    public Cliente(int numero, String nombre, String apellido, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    public Cliente(){
        numero = 0;
        nombre = "";
        apellido = "";
        direccion = "";
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;

    }
    public int getNumero() {
        return numero;

    }
    public void setNumero(int numero) {
        this.numero = numero;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;

    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
