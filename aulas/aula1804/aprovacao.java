package aulas.aula1804;

import java.util.Scanner;

public class aprovacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("incira a nota: ");
        nota = entrada.nextDouble();

        if(nota >=0 && nota <=10){
            if (nota>=7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        } else{
            System.out.println("A nota tem de estar dentro da faixa [0 a 10]");
        }

        entrada.close();
    }
}
