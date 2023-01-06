public abstract class Asignatura {
    private String nombre;
    private int cantHoras;
    private String cuatrimestre;
    private String tipo;

    public Asignatura(String nombre, int cantHoras, String cuatrimestre, String tipo) {
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", cantHoras=" + cantHoras +
                ", cuatrimestre='" + cuatrimestre + '\'' +
                ", tipo='" + tipo + '\''  +
                '}';
    }
}
