package negocio;

import java.util.ArrayList;

public class ListaClientes {
    private Cliente cliente;
    private ArrayList<Cliente> clientes;
    public ListaClientes() {
        clientes = new ArrayList<>();
        cliente = null;
    }
    public ListaClientes(Cliente cliente) {
        this.cliente = cliente;
        clientes = new ArrayList<>();
    }
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.equals(cliente)) {
                System.out.println("El Cliente ya existe ");
                return;

            }
        }
        System.out.println("El cliente fue agregado correctamente");

        clientes.add(cliente);

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
}
