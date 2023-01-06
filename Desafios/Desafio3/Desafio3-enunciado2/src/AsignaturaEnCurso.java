public class AsignaturaEnCurso extends Asignatura{
    private Curso cursoAsignado;

    public AsignaturaEnCurso(String nombre, int cantHoras, String cuatrimestre, String tipo, Curso cursoAsignado) {
        super(nombre, cantHoras, cuatrimestre, tipo);
        this.cursoAsignado = cursoAsignado;
    }

    public Curso getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(Curso cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }
}
