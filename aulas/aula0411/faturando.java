package aulas.aula0411;

import java.util.Scanner;

public class faturando {

    public static void main(String[] args) {

        int num, soma = 0, aux=0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número de 100 a 999: ");
        num = entrada.nextInt(); 


        soma = num  / 100; 
        aux = num  % 100; 
        soma += aux  / 10;
        soma += aux  % 10;
        
        System.out.println("\nO resultado é: "+soma);
        
        entrada.close();

        
    }
} 