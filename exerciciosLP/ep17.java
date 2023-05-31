import java.util.Scanner;

public class ep17{
    
    public static final int L = 3;
    public static final int C = 1;

    public static void main(String[] args) {    

        Scanner e = new Scanner(System.in);
        
        int i, j;
        
        String matrizNomes[][] = new String[L][C];
        
        System.out.println("\n\t\tMATRIZ DE NOMES: ");        
        for (i = 0; i < L; i++) {
            for ( j = 0; j < C; j++) {
                System.out.printf("\t %dº nome: ", i+1);
                matrizNomes[i][j] = e.nextLine();
            }   
            
        }

        System.out.println();
        for (i = 0; i < L; i++) {
            for ( j = 0; j < C; j++) {
                System.out.printf("\t %dº nome: ", i+1);
                System.out.print(matrizNomes[i][j]);
                System.out.println(" Tem "+matrizNomes[i][j].length()+" caracteres");
            }   
            System.out.println();
        }
        
        e.close();
    }
}
