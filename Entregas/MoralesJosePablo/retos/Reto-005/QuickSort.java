public class QuickSort {
    
    public static void ordenarConIndice(String[] valores, int[] indices) {
        quickSort(valores, indices, 0, valores.length - 1);
    }

    private static void quickSort(String[] valores, int[] indices, int low, int high) {
        if (low < high) {
            int pi = partition(valores, indices, low, high);
            quickSort(valores, indices, low, pi - 1);
            quickSort(valores, indices, pi + 1, high);
        }
    }

    private static int partition(String[] valores, int[] indices, int low, int high) {
        String pivot = valores[indices[high]];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (comparar(valores[indices[j]], pivot) <= 0) {
                i++;
                int temp = indices[i];
                indices[i] = indices[j];
                indices[j] = temp;
            }
        }

        int temp = indices[i + 1];
        indices[i + 1] = indices[high];
        indices[high] = temp;

        return i + 1;
    }

    private static int comparar(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}