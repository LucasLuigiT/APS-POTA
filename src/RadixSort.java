import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    public RadixSort() {    }

    static int[] radixSort(int[] vetor){

        int n = vetor.length;
        int maior = acharMaior(vetor, n);

        // Do counting sort for every digit. Note that instead
        // of passing digit number, exp is passed. exp is 10^i
        // where i is current digit number
        for (int exp = 1; maior /exp > 0; exp *= 10) {
            CountSort.countSort(vetor);
        }

        return vetor;
    }

    static int acharMaior(int[] vetor, int n){

        int max = vetor[0];

        for (int i = 1; i < n; i++) {
            if (vetor[i] > max)
                max = vetor[i];
        }

        return max;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(radixSort(vetorOrdenado));
        }

        return listaOrdenada;
    }
}
