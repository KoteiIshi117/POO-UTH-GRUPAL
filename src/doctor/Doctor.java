
package doctor;


public class Doctor extends Persona {

    private String especialidad;

    public Doctor(String nombre, String apellido, int edad, String especialidad) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
    }
