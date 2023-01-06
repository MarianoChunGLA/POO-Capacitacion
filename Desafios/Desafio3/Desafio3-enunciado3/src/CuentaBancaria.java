import java.util.Date;

public abstract class CuentaBancaria {
    private String nroCuenta;
    private Date fechaApertura;
    private double saldo;
    private String tipoInteres;
    private Cliente cliente;

    public CuentaBancaria(String nroCuenta, double saldo, String tipoInteres, Cliente cliente) {
        this.nroCuenta = nroCuenta;
        this.fechaApertura = new Date();
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
        this.cliente = cliente;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(String tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
