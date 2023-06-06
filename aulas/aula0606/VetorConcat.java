package aulas.aula0606;

import java.util.Scanner;

public class VetorConcat {

    public static final int N1 = 5;
    public static final int N2 = 8;
    public static final int N3 = 13;

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);

        int vetor1[] = new int[5];
        int vetor2[] = new int[8];
        int vetor3[] = new int[13];

        int i, j, num = 0;
        boolean repetido = false;

        System.out.print("\nVetor1: \n\n");
        i = 0;
        while (i < vetor1.length) {
            repetido = false;
            System.out.printf("[%d] -> ", i+1);
            num = e.nextInt();
            if (num <= 0) {
                System.out.println("Erro!! Número tem que ser maior que 0;");
                continue;
            } 
            
            for (j = 0; j < i; j++) {
                if (num <= vetor1[j]) {
                    repetido = !repetido;
                    break;
                }
            }

            if (repetido) { 
                System.out.println("Erro!! Número pode ser repetido e nem menor que o anterior;");
                continue;
            }

            vetor1[i] = num;
            i++;
        }

        System.out.print("\nVetor2: \n\n");
        i = 0;
        while (i < vetor2.length) {
            repetido = false;
            System.out.printf("[%d] -> ", i+1);
            num = e.nextInt();
            if (num <= 0) {
                System.out.println("Erro!! Número tem que ser maior que 0;");
                continue;
            } 
            
            for (j = 0; j < i; j++) {
                if (num <= vetor2[j]) {
                    repetido = !repetido;
                    break;
                }
            }

            if (repetido) { 
                System.out.println("Erro!! Número pode ser repetido e nem menor que o anterior;");
                continue;
            }

            vetor2[i] = num;
            i++;
        }

        i = 0;
        j = 0;
        while (i < vetor3.length) {
            if (j < vetor1.length) {
                vetor3[i] = vetor1[j];
                i++;
            }
            
            if (j < vetor2.length) {
                vetor3[i] = vetor2[j];
            }
            j++;
            i++;
        }

        System.out.print("\nVetor1: | ");
        for (i = 0; i < vetor1.length; i++) {
            
            System.out.printf("%5d | ", vetor1[i]);
        }
        System.out.println();

        System.out.print("Vetor2: | ");
        for (i = 0; i < vetor2.length; i++) {
            
            System.out.printf("%5d | ", vetor2[i]);
        }
        System.out.println();

        System.out.print("Vetor3: | ");
        for (i = 0; i < vetor3.length; i++) {
            
            System.out.printf("%5d | ", vetor3[i]);
        }
        System.out.println();

        e.close();        
    }

}
