import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

    static int comparacoes = 0;

    public InsertionSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] insertionSort(int[] vetor){

        for (int i = 0; i < vetor.length; i++){

            int num = vetor[i];

            for (int j = i - 1; j >= 0 && vetor[j] > num; j--){
                vetor[j + 1] = vetor[j];
                vetor[j] = num;
                comparacoes++;
            }
        }

        return vetor;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(insertionSort(vetorOrdenado));
        }

        return listaOrdenada;
    }

}
