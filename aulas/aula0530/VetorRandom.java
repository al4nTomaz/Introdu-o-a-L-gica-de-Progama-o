package aulas.aula0530;

import java.util.Random;

public class VetorRandom {

    private static final int N = 10;
    public static void main(String[] args) {

        Random rand = new Random();

        int []vet = new int[N];
        int i, par=0, impar=0;

        System.out.print("Vet: | ");
        for (i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(10)+1;
            System.out.print(vet[i]+" | ");

            if (vet[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println();
        System.out.println("Pares = "+par);
        System.out.println("Impares = "+impar);
    }
}
