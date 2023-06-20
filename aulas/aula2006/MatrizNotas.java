package aulas.aula2006;

import java.util.Scanner;

public class MatrizNotas {

    public static final int L = 3;
    public static final int C = 3;
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        int i = 0, j = 0;
        Double [][]notas = new Double[L][C];
        Double media = 0.0;

        String []nomes = new String[L];
        String nome = "";

        System.out.println("Digite os nomes dos 5 alunos: ");
        for (i = 0; i < nomes.length;) {
            System.out.print("-> ");
            nome = e.nextLine();
            if(!nome.isEmpty()){
                nomes[i] = nome;
                for (j = 0; j < C; j++) {
                    // System.out.print("["+nomes[i]+"] ");
                    System.out.print("nota ("+(j+1)+"): ");                
                    notas[i][j] = e.nextDouble();
                }
                // e.reset();
                e = new Scanner(System.in);
                i++;
                continue;
            }
            System.out.println("Nome não pode ser vazio!! Digite novamente!");
        }

        // System.out.println("Digite as 3 notas para cada um dos 5 alunos: ");
        // for (i = 0; i < L; i++) {
        //     for (j = 0; j < C; j++) {
        //         System.out.print("["+nomes[i]+"] ");
        //         System.out.print("nota ("+(j+1)+"): ");                
        //         notas[i][j] = e.nextDouble();
        //     }
        // }

        System.out.println("\n\t\tNOTAS: ");
        for (i = 0; i < L; i++) {
            System.out.printf("\t"+nomes[i]+" | ");
            for ( j = 0; j < C; j++) {
                System.out.printf("%.3f | ", notas[i][j]);
                media += notas[i][j];
            }   
            System.out.println("Média: "+(media/C));
            media = 0.0;
            System.out.println();
        }
        System.out.println();

        e.close();
    }
}
