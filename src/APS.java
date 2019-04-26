import java.util.ArrayList;
import java.util.Arrays;

public class APS {


    public static void main (String[] args){

        // Listas contendo 50 vetores
        ArrayList vetores5 = new ArrayList();
        vetoresAleatorios.vetor(5,vetores5);

        ArrayList vetores10 = new ArrayList();
        vetoresAleatorios.vetor(10, vetores10);

        ArrayList vetores50 = new ArrayList();
        vetoresAleatorios.vetor(50,vetores50);

        ArrayList vetores100 = new ArrayList();
        vetoresAleatorios.vetor(100, vetores100);

        ArrayList vetores1000 = new ArrayList();
        vetoresAleatorios.vetor(1000, vetores1000);

        ArrayList vetores10000 = new ArrayList();
        vetoresAleatorios.vetor(10000, vetores10000);


        // Imprimindo vetores antes da ordenacao
        System.out.print("Antes da ordenacao:");
        System.out.println(Arrays.toString((int[]) vetores5.get(0)));

        // Ordenando
        System.out.print("Chamada MERGE:     ");
        ArrayList merge = MergeSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) merge.get(0)));
        System.out.println("C: " + MergeSort.comparacoes);

        System.out.print("Chamada INSERTION: ");
        ArrayList insertion = InsertionSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) insertion.get(0)));
        System.out.println("C: " + InsertionSort.comparacoes);

        System.out.print("Chamada SELECTION: ");
        ArrayList selection = SelectionSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) selection.get(0)));
        System.out.println("C: " + SelectionSort.comparacoes);

        System.out.print("Chamada HEAPSORT:  ");
        ArrayList heap = HeapSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) heap.get(0)));
        System.out.println("C: " + HeapSort.comparacoes);

        System.out.print("Chamada BUBBLESORT:");
        ArrayList bubble = BubbleSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) bubble.get(0)));
        System.out.println("C: " + BubbleSort.comparacoes);

        System.out.print("Chamada QUICKSORT: ");
        ArrayList quick = QuickSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) quick.get(0)));
        System.out.println("C: " + QuickSort.comparacoes);

        System.out.print("Chamada COUNTSORT: ");
        ArrayList count = CountSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) count.get(0)));
        System.out.println("C: " + CountSort.comparacoes);

        System.out.print("Chamada RADIXSORT: ");
        ArrayList radix = RadixSort.ordenar(vetores10000);
        System.out.println(Arrays.toString((int[]) radix.get(0)));
        System.out.println("C: " + RadixSort.comparacoes);

        // Imprimindo vetores depois da ordenacao
        System.out.print("Apos a ordenacao:  ");
        System.out.println(Arrays.toString((int[]) vetores5.get(0)));

    }

}
