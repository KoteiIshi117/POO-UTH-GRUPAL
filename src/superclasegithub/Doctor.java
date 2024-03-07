
package superclasegithub;
//Jose Armando
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
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", especialidad='" + especialidad + '\'' + '}';
    }
}
