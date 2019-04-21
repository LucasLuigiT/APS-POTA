import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {

    public HeapSort() {    }

    public static int[] heapSort(int[] vetor) {

        // Criando heap
        for (int i = vetor.length / 2 - 1; i >= 0; i--)
            heapify(vetor, vetor.length, i);

        // One by one extract (Max) an element from heap and
        // replace it with the last element in the array
        for (int i = vetor.length -1; i >= 0; i--) {

            //arrA[0] is a root of the heap and is the max element in heap
            int x = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = x;

            // call max heapify on the reduced heap
            heapify(vetor, i, 0);
        }

        return vetor;
    }

    static void heapify(int vetor[], int heapSize, int i) {
        int maior = i;
        int leftChildIdx  = 2*i + 1;
        int rightChildIdx  = 2*i + 2;

        // If left child is larger than root
        if (leftChildIdx  < heapSize && vetor[leftChildIdx ] > vetor[maior])
            maior = leftChildIdx ;

        // If right child is larger than largest so far
        if (rightChildIdx  < heapSize && vetor[rightChildIdx ] > vetor[maior])
            maior = rightChildIdx ;

        // If largest is not root
        if (maior != i) {
            int trocar = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = trocar;

            // Chamada recursiva
            heapify(vetor, heapSize, maior);
        }
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(heapSort(vetorOrdenado));
        }

        return listaOrdenada;
    }
}
