package aulas.aula0627;

import java.util.Scanner;


public class FuncaoDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double preco, porcentage, precoDesconto;

        System.out.print("Digite o preço: ");
        preco = entrada.nextDouble();
        System.out.print("Digite o desconto em porcentagem: ");
        porcentage = entrada.nextDouble();

        precoDesconto = calculaDesconto(preco, porcentage);

        System.out.println("\nO valor com desconto é: "+ precoDesconto);

        entrada.close();

        
    }

    private static double calculaDesconto(double preco, double porcentage){
        return preco - (preco * (porcentage / 100));
    }
}
