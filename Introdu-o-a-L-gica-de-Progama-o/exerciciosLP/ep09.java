import java.util.Random;
// import java.util.Scanner;

public class ep09 {

    public static final int N=20;
    
    public static void main(String[] args) {    

        // Scanner entrada = new Scanner(System.in);

        Random random = new Random();

        int vet[] = new int[N], i;

        for (i = 0; i < N; i++) {
            /*System.out.print("Digite valor da posicao ["+i+"]: ");
            vet[i] = entrada.nextInt();*/
            vet[i] = random.nextInt(100);
        }

        System.out.println("\nOs valores do vetor sao: ");            
        for (i = 0; i < N; i++) {
            if (i == N-1) {
                System.out.println("["+i+"]: "+vet[i]);                            
            }else{
                System.out.println("["+i+"]: "+vet[i]+ ", ");            
            }
        }    

        // entrada.close();
    }
}
