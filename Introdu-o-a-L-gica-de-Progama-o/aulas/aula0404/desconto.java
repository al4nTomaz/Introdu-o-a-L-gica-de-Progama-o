package aulas.aula0404;
import java.util.Scanner;

public class desconto {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double preco, porcentage, precoDesconto;

        System.out.print("Digite o preço: ");
        preco = entrada.nextDouble();
        System.out.print("Digite o desconto em porcentagem: ");
        porcentage = entrada.nextDouble();

        precoDesconto = preco - (preco * (porcentage / 100));

        System.out.println("\nO valor com desconto é: "+ precoDesconto);

        entrada.close();

        
    }
} 