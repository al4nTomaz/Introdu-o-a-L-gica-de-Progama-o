package aulas.aula0620;

import java.util.Random;

public class Matrizes {
    public static void main(String[] args) {    

        Random random = new Random();
        
        int mat[][] = new int[10][10];
        int i = 0, j = 0;

        System.out.print("\n\t\t\t\t");

        System.out.println("MATRIZ_A: ");        
        for (i = 0; i < mat.length; i++) {
        
            System.out.printf("\t| ");
        
            for ( j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(100)+1;
                        
                System.out.printf("%3d | ", mat[i][j]);
            }   
            System.out.println();
        }
        System.out.println();
    }
}
