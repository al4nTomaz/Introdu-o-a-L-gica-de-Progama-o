package aulas.aula0523;

import java.util.Scanner;

public class vetores {

    static final int N = 10;
    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        // int []vet1;
        // vet1 = new int[0];
        // System.out.println(vet1.length);
        
        // int vetInt [] = new int[10];
        // Double vetDouble [] = new Double[10];

        // vetInt[0] = 10;
        // vetDouble[0] = 10.75;
        // vetDouble[1] = vetInt[0] + vetDouble[0];

        int vet [] = new int[N];
        
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print("Digite um valor: ");
            vet[i] = e.nextInt();
        }

        for (i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        for (int v : vet) {
            System.out.println(v);
        }

        e.close();
    }
}
