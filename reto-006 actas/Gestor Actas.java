import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorActas {
    public static void main(String[] args) {
        List<Alumno> alumnosA = Arrays.asList(
            new Alumno("José Pablo", "Morales", new Nota(6.5, 7.2, 9.0, 7.0)),
            new Alumno("Ian", "Saucedo", new Nota(7.0, 5.0, 9.0, 7.8)),
            new Alumno("María", "Arroniz", new Nota(8.5, 9.0, 10.0, 8.0)),
            new Alumno("Ana", "Gutiérrez", new Nota(8.0, 8.5, 7.0, 9.5)),
            new Alumno("Luis", "Valle", new Nota(5.5, 4.0, 3.8, 4.0))
        );

        List<Alumno> alumnosB = new ArrayList<>(alumnosA);
        alumnosB.set(1, new Alumno("Nazaret", "Deras", new Nota(10, 10, 10, 10)));

        Acta acta1 = new Acta(alumnosA);
        Acta acta2 = new Acta(alumnosB);

        System.out.println("ACTA 1:");
        acta1.mostrarActa();

        System.out.println("\nACTA 2:");
        acta2.mostrarActa();

        if (seModifico(acta1, acta2)) {
            System.out.println("\nAlguien toqueteó el acta");
        } else {
            System.out.println("\nEl acta está intacta");
        }
    }

    public static boolean seModifico(Acta a1, Acta a2) {
        List<Alumno> l1 = a1.getAlumnos();
        List<Alumno> l2 = a2.getAlumnos();

        if (l1.size() != l2.size()) return true;

        for (int i = 0; i < l1.size(); i++) {
            if (!l1.get(i).equals(l2.get(i))) return true;
        }
        return false;
    }
}