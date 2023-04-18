package aulas.aula1804;

import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dia;

        System.out.print("incira o número do dia: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Segunda");
            break;

            case 2:
                System.out.println("Terça");
            break;

            case 3:
                System.out.println("Quarta");
            break;

            case 4:
                System.out.println("Quinta");
            break;

            case 5:
                System.out.println("Sexta");
            break;

            case 6:
                System.out.println("Sabado");
            break;
        
            case 7:
                System.out.println("Domingo");
            break;

            default:
                System.out.println("valor inválido");
            break;
        }

        if(dia <= 0 || dia > 7){
            System.out.println("valor invalido");
        }else if(dia == 1){
            System.out.println("Segunda");
        }else if(dia == 2){
            System.out.println("Terça");
        }else if(dia == 3){
            System.out.println("Quarta");
        }else if(dia == 4){
            System.out.println("Quinta");
        }else if(dia == 5){
            System.out.println("Sexta");
        }else if(dia == 6){
            System.out.println("Sabado");
        }else {
            System.out.println("Domingo");
        }
        entrada.close();
    }
}
