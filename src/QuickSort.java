import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public QuickSort() {
    }

    public static int[] quickSort(int[] vetor, int inicio, int fim){

        int partition = particionar(vetor, inicio, fim);

        if(partition -1 > inicio) {
            quickSort(vetor, inicio, partition - 1);
        }
        if(partition +1 < fim) {
            quickSort(vetor, partition + 1, fim);
        }

        return vetor;
    }

    private static int particionar(int[] vetor, int inicio, int fim){
        int pivot = vetor[fim];

        for (int i = inicio; i < fim; i++){
            if(vetor[i] < pivot){
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
