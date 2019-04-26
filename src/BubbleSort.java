import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    static int comparacoes = 0;

    public BubbleSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] bubbleSort(int [] vetor){

        int num;
        boolean inversao = true;

        while (inversao) {

            inversao = false;

            for (int i = 0; i < (vetor.length) -1; i++){

                if (vetor[i] > vetor[i + 1]){
                    // Troca
                    comparacoes++;
                    num = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = num;

                    inversao = true;
                }
            }
        }

        return vetor;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(bubbleSort(vetorOrdenado));
        }

        return listaOrdenada;
    }

}
