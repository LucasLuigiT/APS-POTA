import java.util.ArrayList;
import java.util.Arrays;

public class HeapSort {

    public HeapSort() {    }

    public static int[] heapSort(int[] vetor) {

        // Criando heap maxima
        for (int i = vetor.length / 2 - 1; i >= 0; i--)
            criarHeap(vetor, vetor.length, i);

        for (int i = vetor.length -1; i >= 0; i--) {

            int x = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = x;

            criarHeap(vetor, i, 0);
        }

        return vetor;
    }

    static void criarHeap(int vetor[], int tamanho, int i) {

        int maior = i;
        int esquerda  = 2*i + 1;
        int direita  = 2*i + 2;

        // Comparando o filho da esquerda com a raiz
        if (esquerda  < tamanho && vetor[esquerda] > vetor[maior])
            maior = esquerda;

        // Comparando o filho da direita com o maior
        if (direita  < tamanho && vetor[direita] > vetor[maior])
            maior = direita;

        // Comparando o maior com a raiz
        if (maior != i) {
            int trocar = vetor[i];
            vetor[i] = vetor[maior];
            vetor[maior] = trocar;

            // Chamada recursiva
            criarHeap(vetor, tamanho, maior);
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
