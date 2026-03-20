public class Profesor extends Personas implements Mostrarr {


    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
    }

    @Override
    public void mostrar() {
        System.out.println("Profesor: " + getNombre() + " - " + getEspecialidad());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
