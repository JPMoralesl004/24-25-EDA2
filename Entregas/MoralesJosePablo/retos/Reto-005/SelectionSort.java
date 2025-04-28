public class SelectionSort {
    
    public static void ordenarConIndice(String[] valores, int[] indices) {
        int n = valores.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (comparar(valores[indices[j]], valores[indices[min_idx]]) < 0) {
                    min_idx = j;
                }
            }
            int temp = indices[min_idx];
            indices[min_idx] = indices[i];
            indices[i] = temp;
        }
    }

    private static int comparar(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}
