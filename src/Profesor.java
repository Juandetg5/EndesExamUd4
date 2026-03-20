public class Profesor extends Personas implements Mostrarr {

    /**
     * @author Juan De Dios Tovar Garcia
     * este atributo define la especialidad de cada profesor
     */
    private String especialidad;

    /**
     * Constructor de profesor
     * @param nombre
     * @param especialidad
     */
    public Profesor(String nombre, String especialidad) {
        this.setNombre(nombre);
        this.setEspecialidad(especialidad);
    }

    /**
     * metodo para mostrar la informacion de profesor
     */
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
