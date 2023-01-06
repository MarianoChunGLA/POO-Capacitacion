import java.util.List;
import java.util.Map;

public class Universidad {
    private Map<String, Alumno> alumnos;
    private Map<String, Profesor> profesores;
    private Tramite tramite;

    public Universidad(Map<String, Alumno> alumnos, Map<String, Profesor> profesores) {
        System.out.println("Inicio del Sistema!!");
        this.alumnos = alumnos;
        this.profesores = profesores;
        this.tramite = new Tramite((int) (Math.random() * 100) +1);
        System.out.println("Nro de tramite: " + tramite.getNroTramite() + " con fecha de inicio en " + tramite.getFechaInicio());
    }

    private boolean existeAlumno(String dni) {
        return alumnos.containsKey(dni);
    }

    public void darAltaAlumno(Alumno alumno) {
        if(existeAlumno(alumno.getDni())) {
            System.out.println("Error: No se puede dar de alta a un alumno ya inscripto en el sistema");
        } else {
            alumnos.put(alumno.getDni(), alumno);
            System.out.println("Alumno con dni " + alumno.getDni() + " dado de alta exitosamente");
        }

    }

    public void darBajaAlumno(String dni) {
        if(!existeAlumno(dni)) {
            System.out.println("Error: No se puede eliminar un alumno que no fue dado de alta");
        } else {
            alumnos.remove(dni);
            System.out.println("Alumno con dni " +  dni + " removido exitosamente!");
        }
    }

    public void modificarAlumno(String dni, Alumno alumno) {
        if(!existeAlumno(dni)) {
            System.out.println("El alumno a modificar no existe");
        } else {
            alumnos.put(alumno.getDni(), alumno);
            System.out.println("Alumno con dni " + alumno.getDni() + " modificado exitosamente!");
        }
    }

    public Alumno consultarAlumno(String dni) {
        return alumnos.get(dni);
    }

    public List<AsignaturaEnCurso> consultarAsignaturasProfesor(String dni) {
        return profesores.get(dni).getAsignaturasImpartidas();
    }




}
