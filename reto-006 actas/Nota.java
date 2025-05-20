import java.util.Objects;

class Nota {
    private final double exParcial;
    private final double evContinua;
    private final double notaProfesor;
    private final double exFinal;
    private final double promedio;

    public Nota(double exParcial, double evContinua, double notaProfesor, double exFinal) {
        this.exParcial = exParcial;
        this.evContinua = evContinua;
        this.notaProfesor = notaProfesor;
        this.exFinal = exFinal;
        this.promedio = calcularPromedio();
    }

    private double calcularPromedio() {
        return (this.exParcial * 0.25 + this.evContinua * 0.2 + this.notaProfesor * 0.05 + this.exFinal * 0.5);
    }

    public double getParcial() { return exParcial; }
    public double getContinua() { return evContinua; }
    public double getNotaProfesor() { return notaProfesor; }
    public double getExamenFinal() { return exFinal; }
    public double getPromedio() { return promedio; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nota)) return false;
        Nota nota = (Nota) o;
        return Double.compare(nota.exParcial, exParcial) == 0 &&
               Double.compare(nota.evContinua, evContinua) == 0 &&
               Double.compare(nota.notaProfesor, notaProfesor) == 0 &&
               Double.compare(nota.exFinal, exFinal) == 0 &&
               Double.compare(nota.promedio, promedio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exParcial, evContinua, notaProfesor, exFinal, promedio);
    }
}