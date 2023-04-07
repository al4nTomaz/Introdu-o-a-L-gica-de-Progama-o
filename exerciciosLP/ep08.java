
import java.util.Scanner;

public class ep08 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        int n=0, i;
        double calc = 0.0;

        while (n<=0) {
            System.out.print("Digite um valor inteiro e positivo: ");
            n = entrada.nextInt();
        }
        
        entrada.close();

        for (i = 1; i <= n; i++) {
            calc += (1.0/(double)i);
        }

        System.out.println("O valor eh: "+calc);

        entrada.close();
    }
}
