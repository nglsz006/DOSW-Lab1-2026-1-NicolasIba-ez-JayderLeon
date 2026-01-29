import java.util.ArrayList;
import java.util.List;

public class reto1 {
    public static void reto1(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante(
                "Nicolas Ibañez", 19, 5, "nicolas.ibanez-l@mail.escuelaing.edu.co"));

        estudiantes.add(new Estudiante(
                "Jeyder Leon", 20, 7, "jeyder.leon-l@mail.escuelaing.edu.co"));

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);

        System.out.println(mensaje);
    }
}
