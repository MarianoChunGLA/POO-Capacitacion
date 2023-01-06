import java.util.Date;

public class FondoInversion {
    private String nombre;
    private double importe;
    private double rentabilidad;
    private Date fechaApertura;
    private Date fechaVencimiento;

    public FondoInversion(String nombre, double importe, double rentabilidad) {
        this.nombre = nombre;
        this.importe = importe;
        this.rentabilidad = rentabilidad;
        this.fechaApertura = new Date();
        this.fechaVencimiento = new Date(new Date().getTime() + 1000000000);
    }

    public String getNombre() {
        return nombre;
    }

    public double getImporte() {
        return importe;
    }

    public double getRentabilidad() {
        return rentabilidad;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }


}
