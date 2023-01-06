public class CajaAhorro extends CuentaBancaria{

    private int nroMesesAbierta;

    public CajaAhorro(String nroCuenta, double saldo, String tipoInteres, Cliente cliente, int nroMesesAbierta) {
        super(nroCuenta, saldo, tipoInteres, cliente);
        this.nroMesesAbierta = nroMesesAbierta;
    }

    public int getNroMesesAbierta() {
        return nroMesesAbierta;
    }
}
