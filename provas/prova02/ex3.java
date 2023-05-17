package provas.prova02;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int ano;

        System.out.print("Informe o ano de nascimento: ");
        ano = entrada.nextInt();

        if (ano < 0) {
            System.out.println("Ano inválido!!");
        } else {
            if (2023-ano>=16) {
                System.out.println("Possui mais de 16 anos");
            }else {
                System.out.println("Possui menos de 16 anos");
            }
        }

        entrada.close();
    }
}
