package aulas.aula3005;

import java.util.Scanner;

public class VetorInverso {

    private static final int N = 5;
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        
        int vet[] = new int[N];
        int i;

        for (i = 0; i < vet.length; i++) {
            System.out.print("Digite "+(vet.length-i)+ " valores: ");    
            vet[i] = e.nextInt();
        }

        System.out.print("vet: | ");
        for (i = vet.length-1; i >= 0; i--) {
            System.out.print(vet[i]+" | ");
        }
        System.out.println();

        e.close();
    }    
}