import java.util.Random;
import java.util.Scanner;

public class ep10 {

    public static final int N=5;
    
    public static void main(String[] args) {    

        Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        int i;
        double vet[] = new double[N], base;

        System.out.println("\nDigite uma valor pra potencia: ");            
        base = entrada.nextDouble();

        entrada.close();

        System.out.println("\n\tOs valores do vetor sao: ");            
        for (i = 0; i < N; i++) {            
            vet[i] = random.nextDouble()*101;
            if (i == N-1) {
                System.out.printf("[%d]: (%.2f)", i, vet[i]);                            
            }else{
                System.out.printf("[%d]: (%.2f),\n", i, vet[i]);                            
            }
        }


        System.out.println("\n\n\tOs valores do vetor pontenciados sao: ");            
        for (i = 0; i < N; i++) {
            vet[i] = Math.pow(vet[i], base);
            if (i == N-1) {
                System.out.printf("[%d]: (%.2f)", i, vet[i]);                            
            }else{
                System.out.printf("[%d]: (%.2f),\n", i, vet[i]);                            
            }

        }    
        
        
    }
}
