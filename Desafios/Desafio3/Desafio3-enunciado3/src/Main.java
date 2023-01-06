import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Set up
        Map<String, CuentaBancaria> cuentasBancarias = new HashMap<>();
        Map<String, Cliente> clientes = new HashMap<>();
        List<FondoInversion> fondosInversion = new LinkedList<>();
        List<Valor> valores = new LinkedList<>();
        List<CarteraValor> carterasValor = new LinkedList<>();

        // Clientes
        Cliente cliente = new Cliente("20123543", "Rodolfo", "Lynch 1010", "23450987");

        // Fondos inversion
        fondosInversion.add(new FondoInversion("Acciones tito", 10000, 5.0));

        // Valores
        valores.add(new Valor("Google", 20, 200.0));

        // Carteras valor
        carterasValor.add(new CarteraValor(valores));

        // Cuentas corrientes
        CuentaCorriente cuentaCorriente = new CuentaCorriente(
                "123",
                2000.0,
                "Fijo",
                cliente,
                Arrays.asList(new TarjetaCredito("Platinum", "4000-1234-1111-2312", cliente)),
                fondosInversion,
                carterasValor
        );

        // Cajas Ahorro
        CajaAhorro cajaAhorro = new CajaAhorro("2020", 20000, "Fijo", cliente, 20);

        clientes.put(cliente.getDni(), cliente);
        cuentasBancarias.put(cuentaCorriente.getNroCuenta(), cuentaCorriente);
        cuentasBancarias.put(cajaAhorro.getNroCuenta(), cajaAhorro);

        // Funcionamiento sistema / Alta-Baja-Modificacion clientes

        Banco banco = new Banco(cuentasBancarias, clientes);

        System.out.println("-----------------");
        System.out.println("Inicio funcionalidad Alta-Baja-Modificación clientes");
        System.out.println("-----------------");
        // Dar de baja un cliente
        banco.bajaCliente(cliente.getDni());

        // Dar de alta un cliente
        banco.altaCliente(cliente);

        // Modificar cliente
        Cliente nuevoCliente = new Cliente("", "Mabel","Mitre 123", "12510959");
        banco.modificarCliente(cliente.getDni(), nuevoCliente);

        // Funcionamiento sistema / Extracción y Deposito de saldo en Cuenta corriente

        System.out.println("-----------------");
        System.out.println("Inicio funcionalidad Extracción y Deposito de saldo");
        System.out.println("-----------------");

        CuentaCorriente cuentaCorrienteConsultada = (CuentaCorriente) banco.consultarCuentaBancaria("123");

        cuentaCorrienteConsultada.depositarSaldo(2000.0);

        cuentaCorrienteConsultada.extraerSaldo(1500.0);

        System.out.println("-----------------");
        System.out.println("Inicio funcionalidad Consulta de caja de ahorro");
        System.out.println("-----------------");

        CajaAhorro cajaAhorroConsultada = (CajaAhorro) banco.consultarCuentaBancaria("2020");
        System.out.println("El nro de cuenta de la caja de ahorro es: " + cajaAhorroConsultada.getNroCuenta());
        System.out.println("El saldo de la caja de ahorro es: $" + cajaAhorroConsultada.getSaldo());
        System.out.println("El nro de meses que estará abierta la caja de ahorro es de: " + cajaAhorroConsultada.getNroMesesAbierta());

        System.out.println("-----------------");
        System.out.println("Inicio funcionalidad Consulta de Cliente");
        System.out.println("-----------------");

        Cliente clienteConsultado = banco.consultarCliente("20123543");
        System.out.println("Dni del cliente: " + clienteConsultado.getDni());
        System.out.println("Nombre del cliente: " + clienteConsultado.getNombre());
        System.out.println("Dirección del cliente: " + clienteConsultado.getDireccion());
    }
}