import java.util.Map;

public class Banco {
    private Map<String, CuentaBancaria> cuentasBancarias;
    private Map<String, Cliente> clientes;

    public Banco(Map<String, CuentaBancaria> cuentasBancarias, Map<String, Cliente> clientes) {
        System.out.println("Sistema iniciado, bienvenido!!");
        this.cuentasBancarias = cuentasBancarias;
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
        cliente.setDni(dni);
        clientes.put(dni, cliente);
        System.out.println("El cliente con dni " + dni + " fue modificado, su dni ahora es " + cliente.getDni());
    }

    public Cliente consultarCliente(String dni) {
        return clientes.get(dni);
    }

    public CuentaBancaria consultarCuentaBancaria(String nroCuenta) {
        return cuentasBancarias.get(nroCuenta);
    }

}
