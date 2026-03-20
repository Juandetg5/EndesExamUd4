public class Profesor {

    private String nombre;
    public String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.setNombre(nombre);
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + getNombre() + " - " + especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
