package aulas.aula0404;
import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double a, b, c, res = 0;

        System.out.print("Digite três notas: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        res = (a + b + c) / 3.0; 

        System.out.println("\nA média das notas é: "+ res);

        entrada.close();

        
    }
} 