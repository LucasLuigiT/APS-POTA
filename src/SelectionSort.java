import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {

    static int comparacoes = 0;

    public SelectionSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] selectionSort(int[] vetor) {

        for (int i = 0; i < vetor.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < vetor.length; j++)
                if (vetor[j] < vetor[menor]) {
                    comparacoes++;
                    menor = j;
                }

            int num = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = num;
        }

        return vetor;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(selectionSort(vetorOrdenado));
        }

        return listaOrdenada;
    }

}
