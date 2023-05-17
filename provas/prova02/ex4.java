package provas.prova02;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num;

        System.out.print("Informe um valor positivo: ");
        num = entrada.nextInt();

        if (num <= 0) {
            System.out.println("Valor inválido!!");
        } else {
            if (num % 2 == 0 && num % 5 == 0) {
                System.out.println("Atende aos requisitos");
            } else {
                System.out.println("Não atende aos requisitos");
            }
        }

        entrada.close();
    }
}
