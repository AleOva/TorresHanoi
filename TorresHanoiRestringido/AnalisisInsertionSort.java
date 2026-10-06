import java.util.Random;

public class AnalisisInsertionSort {

    // Algoritmo corregido con contador de comparaciones
    public static long sortAnalysisCorrected(int[] A) {
        long count = 0;
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0) {
                count++; // Cuenta cada comparación A[j] > v realizada
                if (A[j] > v) {
                    A[j + 1] = A[j];
                    j--;
                } else {
                    break; // Sale sin omitir la última comparación fallida
                }
            }
            A[j + 1] = v;
        }
        return count;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("=====================================================================");
        System.out.println("   ANALISIS DE EFICIENCIA EMPIRICA - INSERTION SORT (CASO PROMEDIO)  ");
        System.out.println("=====================================================================");
        System.out.printf("%-12s | %-22s | %-18s\n", "Tamano (n)", "Comparaciones Prom.", "Tiempo Prom. (ms)");
        System.out.println("---------------------------------------------------------------------");

        // Ejecución para tamaños de 1,000 a 20,000 en incrementos de 1,000
        for (int n = 1000; n <= 20000; n += 1000) {
            long totalComparaciones = 0;
            long totalTiempo = 0;
            int repeticiones = 3; // Promedio sobre 3 corridas por tamaño

            for (int k = 0; k < repeticiones; k++) {
                int[] A = new int[n];
                for (int i = 0; i < n; i++) {
                    A[i] = rand.nextInt(100000);
                }

                long inicio = System.currentTimeMillis();
                long comp = sortAnalysisCorrected(A);
                long fin = System.currentTimeMillis();

                totalComparaciones += comp;
                totalTiempo += (fin - inicio);
            }

            long promComp = totalComparaciones / repeticiones;
            long promTiempo = totalTiempo / repeticiones;

            System.out.printf("%-12d | %-22d | %-18d\n", n, promComp, promTiempo);
        }

        System.out.println("=====================================================================");
    }
}