package v04;

import java.util.Arrays;
import java.util.Comparator;

public class HojaDeCalculo {

    private Celda[][] celdas;
    private final int FILAS;
    private final int COLUMNAS;

    public HojaDeCalculo(int numeroFilas, int numeroColumnas) {
        this.FILAS = numeroFilas;
        this.COLUMNAS = numeroColumnas;
        celdas = new Celda[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    public Celda getCelda(int fila, int columna) {
        return celdas[fila][columna];
    }

    public int getNumeroDeFilas() {
        return FILAS;
    }

    public int getNumeroDeColumnas() {
        return COLUMNAS;
    }
    
    public void ordenarTodasLasColumnas() {
        for (int j = 0; j < COLUMNAS; j++) {
            Celda[] columna = new Celda[FILAS];
            for (int i = 0; i < FILAS; i++) {
                columna[i] = celdas[i][j];
            }
            Arrays.sort(columna, Comparator.comparing(Celda::getContenido));
            for (int i = 0; i < FILAS; i++) {
                celdas[i][j] = columna[i];
            }
        }
    }
}