public class Asignatura {
    private String nombre;
    private int cantHoras;
    private String cuatrimestre;
    private String tipo;
    private double notaCursada;
    private double notaFinal;
    private Curso cursoAsignado;

    public Asignatura(String nombre, int cantHoras, String cuatrimestre, String tipo, Curso cursoAsignado) {
        this.nombre = nombre;
        this.cantHoras = cantHoras;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
        this.cursoAsignado = cursoAsignado;
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

    public double getNotaCursada() {
        return notaCursada;
    }

    public void setNotaCursada(double notaCursada) {
        this.notaCursada = notaCursada;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(Curso cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", cantHoras=" + cantHoras +
                ", cuatrimestre='" + cuatrimestre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", notaCursada=" + notaCursada +
                ", notaFinal=" + notaFinal +
                ", cursoAsignado=" + cursoAsignado +
                '}';
    }
}
