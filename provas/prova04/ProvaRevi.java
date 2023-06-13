package provas.prova04;

import java.util.Random;

public class ProvaRevi {
    
    public static void main(String[] args) {

        Random rand = new Random();

        int vetorA[] = new int[4];
        int vetorB[] = new int[6];
        int vetorC[] = new int[10];
        int vetorD[] = new int[10];

        int vetA[] = new int[4];
        int vetB[] = new int[6];

        int i = 0, j = 0, k = 0, aux;
        boolean primo = true;
        
        for (i = 0; i < vetB.length; i++) {
            if (i < vetA.length) {
                vetA[i] = -1;
            }
            vetB[i] = -1;
        }

//=======================EX1==============================
        i = 0;
        vetorA[i] = rand.nextInt(1, 51);
        i++;

        while (i < vetorA.length) {
            aux = rand.nextInt(1, 51);
            if (vetorA[i-1] > aux) {
                continue;
            } 

            vetorA[i] = aux;
            i++;
        }

        i = 0;

        vetorB[i] = rand.nextInt(1, 51);
        i++;

        while (i < vetorB.length) {
            aux = rand.nextInt(1, 51);
            if (vetorB[i-1] > aux) {
                continue;
            } 
            
            vetorB[i] = aux;
            i++;
        }
        
        System.out.println();
        
        System.out.print("VetorA: | ");
        for ( i = 0; i < vetorA.length; i++) {
            System.out.printf("%2d | ", vetorA[i]);
            
        }

        System.out.println();
        
        System.out.print("VetorB: | ");
        for ( i = 0; i < vetorB.length; i++) {
            System.out.printf("%2d | ", vetorB[i]);
            
        }
        System.out.println();
//=======================================================

//=======================EX2=============================

        System.out.println();
        for (i = 0; i < vetA.length; i++) {
            if (vetorA[i] % 2 == 0){
                vetA[i] = vetorA[i]; 
                System.out.println(vetA[i]);
            }
        }

        System.out.println();
        for (i = 0; i < vetB.length; i++) {
            if (vetorB[i] % 2 == 0){
                vetB[i] = vetorB[i]; 
                System.out.println(vetB[i]);
            }
        }
        System.out.println("imprimimdo");

        for (i = 0; i < vetB.length; i++) {
            if (i < vetA.length){
                if (vetA[i] < vetB[i]){
                    System.out.println(vetA[i]);
                    vetA[i] = -1;
                    continue;
                }
                System.out.println(vetB[i]);
            }else{
                System.out.println(vetB[i]);
            }
        }

        // i = 0;
        // j = 0;
        // while (i < vetorC.length) {
        //     if (j < vetorA.length) {
        //         vetorC[i] = vetorA[j];
        //         i++;
        //     }
            
        //     if (j < vetorB.length) {
        //         vetorC[i] = vetorB[j];
        //     }
        //     j++;
        //     i++;
        // }
        
        for (i = 0; i < vetB.length; i++) {
            if (i < vetA.length) {
                vetA[i] = -1;
            }
            vetB[i] = -1;
        }

        // for (i = 0; i < vetA.length; i++) {
        //     if (vetorA[i] % 2 != 0){
        //         vetA[i] = vetorA[i]; 
        //         // System.out.println(vetA[i]);
        //     }
        // }

        // for (i = 0; i < vetB.length; i++) {
        //     if (vetorB[i] % 2 != 0){
        //         vetB[i] = vetorB[i]; 
        //         // System.out.println(vetB[i]);
        //     }
        // }
        
        // for (i = 0; i < vetorC.length; i++){
        //     for(j = 0; j < vetorC.length; j++){
        //         if (vetorC[i] < vetorC[j]) {
        //             aux = vetorC[i];
        //             vetorC[i] = vetorC[j];
        //             vetorC[j] = aux;
        //         }
        //     }
        // }

        System.out.print("VetorC: | ");
        for (i = 0; i < vetorC.length; i++) {
            
            System.out.printf("%2d | ", vetorC[i]);
        }
        System.out.println();
//=======================================================

//=======================EX3=============================
        i = 0;
        j = 2;
        System.out.print("Números Primos no VetorC: | ");
        while (i < vetorC.length) {
            for (j = 2; j < vetorC[i]; j++){
                if(vetorC[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if (primo && vetorC[i] != 1) {
                System.out.printf("%2d | ", vetorC[i]);
            }
            i++;
            primo = true;
        }
        System.out.println();    
//=======================================================

//=======================EX4=============================
        i = 0;
        System.out.print("VetorD: | ");
        while (i < vetorD.length) {
            vetorD[i] = 0;
            for (j = 1; j<=vetorC[i]; j++){
                if(vetorC[i] % j == 0){
                    vetorD[i] += j;
                }
            }
            System.out.printf("%2d | ", vetorD[i]);
            i++;
        }
        System.out.println();
    }
//=======================================================
}
