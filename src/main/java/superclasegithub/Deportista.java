package superclasegithub;


public class Deportista extends Persona {

    private String deporte;

    public Deportista(String nombre, String apellido, int edad, String deporte) {
        super(nombre, apellido, edad);
        this.deporte = deporte;
    }
    @Override
    public String getProfesion() {
        return "Deportista";
    }

    @Override
    public void setProfesion(String profesion) {
        // No se implementa, ya que la profesión es fija para un Deportista
    }

    public String getDeporte() {
        return deporte;
    }
     public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return super.toString() + ", deporte='" + deporte + '\'' + '}';
    }
}
    
    
    
    
    
    

