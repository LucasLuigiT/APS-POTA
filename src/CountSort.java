import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {

    static int comparacoes = 0;

    public CountSort() {
        this.comparacoes = comparacoes;
    }

    public static int[] countSort(int[] vetor){

        int n = vetor.length;

        char vetorAuxiliar[] = new char[n];

        // Vetor para armazenar o numero de ocorrencias
        int count[] = new int[256];
        for (int i=0; i < 256; ++i) {
            count[i] = 0;
        }

        // Contando as ocorrencias de cada elemento
        for (int i = 0; i < n; ++i) {
            ++count[vetor[i]];
        }

        // Alterando o vetor para que cada valor corresponda as posicoes
        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        // Criando vetor de retorno
        for (int i = n - 1; i >= 0; i--) {
            vetorAuxiliar[count[vetor[i]] -1] = (char) vetor[i];
            --count[vetor[i]];
        }

        // Atribuindo os valores no vetor de retorno ordenados
        for (int i = 0; i < n; ++i) {
            vetor[i] = vetorAuxiliar[i];
        }

        return vetor;
    }

    static ArrayList ordenar(ArrayList lista){

        ArrayList listaOrdenada = new ArrayList();

        for (Object n: lista) {
            int[] copia = (int[]) n;
            int[] vetorOrdenado = Arrays.copyOf(copia, copia.length);
            listaOrdenada.add(countSort(vetorOrdenado));
        }

        return listaOrdenada;
    }


}
