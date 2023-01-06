public class AsignaturaCursada extends Asignatura{

    private double notaCursada;
    private double notaFinal;

    public AsignaturaCursada(String nombre, int cantHoras, String cuatrimestre, String tipo, double notaCursada, double notaFinal) {
        super(nombre, cantHoras, cuatrimestre, tipo);
        this.notaCursada = notaCursada;
        this.notaFinal = notaFinal;
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
}
