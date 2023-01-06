public class Curso {
    private String codigo;
    private Profesor profesorAsignado;

    public Curso(String codigo, Profesor profesorAsignado) {
        this.codigo = codigo;
        this.profesorAsignado = profesorAsignado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(Profesor profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", profesorAsignado=" + profesorAsignado +
                '}';
    }
}
