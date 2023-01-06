import java.util.List;

public class Carrera {
    private Sede sede;
    private String nombre;
    private List<AsignaturaEnCurso> asignaturasImpartidas;

    public Carrera(Sede sede, String nombre, List<AsignaturaEnCurso> asignaturasImpartidas) {
        this.sede = sede;
        this.nombre = nombre;
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<AsignaturaEnCurso> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public void setAsignaturasImpartidas(List<AsignaturaEnCurso> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }
}
