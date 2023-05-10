package aulas.aula0905.provaWg;

import java.util.Scanner;

public class prova {

    public static final int N = 20;

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        // int vetor1[] = new int[N];
        int vetor1[] = {0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int vetor2[] = new int[N];

        int i = 0, j=0;

        // System.out.println("Informe 20 valores para o vetor: ");
        // int num;
        // do {
        //     System.out.print("-> ");
        //     num = e.nextInt();
        //     if (num == 0 || num == 1) {
        //         vetor1[i]=num;
        //         i++;
        //     }
        // } while (i<N);

        e.close();

        int contZero = 0, contUm = 0, verifica=vetor1[0];
        boolean controle=false;

        i = 0;
        do{
            verifica = vetor1[i];
            while (!controle){
                if (i<N) {                        
                    if(vetor1[i]==verifica){
                        if(verifica==0){
                            contZero++;
                        }else{
                            contUm++;
                        }
                        i++;
                    } else{
                        controle = !controle;                   
                    }
                } else {
                    break;
                }
            }

            if(verifica==0){
                vetor2[j] = contZero;
                contZero=0;
                j++;
                
            } else{
                vetor2[j] = contUm;
                contUm = 0;
                j++;
            }
            controle = !controle;

        } while(i<N);
        
        System.out.print("\n\nVetor1: |");
        int cont=1;
        for (i = 0, j=0; i < N; i++) {
            System.out.print(" "+vetor1[i]);
            if(vetor2[j]==cont){
                System.out.print(" |");
                j++;
                cont=0;
            }
            cont++;
        }

        System.out.print("\n\nVetor2: |");
        for (i = 0; i < N; i++) {
            if(vetor2[i]!=0){
                System.out.print(" "+vetor2[i]+" |");
            }
        }
    }
}
