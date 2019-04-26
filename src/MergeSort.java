import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    static int comparacoes = 0;

    public MergeSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] mergeSort(int[] vetor) {

        if (vetor.length < 2) {
            return vetor;
        }

        int meio = vetor.length / 2;
        int[] esq = new int[meio];
        int[] dir = new int[vetor.length - meio];

        for (int i = 0; i < meio; i++) {
            esq[i] = vetor[i];
        }
        for (int i = meio; i < vetor.length; i++) {
            dir[i - meio] = vetor[i];
        }

        mergeSort(esq);
        mergeSort(dir);

        merge(vetor, esq, dir, meio, vetor.length - meio);

        return vetor;
    }

    private static void merge(int[] a, int[] e, int[] d, int esquerda, int direita) {

        int i = 0, j = 0, k = 0;

        //Comparando
        while (i < esquerda && j < direita) {
            if (e[i] <= d[j]) {
                comparacoes++;
                a[k++] = e[i++];
            }
            else {
                a[k++] = d[j++];
            }
        }

        //  Copiando elementos da esquerda
        while (i < esquerda) {
            a[k++] = e[i++];
        }

        // Copiando elementos da direita
        while (j < direita) {
            a[k++] = d[j++];
        }
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(mergeSort(vetorOrdenado));
        }

        return listaOrdenada;
    }
}
