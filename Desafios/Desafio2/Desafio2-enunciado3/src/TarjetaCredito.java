import java.util.Date;

public class TarjetaCredito {
    private String tipo;
    private String numero;
    private Cliente titular;
    private Date fechaCaducidad;

    public TarjetaCredito(String tipo, String numero, Cliente titular) {
        this.tipo = tipo;
        this.numero = numero;
        this.titular = titular;
        this.fechaCaducidad = new Date();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
}
