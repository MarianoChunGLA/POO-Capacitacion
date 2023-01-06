import java.util.List;

public class Profesor extends Persona{

    private String departamento;
    private List<AsignaturaEnCurso> asignaturasImpartidas;

    public Profesor(String dni, String nombre, String direccion, String departamento, List<AsignaturaEnCurso> asignaturasImpartidas) {
        super(dni, nombre, direccion);
        this.departamento = departamento;
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<AsignaturaEnCurso> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public void setAsignaturasImpartidas(List<AsignaturaEnCurso> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "dni='" + super.getDni() + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                '}';
    }
}
