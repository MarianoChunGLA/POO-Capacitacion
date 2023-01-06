import java.util.List;
import java.util.Map;

public class Banco {
    private Map<String, CuentaCorriente> cuentasCorrientes;
    private Map<String, CajaAhorro> cajasAhorro;
    private Map<String, Cliente> clientes;

    public Banco(Map<String, CuentaCorriente> cuentasCorrientes, Map<String, CajaAhorro> cajasAhorro, Map<String, Cliente> clientes) {
        System.out.println("Sistema iniciado, bienvenido!!");
        this.cuentasCorrientes = cuentasCorrientes;
        this.cajasAhorro = cajasAhorro;
        this.clientes = clientes;
    }

    public void altaCliente(Cliente cliente) {
        clientes.put(cliente.getDni(), cliente);
        System.out.println("El cliente con dni " + cliente.getDni() + " fue dado de alta");
    }

    public void bajaCliente(String dni) {
        clientes.remove(dni);
        System.out.println("El cliente con dni " + dni + " fue dado de baja");
    }

    public void modificarCliente(String dni, Cliente cliente) {
        clientes.put(dni, cliente);
        System.out.println("El cliente con dni " + dni + " fue modificado, su dni ahora es " + cliente.getDni());
    }

    public Cliente consultarCliente(String dni) {
        return clientes.get(dni);
    }

    public CuentaCorriente consultarCuentaCorriente(String nroCuenta) {
        return cuentasCorrientes.get(nroCuenta);
    }

    public CajaAhorro consultarCajaAhorro(String nroCuenta) {
        return cajasAhorro.get(nroCuenta);
    }



}
