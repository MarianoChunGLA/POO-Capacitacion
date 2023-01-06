public class Valor {
    private String nombre;
    private int nroTitulos;
    private double precio;

    public Valor(String nombre, int nroTitulos, double precio) {
        this.nombre = nombre;
        this.nroTitulos = nroTitulos;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroTitulos() {
        return nroTitulos;
    }

    public void setNroTitulos(int nroTitulos) {
        this.nroTitulos = nroTitulos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
