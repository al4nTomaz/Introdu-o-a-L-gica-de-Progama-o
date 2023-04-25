package aulas.aula1804;

import java.util.Scanner;

public class aprovacaoMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("incira as notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();

        if(nota1 >=0 && nota1 <=10 && nota2 >=0 && nota2 <=10){

            media = (nota1+nota2)/2;
            if (media>=7) {
                System.out.println("Aprovado");
            } else if(media>=4){
                System.out.println("Exame");
            } else {
                System.out.println("Reprovado");
            }            
        }else{
            System.out.println("As notas tem de estar dentro da faixa [0 a 10]");
        }
        entrada.close();
    }
}
