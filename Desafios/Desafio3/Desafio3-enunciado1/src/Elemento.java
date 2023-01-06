public abstract class Elemento {

    private String tipoElemento;
    private double valorDevolucion;

    public Elemento(String tipoElemento, double valorDevolucion) {
        this.tipoElemento = tipoElemento;
        this.valorDevolucion = valorDevolucion;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public double getValorDevolucion() {
        return valorDevolucion;
    }
}
