import java.util.Date;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

    private List<TarjetaCredito> tarjetasCredito;
    private List<FondoInversion> fondosDeInversion;
    private List<CarteraValor> carterasDeValores;

    public CuentaCorriente(String nroCuenta, double saldo, String tipoInteres, Cliente cliente, List<TarjetaCredito> tarjetasCredito, List<FondoInversion> fondosDeInversion, List<CarteraValor> carterasDeValores) {
        super(nroCuenta, saldo, tipoInteres, cliente);
        this.tarjetasCredito = tarjetasCredito;
        this.fondosDeInversion = fondosDeInversion;
        this.carterasDeValores = carterasDeValores;
    }

    public void extraerSaldo(double saldoExtraido){
        double saldo = super.getSaldo();
        if(saldo >= saldoExtraido) {
            super.setSaldo(saldo -= saldoExtraido);
            System.out.println("Se extrajo saldo de tu cuenta, por un valor de " + saldoExtraido+ "\nSaldo anterior: " + (saldo+saldoExtraido) + " ---> Saldo actual: " + saldo);
        } else {
            System.out.println("Error: El saldo extraido es mayor al saldo de la cuenta");
        }
    }

    public void depositarSaldo(double saldoDepositado){
        double saldo = super.getSaldo();
        super.setSaldo(saldo += saldoDepositado);
        System.out.println("Se depositó saldo!! Por un valor de " + saldoDepositado +"\nSaldo anterior: " + (saldo-saldoDepositado) + " ---> Saldo actual: " + saldo);
    }

    public void altaTarjeta(TarjetaCredito tarjetaCredito) {
        tarjetasCredito.add(tarjetaCredito);
    }

    public void bajaTarjeta(TarjetaCredito tarjetaCredito) {
        tarjetasCredito.remove(tarjetaCredito);
    }

    public void altaFondo(FondoInversion fondoInversion) {
        fondosDeInversion.add(fondoInversion);
    }

    public void bajaFondo(FondoInversion fondoInversion) {
        fondosDeInversion.remove(fondoInversion);
    }

    public List<TarjetaCredito> getTarjetasCredito() {
        return tarjetasCredito;
    }

    public List<FondoInversion> getFondosDeInversion() {
        return fondosDeInversion;
    }

    public List<CarteraValor> getCarterasDeValores() {
        return carterasDeValores;
    }
}
