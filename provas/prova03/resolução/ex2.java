package provas.prova03.resolução;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, i = 1, k=1;
        Double s = 0.0, div = 0.0;
        do {
            System.out.print("Digite um número positivo: ");
            n = e.nextInt();
            if (n<=0) {
                System.out.println("Erro! n não pode ser negativo");
                System.out.println("Digite novamente");
            }
        } while (n<=0);

        System.out.print("S =");
        while(i<=n){
            System.out.print(" 1/"+i);
            System.out.print((i<n)?((i % 2 == 0) ? " +" : " -"):"");

            div = (Double) 1.0 / i;
            s = s + (div*k);
            k *= -1;
            i++;                
        }
        System.out.println(" = "+s);
        e.close();
    }
}
