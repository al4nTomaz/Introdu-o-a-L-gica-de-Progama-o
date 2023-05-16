package aulas.prova1605;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, i = 1;
        Double s = 0.0, div = 0.0;
        do {
            System.out.print("Digite um número positivo: ");
            n = e.nextInt();
            if (n<=0) {
                System.out.println("Erro! n não pode ser negativo");
                System.out.println("Digite novamente");
            }
        } while (n<=0);


        while(i<=n){
            div = (Double) 1.0 / i;
            if (i % 2 == 0) {
                s =  s - div;
                i++;                
            } else {
                s =  s + div;
                i++;
            }
        }
        System.out.println("S = "+s);
        e.close();
    }
}
