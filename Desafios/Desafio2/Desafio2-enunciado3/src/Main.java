import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Set up
        Map<String, CuentaCorriente> cuentasCorrientes = new HashMap<>();
        Map<String, CajaAhorro> cajasAhorro = new HashMap<>();
        Map<String, Cliente> clientes = new HashMap<>();
        List<FondoInversion> fondosInversion = new LinkedList<>();
        List<Valor> valores = new LinkedList<>();
        List<CarteraValor> carterasValor = new LinkedList<>();

        // Clientes
        Cliente cliente = new Cliente("20123543", "Rodolfo", "Lynch 1010", "23450987");

        // Fondos inversion
        fondosInversion.add(new FondoInversion("Acciones tito", 10.000, 5.0));

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
        CajaAhorro cajaAhorro = new CajaAhorro("2020", 20.000, "Fijo", cliente, 20);


        clientes.put(cliente.getDni(), cliente);
        cuentasCorrientes.put(cuentaCorriente.getNroCuenta(), cuentaCorriente);
        cajasAhorro.put(cajaAhorro.getNroCuenta(), cajaAhorro);

        // Funcionamiento sistema / Alta-Baja-Modificacion clientes
        Banco banco = new Banco(cuentasCorrientes, cajasAhorro, clientes);

        // Dar de baja un cliente
        banco.bajaCliente(cliente.getDni());

        // Dar de alta un cliente
        banco.altaCliente(cliente);

        // Modificar cliente
        Cliente nuevoCliente = new Cliente("13456123", "Mabel","Mitre 123", "12510959");
        banco.modificarCliente(cliente.getDni(), nuevoCliente);

        // Funcionamiento sistema / Extracción y Deposito de saldo en Cuenta corriente
        System.out.println("Inicio funcionalidad Extracción y Deposito de saldo");
        System.out.println("-----------------");

        CuentaCorriente cuentaCorrienteConsultada = banco.consultarCuentaCorriente("123");
        cuentaCorrienteConsultada.depositarSaldo(2000.0);
        System.out.println("-----------------");
        cuentaCorrienteConsultada.extraerSaldo(1500.0);


    }
}