import java.util.Random;

public class ep15 {
    
    public static final int L = 5;
    public static final int C = 5;

    public static void main(String[] args) {    

        Random random = new Random();
        
        int i, j, matriz[][] = new int[L][C];
        
        System.out.println("\n\t\tMATRIZ: ");
        
        for (i = 0; i < L; i++) {
            System.out.printf("\t| ");
            for ( j = 0; j < C; j++) {
                matriz[i][j] = random.nextInt(101);
                System.out.printf("%3d | ", matriz[i][j]);
            }   
            System.out.println();
        }

        
    }
}
