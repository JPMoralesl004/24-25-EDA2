import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class Acta {
    private final List<Alumno> alumnos;
    private final Map<String, Alumno> mapa;

    public Acta(List<Alumno> alumnos) {
        this.alumnos = Collections.unmodifiableList(new ArrayList<>(alumnos));
        this.mapa = new HashMap<>();
        for (Alumno a : alumnos) {
            mapa.put(a.getClave(), a);
        }
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public Optional<Alumno> buscarAlumno(String nombre, String apellido) {
        return Optional.ofNullable(mapa.get((nombre + "|" + apellido).toLowerCase()));
    }

    public void mostrarActa() {
        for (Alumno a : alumnos) {
            Nota n = a.getNota();
            System.out.printf("%s %s -> Parcial: %.2f, Continua: %.2f, Profesor: %.2f, Final: %.2f, Prom: %.2f\n",
                    a.getNombre(), a.getApellido(),
                    n.getParcial(), n.getContinua(),
                    n.getNotaProfesor(), n.getExamenFinal(), n.getPromedio());
        }
    }
}