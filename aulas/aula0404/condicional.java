package aulas.aula0404;

import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int ano;

        System.out.print("Digite um ano: ");
        ano = entrada.nextInt();

        if ((ano >= 0) && (ano % 4 == 0)) {
            System.out.println("bissexto");
        } else {
            System.out.println("não bissexto");
        }

        entrada.close();
    }
}
