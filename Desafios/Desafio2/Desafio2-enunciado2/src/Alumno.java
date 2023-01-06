import java.util.List;

public class Alumno {
    private String dni;
    private String nombre;
    private String direccion;
    private Carrera carrera;
    private List<Asignatura> asignaturasEnCurso;
    private HistorialAcademico historialAcademico;

    public Alumno(String dni, String nombre, String direccion, Carrera carrera, List<Asignatura> asignaturasEnCurso, HistorialAcademico historialAcademico) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrera = carrera;
        this.asignaturasEnCurso = asignaturasEnCurso;
        this.historialAcademico = historialAcademico;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Asignatura> getAsignaturasEnCurso() {
        return asignaturasEnCurso;
    }

    public void setAsignaturasEnCurso(List<Asignatura> asignaturasEnCurso) {
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
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", carrera=" + carrera +
                ", asignaturasEnCurso=" + asignaturasEnCurso +
                ", historialAcademico=" + historialAcademico +
                '}';
    }
}
