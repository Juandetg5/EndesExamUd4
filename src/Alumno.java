import java.util.ArrayList;

public class Alumno extends Personas implements Mostrarr {

    private int edad;
    private ArrayList<Matricula> matriculas;

    public Alumno(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setMatriculas(new ArrayList<>());
    }

    public void matricular(Matricula m) {
        getMatriculas().add(m);
    }

    @Override
    public void mostrar() {
        System.out.println("Alumno: " + getNombre());

        for (Matricula m : getMatriculas()) {
            System.out.println("Asignatura: " + m.getAsignatura().getNombre() +
                    " Profesor: " + m.getProfesor().getNombre() +
                    " Nota: " + m.getNota());
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : getMatriculas()) {
            suma += m.getNota();
        }

        if (getMatriculas().size() == 0) return 0;

        return suma / getMatriculas().size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
