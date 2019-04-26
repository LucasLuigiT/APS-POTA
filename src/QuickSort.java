import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    static int comparacoes = 0;

    public QuickSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] quickSort(int[] vetor, int inicio, int fim){

        int parte = particionar(vetor, inicio, fim);

        if(parte -1 > inicio) {
            comparacoes++;
            quickSort(vetor, inicio, parte - 1);
        }
        if(parte +1 < fim) {
            comparacoes++;
            quickSort(vetor, parte + 1, fim);
        }

        return vetor;
    }

    private static int particionar(int[] vetor, int inicio, int fim){
        int pivot = vetor[fim];

        for (int i = inicio; i < fim; i++){

            if(vetor[i] < pivot){
                // Troca
                comparacoes++;
                int temp     = vetor[inicio];
                vetor[inicio] = vetor[i];
                vetor[i]     = temp;
                inicio++;
            }
        }

        int temp     = vetor[inicio];
        vetor[inicio] = pivot;
        vetor[fim]   = temp;

        return inicio;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(quickSort(vetorOrdenado, 0, vetorOrdenado.length -1));
        }

        return listaOrdenada;
    }


}
