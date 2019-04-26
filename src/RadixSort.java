import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    static int comparacoes = 0;

    public RadixSort() {
        this.comparacoes = comparacoes;
    }

    static int[] radixSort(int[] vetor){

        int n = vetor.length;
        int maior = acharMaior(vetor, n);

        // Realiza o Count Sort para cada elemento do vetor
        for (int exp = 1; maior /exp > 0; exp *= 10) {
            CountSort.countSort(vetor);
        }

        return vetor;
    }


    // Percorre o vetor sem ordenar-lo, retornando o maior elemento do mesmo
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
