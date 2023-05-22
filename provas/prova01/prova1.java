package provas.prova01;

import java.util.Scanner;

public class prova1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double r, a=0;

        // ex1
        System.out.print("incira o Raio do circulo: ");
        r = entrada.nextDouble();

        a = Math.PI*(Math.pow(r, 2.0));
        
        System.out.println(a);

        // ex2

        double c1, c2, h;
        System.out.print("incira os catetos: ");
        c1 = entrada.nextDouble();
        c2 = entrada.nextDouble();

        h = Math.sqrt((Math.pow(c1, 2)) + (Math.pow(c2, 2)));
        
        System.out.println(h);



        entrada.close();
    }
}
