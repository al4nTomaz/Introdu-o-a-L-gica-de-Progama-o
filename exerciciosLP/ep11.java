import java.util.Random;

public class ep11 {

    public static final int N=5;
    
    public static void main(String[] args) {    

        Random random = new Random();

        int i, soma, somaGeral=0, divisor, vet[] = new int[N];

        System.out.println("\n\tOs valores do vetor sao: \n");            
        for (i = 0; i < N; i++) {            
            
            vet[i] = random.nextInt(11);

            soma = 0;

            if (vet[i]==1) {
                soma=1;
            }

            System.out.print("["+i+"]: "+ vet[i]);
            for(divisor=1; divisor < vet[i]; divisor++){
                if (vet[i] % divisor == 0) {
                    soma+=divisor;
                }
            }
            System.out.println("\t soma dos divisores -> "+soma);
            somaGeral += soma;
        }

        System.out.println("\n\t soma geral eh -> "+somaGeral);

    }
}
