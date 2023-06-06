package aulas.aula0606;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static final int N = 6;

    public static void main(String[] args) {
        
        Scanner e = new Scanner(System.in);
        Random random = new Random();

        int numSorteados[] = new int[N];
        int numApostados[] = new int[N];
        int i, j, num = 0, acertos = 0;
        boolean repetido = false;

        i = 0;
        while (i < numSorteados.length) {
            repetido = false;
            num = random.nextInt(1, 61);
            
            for (j = 0; j < i; j++) {
                if (num == numSorteados[j]) {
                    repetido = !repetido;
                    break;
                }
            }

            if (repetido) { 
                continue;
            }

            numSorteados[i] = num;
            i++;
        }

        i = 0;
        while (i < numApostados.length) {
            System.out.printf("[%d] -> ", i);
            num = e.nextInt();
            
            if (num < 1 || num > 60) {
                System.out.println("Erro!! Número tem que ser entre 1 e 60.");
                continue;
            } 

            repetido = false;
            for (j = 0; j < i; j++) {
                if (num == numApostados[j]) {
                    repetido = !repetido;
                    break;
                }
            }

            if (repetido) { 
                System.out.println("Erro!! Número pode ser repetido.");
                continue;
            }

            numApostados[i] = num;
            i++;
            
        }

        for (i = 0; i < numSorteados.length; i++) {
            for (j = 0; j < numSorteados.length; j++) {
                if (numSorteados[j] == numApostados[i]) {
                    acertos++;
                    break;
                }
            }
        }

        
        System.out.print("Sorteados: | ");
        for (i = 0; i < numSorteados.length; i++) {
            
            System.out.printf("%2d | ", numSorteados[i]);
        }
        System.out.println();
        
        System.out.print("Apostados: | ");
        for (i = 0; i < numApostados.length; i++) {
            
            System.out.printf("%2d | ", numApostados[i]);
        }
        System.out.println();
        
        System.out.println("Foram "+acertos+" acertos!!");

        e.close();        
    }

}
