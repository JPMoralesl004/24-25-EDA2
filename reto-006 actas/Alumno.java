import java.util.Objects;

class Alumno {
    private final String nombre;
    private final String apellido;
    private final Nota nota;

    public Alumno(String nombre, String apellido, Nota nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public Nota getNota() { return nota; }

    public String getClave() {
        return (nombre + "|" + apellido).toLowerCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return nombre.equalsIgnoreCase(alumno.nombre) &&
            apellido.equalsIgnoreCase(alumno.apellido) &&
            nota.equals(alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), apellido.toLowerCase(), nota);
    }
}