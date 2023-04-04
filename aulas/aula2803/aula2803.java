import java.util.Scanner;

public class aula2803 {

    public static void main(String[] args) {
        //  parte 01
        /* int a, b, c;
        float  y= (float) 10.2, w=15;
        double x;
        String nome = "alan";

        a = 10;
        b = a;

        x = (y + w);
        
        System.out.println(x+" "+nome);*/

        //  parte 02

        int a, b, res = 0;

        // abrindo Scanner
        Scanner entrada = new Scanner(System.in);

        // pede os valores
        System.out.print("Digite dois valores: ");
        a = entrada.nextInt(); // lê o valor p/ a
        b = entrada.nextInt(); // lê o valor p/ b

        res = a + b; // soma os valores e atriui p/ res

        // imprime o resultado
        System.out.println("\nO resultado é: "+res);

        // fechando Scanner
        entrada.close();

        
    }
} 