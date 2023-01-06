import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Set up
        Map<String, Alumno> alumnos = new HashMap<>();
        Map<String, Profesor> profesores = new HashMap<>();

        ArrayList<AsignaturaEnCurso> asignaturasImpartidasProfesorPepe = new ArrayList<>();
        ArrayList<AsignaturaEnCurso> asignaturasImpartidasProfesorJuan = new ArrayList<>();


        // Profesores
        Profesor profesorPepe = new Profesor("20345970", "Pepe", "Siempre Viva 3008", "Sistemas", asignaturasImpartidasProfesorPepe);
        Profesor profesorJuan = new Profesor("31987345", "Juan", "Siempre Viva 2000", "Sistemas", asignaturasImpartidasProfesorJuan);

        AsignaturaEnCurso asignaturaProgramacion = new AsignaturaEnCurso("Programación", 200, "Primero", "Obligatoria", new Curso("0021", profesorPepe));
        AsignaturaEnCurso asignaturaBaseDeDatos = new AsignaturaEnCurso("Base de datos", 150, "Segundo", "Obligatoria", new Curso("002", profesorJuan));

        asignaturasImpartidasProfesorPepe.add(asignaturaProgramacion);
        asignaturasImpartidasProfesorJuan.add(asignaturaBaseDeDatos);

        profesorPepe.setAsignaturasImpartidas(asignaturasImpartidasProfesorPepe);
        profesorJuan.setAsignaturasImpartidas(asignaturasImpartidasProfesorJuan);

        profesores.put(profesorPepe.getDni(), profesorPepe);
        profesores.put(profesorJuan.getDni(), profesorJuan);

        // Carrera
        ArrayList<AsignaturaEnCurso> asignaturasCarrera = new ArrayList<>();
        asignaturasCarrera.add(asignaturaProgramacion);
        asignaturasCarrera.add(asignaturaBaseDeDatos);

        Carrera carreraIngenieriaSistemas = new Carrera(new Sede("UBA Paternal", "Paternal"), "Ingeniería en Sistemas", asignaturasCarrera);

        // Asignaturas cursadas e Historial académico
        AsignaturaCursada asignaturaCursadaProgra = new AsignaturaCursada("Programación", 200, "Primero", "Obligatoria", 4, 9);
        AsignaturaCursada asignaturaCursadaBD = new AsignaturaCursada("Base de datos", 150, "Segundo", "Obligatoria", 7, 7);

        HistorialAcademico historialAcademico = new HistorialAcademico(Arrays.asList(asignaturaCursadaProgra));

        // Alumno
        Alumno alumno = new Alumno("41258084", "Mariano" , "Calle Falsa 123", carreraIngenieriaSistemas, asignaturasImpartidasProfesorJuan, historialAcademico);

        alumnos.put(alumno.getDni(), alumno);

        // Sistema en funcionamiento
        System.out.println("-------------------");
        Universidad universidad = new Universidad(alumnos, profesores);
        System.out.println("-------------------");


        // Fallo dar de alta alumno por estar ya presente

        universidad.darAltaAlumno(alumno);

        // Lo damos de baja

        System.out.println("-------------------");
        System.out.println("Inicio dada de baja alumno");
        universidad.darBajaAlumno(alumno.getDni());
        System.out.println("-------------------");

        // Lo volvemos a dar de alta

        System.out.println("Inicio dada de alta alumno");
        universidad.darAltaAlumno(alumno);

        System.out.println("-------------------");
        System.out.println("Datos alumno dado de alta:");
        System.out.println("-------------------");

        System.out.println(alumno.getDni());
        System.out.println(alumno.getNombre());
        System.out.println(alumno.getDireccion());

        // Lo modificamos
        HistorialAcademico historialAcademicoNuevo = new HistorialAcademico(Arrays.asList(asignaturaCursadaBD));
        Alumno alumnoNuevo = new Alumno("76980211", "Julia", "Irigoin 2020", carreraIngenieriaSistemas, asignaturasImpartidasProfesorPepe, historialAcademicoNuevo);

        universidad.modificarAlumno(alumno.getDni(), alumnoNuevo);

        // Vemos los datos modificados
        Alumno alumnoConsultado = universidad.consultarAlumno(alumnoNuevo.getDni());

        System.out.println("-------------------");
        System.out.println("Alumno modificado");
        System.out.println("-------------------");

        System.out.println(alumnoConsultado.getDni());
        System.out.println(alumnoConsultado.getNombre());
        System.out.println(alumnoConsultado.getDireccion());

        System.out.println("-------------------");
        System.out.println("Consultamos asignaturas de cada profesor");
        System.out.println("-------------------");

        System.out.println("Profesor Pepe");
        System.out.println(universidad.consultarAsignaturasProfesor(profesorPepe.getDni()));
        System.out.println("Profesor Juan");
        System.out.println(universidad.consultarAsignaturasProfesor(profesorJuan.getDni()));

    }
}