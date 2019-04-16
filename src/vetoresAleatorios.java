import java.util.ArrayList;
import java.util.Random;

public class vetoresAleatorios {

    // Construtor default
    public vetoresAleatorios() {    }

    // Cria um vetor de valores aleatorios e o adiciona em uma lista
    public static void vetor(int tamanho, ArrayList lista){

        // Gerador de numeros aleatorios
        Random gerador = new Random();

        for (int x = 0; x < 50; x++) {

            // Vetor que sera retornado
            int vet[] = new int[tamanho];

            // loop de atribuicao
            for (int i = 0; i < tamanho; i++) {
                vet[i] = gerador.nextInt(100);
            }

            lista.add(vet);
        }

    }
}
