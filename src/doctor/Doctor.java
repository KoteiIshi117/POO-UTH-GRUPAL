
package doctor;


public class Doctor extends Persona {

    private String especialidad;

    public Doctor(String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
    }
public class Doctor extends Persona {

    private String especialidad;

    public Doctor(String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
    }

    @Override
    public String getProfesion() {
        return "Doctor";
    }

    @Override
    public void setProfesion(String profesion) {
        // No se implementa, ya que la profesión es fija para un Doctor
    }