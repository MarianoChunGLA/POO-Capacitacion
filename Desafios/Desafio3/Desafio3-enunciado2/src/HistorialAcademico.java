import java.util.LinkedList;
import java.util.List;

public class HistorialAcademico {
    private List<AsignaturaCursada> asignaturasCursadas;

    public HistorialAcademico(List<AsignaturaCursada> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    public HistorialAcademico() {
        this.asignaturasCursadas = new LinkedList<>();
    }

    public List<AsignaturaCursada> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    public void setAsignaturasCursadas(List<AsignaturaCursada> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    @Override
    public String toString() {
        return "HistorialAcademico{" +
                "asignaturasCursadas=" + asignaturasCursadas +
                '}';
    }
}
