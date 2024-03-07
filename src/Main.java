
import superclasegithub.Deportista;
import superclasegithub.Doctor;
import superclasegithub.Persona;



  public class Main {

    public static void main(String[] args) {

        Persona doctor = new Doctor("Jose", "Amaya", 45, "Cardiología");
        Persona deportista = new Deportista("Oscar ", "Zaldivar", 28, "Futbolista");

        System.out.println(doctor.toString());
        System.out.println(deportista.toString());
    }
}

