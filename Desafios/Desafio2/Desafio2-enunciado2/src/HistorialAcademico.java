import java.util.LinkedList;
import java.util.List;

public class HistorialAcademico {
    private List<Asignatura> asignaturasCursadas;

    public HistorialAcademico(List<Asignatura> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    public HistorialAcademico() {
        this.asignaturasCursadas = new LinkedList<>();
    }

    public List<Asignatura> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    public void setAsignaturasCursadas(List<Asignatura> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    @Override
    public String toString() {
        return "HistorialAcademico{" +
                "asignaturasCursadas=" + asignaturasCursadas +
                '}';
    }
}
