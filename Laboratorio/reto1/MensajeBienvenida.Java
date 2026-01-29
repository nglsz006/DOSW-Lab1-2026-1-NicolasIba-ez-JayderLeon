import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {

    public static String generarMensaje(List<Estudiante> estudiantes) {

        String descripcionEstudiantes = estudiantes.stream()
                .map(e -> e.getNombre()
                        + ", estudiante de " + e.getSemestre() + "° semestre de "
                        + e.getEdad() + " años")
                .collect(Collectors.joining(", y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        return "¡Hola, bienvenidos! Nosotros somos la pareja conformada por "
                + descripcionEstudiantes
                + ". Nuestros correos institucionales son "
                + correos + ".";
    }
}
