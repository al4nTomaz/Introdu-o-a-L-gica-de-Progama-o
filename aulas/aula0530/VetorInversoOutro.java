package aulas.aula0530;

import java.util.Scanner;

public class VetorInversoOutro {

    private static final int N = 5;
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        int vetA[] = new int[N];
        int vetB[] = new int[N];
        int i;

        // =========================================================
        for (i = 0; i < vetA.length; i++) {
            System.out.print("Digite o "+(i+1)+ "º valor: ");    
            vetA[i] = e.nextInt();
            vetB[vetA.length-i-1] = vetA[i];
        }
        System.out.println();

        // =========================================================
        System.out.print("vetA: | ");
        for (i = 0; i < vetA.length; i++) {

            System.out.print(vetA[i]+" | ");
        }
        System.out.println();
        
        // =========================================================
        System.out.print("vetB: | ");
        for (i = 0; i < vetB.length; i++) {
            
            System.out.print(vetB[i]+" | ");
        }
        System.out.println();
     
        e.close();
    }    
}