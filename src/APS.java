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

        System.out.println(Arrays.toString((int[]) vetores5.get(0)));
    }

}
