package aulas.aula0530;

import java.util.Scanner;

public class VetorInversoMesmo {
    private static final int N = 7;

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int []vet = new int[N];
        int i, aux, j;

        for (i = 0; i < vet.length; i++) {
            System.out.print("Digite o "+(i+1)+ "º valor: ");    
            vet[i] = e.nextInt();
        }
        System.out.println();

        System.out.print("vet Normal: | ");
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+" | "); 
        }
        System.out.println();

        for (i = 0, j = vet.length-1; i < j; i++, j--) {
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
        System.out.println();

        System.out.print("vet Invertido: | ");
        for (i = 0; i < vet.length; i++) {

            System.out.print(vet[i]+" | "); 

        }
        System.out.println();

        e.close();
    }
    
}