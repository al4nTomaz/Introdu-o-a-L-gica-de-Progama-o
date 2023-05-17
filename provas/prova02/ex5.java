package provas.prova02;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int opcao;
        double n1, n2;
    
        System.out.println("Calculadora");
        System.out.println("- Opção 01 (Soma)");
        System.out.println("- Opção 02 (Subtração)");
        System.out.println("- Opção 03 (Multiplicação)");
        System.out.println("- Opção 04 (Divisão)");
        System.out.println("- Opção 05 (Sair)");
        System.out.print("-> ");
        opcao = entrada.nextInt();

        if (opcao > 0 && opcao < 5){
            System.out.print("Irforme os dois valores da operação: ");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println(n1+n2);
                break;
                    
                case 2:
                    System.out.println(n1-n2);                    
                break;
        
                case 3:
                    System.out.println(n1*n2);                                    
                break;
        
                case 4:
                    System.out.println(n1/n2);                    
                break;
            }
        } else if (opcao == 5) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Valor inválido");
        }

        entrada.close();
    }

    
}
