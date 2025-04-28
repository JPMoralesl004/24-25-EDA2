public class MergeSort {
    
    public static void ordenarConIndice(String[] valores, int[] indices) {
        mergeSort(valores, indices, 0, valores.length - 1);
    }

    private static void mergeSort(String[] valores, int[] indices, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(valores, indices, l, m);
            mergeSort(valores, indices, m + 1, r);
            merge(valores, indices, l, m, r);
        }
    }

    private static void merge(String[] valores, int[] indices, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = indices[l + i];
        for (int j = 0; j < n2; ++j) R[j] = indices[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (comparar(valores[L[i]], valores[R[j]]) <= 0) indices[k++] = L[i++];
            else indices[k++] = R[j++];
        }

        while (i < n1) indices[k++] = L[i++];
        while (j < n2) indices[k++] = R[j++];
    }

    private static int comparar(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}