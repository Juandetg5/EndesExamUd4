import java.util.ArrayList;

public class Curso implements Mostrarr {

    private String nombre;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;

    public Curso(String nombre) {
        this.setNombre(nombre);
        setAlumnos(new ArrayList<>());
        setAsignaturas(new ArrayList<>());
        setProfesores(new ArrayList<>());
    }

    public void agregarAlumno(Alumno a) {
        getAlumnos().add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        getAsignaturas().add(a);
    }

    public void agregarProfesor(Profesor p) {
        getProfesores().add(p);
    }
@Override
    public void mostrar() {
        System.out.println("CURSO: " + getNombre());

        for (Alumno a : getAlumnos()) {
            System.out.println("Alumno: " + a.getNombre());
        }

        for (Asignatura as : getAsignaturas()) {
            System.out.println("Asignatura: " + as.getNombre());
        }

        for (Profesor p : getProfesores()) {
            System.out.println("Profesor: " + p.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
}
