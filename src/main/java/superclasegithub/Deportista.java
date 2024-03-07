package superclasegithub;


public class Deportista extends Persona {

    private String deporte;

    public Deportista(String nombre, String apellido, int edad, String deporte) {
        super(nombre, apellido, edad);
        this.deporte = deporte;
    }
}