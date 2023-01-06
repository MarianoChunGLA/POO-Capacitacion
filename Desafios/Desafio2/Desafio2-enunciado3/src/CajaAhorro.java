import java.util.Date;

public class CajaAhorro {
    private String nroCuenta;
    private Date fechaApertura;
    private double saldo;
    private String tipoInteres;
    private Cliente cliente;
    private int nroMesesAbierta;

    public CajaAhorro(String nroCuenta, double saldo, String tipoInteres, Cliente cliente, int nroMesesAbierta) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
        this.cliente = cliente;
        this.nroMesesAbierta = nroMesesAbierta;
        this.fechaApertura = new Date();
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

    public String getTipoInteres() {
        return tipoInteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNroMesesAbierta() {
        return nroMesesAbierta;
    }
}
