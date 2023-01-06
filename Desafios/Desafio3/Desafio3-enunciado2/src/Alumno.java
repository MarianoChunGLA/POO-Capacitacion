import java.util.List;

public class Alumno extends Persona{
    private Carrera carrera;
    private List<AsignaturaEnCurso> asignaturasEnCurso;
    private HistorialAcademico historialAcademico;

    public Alumno(String dni, String nombre, String direccion, Carrera carrera, List<AsignaturaEnCurso> asignaturasEnCurso, HistorialAcademico historialAcademico) {
        super(dni, nombre, direccion);
        this.carrera = carrera;
        this.asignaturasEnCurso = asignaturasEnCurso;
        this.historialAcademico = historialAcademico;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<AsignaturaEnCurso> getAsignaturasEnCurso() {
        return asignaturasEnCurso;
    }

    public void setAsignaturasEnCurso(List<AsignaturaEnCurso> asignaturasEnCurso) {
        this.asignaturasEnCurso = asignaturasEnCurso;
    }

    public HistorialAcademico getHistorialAcademico() {
        return historialAcademico;
    }

    public void setHistorialAcademico(HistorialAcademico historialAcademico) {
        this.historialAcademico = historialAcademico;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + super.getDni() + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", direccion='" + super.getDireccion() + '\'' +
                ", carrera=" + carrera +
                ", asignaturasEnCurso=" + asignaturasEnCurso +
                ", historialAcademico=" + historialAcademico +
                '}';
    }
}
