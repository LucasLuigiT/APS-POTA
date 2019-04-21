import java.util.ArrayList;

public class QuickSort {

    public QuickSort() {    }

    public static void quickSort(int[] vetor, int start, int end){

        int partition = partition(vetor, start, end);

        if(partition -1 > start) {
            quickSort(vetor, start, partition - 1);
        }
        if(partition +1 < end) {
            quickSort(vetor, partition + 1, end);
        }
    }

    private static int partition(int[] vetor, int start, int end){
        int pivot = vetor[end];

        for(int i = start; i < end; i++){
            if(vetor[i] < pivot){
                int temp     = vetor[start];
                vetor[start] = vetor[i];
                vetor[i]     = temp;
                start++;
            }
        }

        int temp     = vetor[start];
        vetor[start] = pivot;
        vetor[end]   = temp;

        return start;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();
        listaOrdenada.addAll(lista);

        for (Object n: listaOrdenada) {
            quickSort((int[]) n, 0 , ((int[]) n).length -1);
        }

        return listaOrdenada;
    }


}
