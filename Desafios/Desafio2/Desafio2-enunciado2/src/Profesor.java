import java.util.List;

public class Profesor {
    private String dni;
    private String nombre;
    private String direccion;
    private String departamento;
    private List<Asignatura> asignaturasImpartidas;

    public Profesor(String dni, String nombre, String direccion, String departamento, List<Asignatura> asignaturasImpartidas) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
        this.asignaturasImpartidas = asignaturasImpartidas;
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Asignatura> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }

    public void setAsignaturasImpartidas(List<Asignatura> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
