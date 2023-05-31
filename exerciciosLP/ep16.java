import java.util.Random;

public class ep16{
    
    public static final int L = 5;
    public static final int C = 5;

    public static void main(String[] args) {    

        Random random = new Random();
        
        int i, j;
        int matrizA[][] = new int[L][C];
        int matrizB[][] = new int[L][C];
        int matrizC[][] = new int[L][C];
        
        System.out.println("\n\t\tMATRIZ_A: ");        
        for (i = 0; i < L; i++) {
            System.out.printf("\t| ");
            for ( j = 0; j < C; j++) {
                matrizA[i][j] = random.nextInt(101);
                matrizB[i][j] = random.nextInt(101);
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                        
                System.out.printf("%3d | ", matrizA[i][j]);
            }   
            System.out.println();
        }
        
        System.out.println("\n\t\tMATRIZ_B: ");        
        for (i = 0; i < L; i++) {
            System.out.printf("\t| ");
            for ( j = 0; j < C; j++) {
                System.out.printf("%3d | ", matrizB[i][j]);
            }   
            System.out.println();
        }

        System.out.println("\n\t\tMATRIZ_C: ");
        for (i = 0; i < L; i++) {
            System.out.printf("\t| ");
            for ( j = 0; j < C; j++) {
                System.out.printf("%3d | ", matrizC[i][j]);
            }   
            System.out.println();
        }
    }
}
