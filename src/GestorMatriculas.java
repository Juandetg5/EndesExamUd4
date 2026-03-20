import java.util.ArrayList;

public class GestorMatriculas {
    /**
     * @author Juan De Dios Tovar Garcia
     * Lista para matricular alumnos
     */
    private ArrayList<Matricula> matriculas;

    /**
     * Constructor del gestor
     */
    public GestorMatriculas() {
        setMatriculas(new ArrayList<>());
    }

    /**
     * Metodo para crear la matricula
     * @param a objeto alumno
     * @param as objeto asignatura
     * @param p objeto profesor
     * @param nota nota del alumno
     */
    public void crearMatricula(Alumno a, Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);

        getMatriculas().add(m);

        a.matricular(m);
    }

    /**
     * Metodo para mostrar todas las matriculas de la lista
     */
    public void mostrarTodas() {
        for (Matricula m : getMatriculas()) {
            System.out.println(
                m.getAlumno().getNombre() + " - " +
                        m.getAsignatura().getNombre() + " - " +
                        m.getProfesor().getNombre() + " - " +
                        m.getNota()
            );
        }
    }

    /**
     * Metodo para mostrar todos los alumnos que han aprobado
     */
    public void mostrarAprobados() {
        for (Matricula m : getMatriculas()) {
            if (m.getNota() >= 5) {
                System.out.println("APROBADO: " + m.getAlumno().getNombre());
            }
        }
    }

    /**
     * Metodo para subir notas a los alumnos
     * @param puntos los puntos que se van a subir a la nota
     */
    public void subirNotaTodos(double puntos) {
        for (Matricula m : getMatriculas()) {
            m.setNota(m.getNota() + puntos);

            if (m.getNota() > 10) {
                m.setNota(10);
            }
        }
    }

    /**
     * Metodo para calcular la media global de todos los alumnos
     * @return devuelve las matriculas completas
     */
    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : getMatriculas()) {
            suma += m.getNota();
        }

        if (getMatriculas().size() == 0) return 0;

        return suma / getMatriculas().size();
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
