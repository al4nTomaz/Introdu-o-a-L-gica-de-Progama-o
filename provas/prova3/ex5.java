package provas.prova3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, s = 0;

        do {
            System.out.print("Digite um número positivo: ");
            n = e.nextInt();
            
            if (n<=0) {
                System.out.println("\nERRO! número inválida\n");
            }
        } while (n<=0);
        System.out.println(n);

        for (int i=1; i<n; i++){
            if(n % i == 0){
                s+=i;
            }
        }

        if(s == n){
            System.out.println("\nNúmero Perfeito!");
        } else{
            System.out.println("\nNúmero Imperfeito!");
        }
        e.close();
    }    
}
