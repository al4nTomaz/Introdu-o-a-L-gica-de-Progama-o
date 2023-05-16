package aulas.aula0905.provaWg;

// import java.util.Scanner;

public class provaCopy {

    private static final int N = 20;

    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        int[] vetor1 = {0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] vetor2 = new int[N];

        int cont = 0;
        int valorAnterior = vetor1[0];

        for (int i = 0; i < N; i++) {
            if (vetor1[i] == valorAnterior) {
                cont++;
            } else {
                vetor2[i-1] = cont;
                cont = 1;
                valorAnterior = vetor1[i];
            }
        }
        vetor2[N-1] = cont;

        System.out.println("Vetor 1: ");
        for (int valor : vetor1) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nVetor 2: ");
        for (int valor : vetor2) {
            if (valor != 0) {
                System.out.printf("%d | ", valor);
            }
        }
    }
}
