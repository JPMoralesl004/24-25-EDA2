public class IndiceOrdenado {
    
    private int[] indices;

    public IndiceOrdenado(int filas) {
        indices = new int[filas];
        for (int i = 0; i < filas; i++) {
            indices[i] = i;
        }
    }

    public void ordenarPorColumna(HojaDeCalculo hoja, int columna, int metodo) {
        String[] valores = new String[indices.length];
        for (int i = 0; i < indices.length; i++) {
            valores[i] = hoja.getCelda(indices[i], columna).getContenido();
        }

        switch (metodo) {
            case 1: MergeSort.ordenarConIndice(valores, indices); break;
            case 2: SelectionSort.ordenarConIndice(valores, indices); break;
            case 3: QuickSort.ordenarConIndice(valores, indices); break;
            default:
                System.out.println("Método de ordenamiento inválido.");
        }
    }

    public int getIndiceReal(int filaMostrada) {
        return indices[filaMostrada];
    }

    public int getTotalFilas() {
        return indices.length;
    }
}