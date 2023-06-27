package aulas.aula0509;

import java.util.Scanner;

public class primo {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int num, i=2;
        boolean controle=false;

        do {
            System.out.print("Informe um número: ");
            num = e.nextInt();           
        } while (num <= 0);

        while (i < num && !controle) {
            if(num % i == 0){
                controle = !controle;
                continue;
                // break;
            }
            i++;
        } 

        if (!controle) {
            System.out.println("É primo!!");
        } else {
            System.out.println("Não é primo!!");
        }

        e.close();
    }
}
