package aulas.aula1804;

import java.util.Scanner;

public class hipotenusa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        double c1, c2, h;
        System.out.print("incira os catetos: ");
        c1 = entrada.nextDouble();
        c2 = entrada.nextDouble();

        if ((c1 > 0) && (c2 > 0)) {
            h = Math.sqrt((Math.pow(c1, 2)) + (Math.pow(c2, 2)));
            System.out.println(h);

        } else {
            System.out.println("Voce digitou uma das entradas negativas!!");    
        }


        entrada.close();
        
    }
}