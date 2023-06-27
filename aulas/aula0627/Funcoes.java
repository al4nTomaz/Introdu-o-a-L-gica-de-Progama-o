package aulas.aula0627;

import java.util.Random;

public class Funcoes {

    public static final int L = 5;
    public static final int C = 5;

    public static void main(String[] args) {    

        Random random = new Random();
        
        int matrizA[][] = new int[L][C];
        int matrizB[][] = new int[L][C];
        int matrizC[][] = new int[L][C];

        int i, j, k;
        
        
        for (i = 0; i < L; i++) {
            for (j = 0; j < C; j++) {
                matrizA[i][j] = random.nextInt(101);
                matrizB[i][j] = random.nextInt(101);
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }   
        }

        for (i = 0; i < L; i++) {
            for (j = 0; j < C; j++) {
                for (k = 0; k < C; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j]; 
                }
            }   
        }

        System.out.println("\n\t\t\tMATRIZ_A: ");
        mostraMatriz(matrizA, false);        
        
        System.out.println("\n\t\t\tMATRIZ_B: ");        
        mostraMatriz(matrizB, false);

        System.out.println("\n\t\t\tMATRIZ_C: ");
        mostraMatriz(matrizC, false);

        System.out.println("\n\t\tDIAGONAL DE MATRIZ_C: ");
        mostraMatriz(matrizC, true);
    }

    public static void mostraMatriz(int matriz[][], boolean diagonal){

        int i, j;
               
        for (i = 0; i < L; i++) {
            System.out.printf("\t| ");
            for (j = 0; j < C; j++) {
                if (diagonal) {
                    if (i == j) {
                        System.out.printf("%5d | ", matriz[i][j]);      
                        continue;              
                    }   
                    System.out.printf("***** | ");
                    continue;
                }
                System.out.printf("%5d | ", matriz[i][j]);
            }   
            System.out.println();
        }
        System.out.println("\n");
    }
}