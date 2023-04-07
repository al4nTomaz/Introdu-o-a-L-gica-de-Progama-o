
import java.util.Scanner;

public class ep07 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        int a=0, n=0, calc=1, i;

        while ((a<=0) && (n<=0)) {
            System.out.print("Digite o 2 valores inteiros e positivos: ");
            a = entrada.nextInt();
            n = entrada.nextInt();
        }

        entrada.close();

        for (i = 0; i < n; i++) {
            calc *= a;
        }

        System.out.println("O valor pontencial eh: "+calc);

        entrada.close();
    }
}
