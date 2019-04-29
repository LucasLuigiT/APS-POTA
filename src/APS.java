import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

        Scanner entrada = new Scanner(System.in);
        boolean loop = true;

        do {

            System.out.println();
            System.out.println("MENU");
            System.out.println("0. Finalizar.");
            System.out.println("1. Ordenar vetores de 5 elementos.");
            System.out.println("2. Ordenar vetores de 10 elementos.");
            System.out.println("3. Ordenar vetores de 50 elementos.");
            System.out.println("4. Ordenar vetores de 100 elementos.");
            System.out.println("5. Ordenar vetores de 1000 elementos.");
            System.out.println("6. Ordenar vetores de 10000 elementos.");
            System.out.println();
            System.out.println("Escolha:");

            try{
                switch (Integer.parseInt(entrada.next())){
                    case 1:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores5.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge = MergeSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) merge.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion = InsertionSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) insertion.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection = SelectionSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) selection.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap = HeapSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) heap.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble = BubbleSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) bubble.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick = QuickSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) quick.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count = CountSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) count.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix = RadixSort.ordenar(vetores5);
                        System.out.println(Arrays.toString((int[]) radix.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores5.get(0)));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores10.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge2 = MergeSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) merge2.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion2 = InsertionSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) insertion2.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection2 = SelectionSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) selection2.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap2 = HeapSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) heap2.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble2 = BubbleSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) bubble2.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick2 = QuickSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) quick2.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count2 = CountSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) count2.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix2 = RadixSort.ordenar(vetores10);
                        System.out.println(Arrays.toString((int[]) radix2.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores10.get(0)));
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores50.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge3 = MergeSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) merge3.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion3 = InsertionSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) insertion3.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection3 = SelectionSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) selection3.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap3 = HeapSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) heap3.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble3 = BubbleSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) bubble3.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick3 = QuickSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) quick3.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count3 = CountSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) count3.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix3 = RadixSort.ordenar(vetores50);
                        System.out.println(Arrays.toString((int[]) radix3.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores50.get(0)));
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores100.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge4 = MergeSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) merge4.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion4 = InsertionSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) insertion4.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection4 = SelectionSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) selection4.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap4 = HeapSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) heap4.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble4 = BubbleSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) bubble4.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick4 = QuickSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) quick4.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count4 = CountSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) count4.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix4 = RadixSort.ordenar(vetores100);
                        System.out.println(Arrays.toString((int[]) radix4.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores100.get(0)));
                        break;
                    case 5:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores1000.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge5 = MergeSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) merge5.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion5 = InsertionSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) insertion5.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection5 = SelectionSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) selection5.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap5 = HeapSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) heap5.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble5 = BubbleSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) bubble5.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick5 = QuickSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) quick5.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count5 = CountSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) count5.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix5 = RadixSort.ordenar(vetores1000);
                        System.out.println(Arrays.toString((int[]) radix5.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores1000.get(0)));
                        break;
                    case 6:
                        System.out.println();
                        System.out.println("Vetor desordenado: " + Arrays.toString((int[]) vetores10000.get(0)));
                        System.out.println();

                        System.out.print("Merge Sort:     ");
                        ArrayList merge6 = MergeSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) merge6.get(0)));
                        System.out.println("Comparações: " + MergeSort.comparacoes);

                        System.out.print("Insertion Sort: ");
                        ArrayList insertion6 = InsertionSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) insertion6.get(0)));
                        System.out.println("Comparações: " + InsertionSort.comparacoes);

                        System.out.print("Selection Sort: ");
                        ArrayList selection6 = SelectionSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) selection6.get(0)));
                        System.out.println("Comparações: " + SelectionSort.comparacoes);

                        System.out.print("Heap Sort:      ");
                        ArrayList heap6 = HeapSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) heap6.get(0)));
                        System.out.println("Comparações: " + HeapSort.comparacoes);

                        System.out.print("Buble Sort:     ");
                        ArrayList bubble6 = BubbleSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) bubble6.get(0)));
                        System.out.println("Comparações: " + BubbleSort.comparacoes);

                        System.out.print("Quick Sort:     ");
                        ArrayList quick6 = QuickSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) quick6.get(0)));
                        System.out.println("Comparações: " + QuickSort.comparacoes);

                        System.out.print("Count Sort:     ");
                        ArrayList count6 = CountSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) count6.get(0)));
                        System.out.println("Comparações: " + CountSort.comparacoes);

                        System.out.print("Radix Sort:     ");
                        ArrayList radix6 = RadixSort.ordenar(vetores10000);
                        System.out.println(Arrays.toString((int[]) radix6.get(0)));
                        System.out.println("Comparações: " + RadixSort.comparacoes);

                        System.out.println();
                        System.out.println("Vetor original após a ordenação: " + Arrays.toString((int[]) vetores10000.get(0)));
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Programa finalizado.");
                        System.out.println();
                        loop = false;
                        break;
                }
            }
            catch (Exception e){
                System.out.println();
                System.out.println("Insira um numero de 0 a 6.");
            }
        } while (loop);


    }

}
