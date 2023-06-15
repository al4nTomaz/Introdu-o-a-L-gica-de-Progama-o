package provas.prova04;

import java.util.Random;

public class ProvaRevi2 {

    public static void main(String[] args) {

        Random rand = new Random();

        int vetorA[] = new int[4];
        int vetorB[] = new int[6];
        int vetorC[] = new int[10];
        int vetorD[] = new int[10];

        int vetA[] = new int[4];
        int vetB[] = new int[6];

        int i = 0, j = 0, k = 0, aux, contA = 0, contB = 0;
        boolean primo = true;

        for (i = 0; i < vetB.length; i++) {
            if (i < vetA.length) {
                vetA[i] = -1;
            }
            vetB[i] = -1;
        }

    // =======================EX1==============================
        i = 0;

        vetorA[i] = rand.nextInt(5) + 1;
        vetorB[i] = rand.nextInt(5) + 1;
        i++;

        while (i < vetorB.length) {
            aux = rand.nextInt(50) + 1;
            if (i < vetorA.length) {
                if (vetorA[i - 1] > aux) {
                    continue;
                } 

                vetorA[i] = aux;
            }
            
            aux = rand.nextInt(50) + 1;            
            if (vetorB[i - 1] > aux) {
                continue;
            }

            vetorB[i] = aux;
            i++;
        }

        System.out.println();

        System.out.print("VetorA: | ");
        for (i = 0; i < vetorA.length; i++) {
            System.out.printf("%2d | ", vetorA[i]);
        }

        System.out.println();

        System.out.print("VetorB: | ");
        for (i = 0; i < vetorB.length; i++) {
            System.out.printf("%2d | ", vetorB[i]);
        }

        System.out.println();
    // =======================================================

    // =======================EX2=============================
        for (i = 0, j = 0; i < vetA.length; i++) {
            if (vetorA[i] % 2 == 0){
                contA++;
                vetA[j] = vetorA[i]; 
                j++;
            }
        }

        for (i = 0, j = 0; i < vetB.length; i++) {
            if (vetorB[i] % 2 == 0){
                contB++;
                vetB[j] = vetorB[i]; 
                j++;
            }
        }

        i = 0;
        j = 0;
        k = 0;
        while (contA != 0 || contB != 0) {
            if (contA != 0) {
                if (contB != 0) {
                    if (vetA[i] <= vetB[j]) {
                        vetorC[k] = vetA[i];
                        k++;
                        contA--;
                        vetA[i] = -1;
                        i++;
                        continue;
                    }
                }       
            }

            if (contB != 0) {
                vetorC[k] = vetB[j];
                k++;
                contB--;
                vetB[j] = -1;
                j++;
                continue;
            }

            vetorC[k] = vetA[i];
            k++;
            contA--;
            vetA[i] = -1;
            i++;
        }

        for (i = 0, j = 0; i < vetA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                contA++;
                vetA[j] = vetorA[i];
                j++;
            }
        }

        for (i = 0, j = 0; i < vetB.length; i++) {
            if (vetorB[i] % 2 != 0) {
                contB++;
                vetB[j] = vetorB[i];
                j++;
            }
        }

        i = 0;
        j = 0;
        while (contA != 0 || contB != 0) {
            if (contA != 0) {
                if (contB != 0) {
                    if (vetA[i] <= vetB[j]) {
                        vetorC[k] = vetA[i];
                        k++;
                        contA--;
                        vetA[i] = -1;
                        i++;
                        continue;
                    }
                }
                
            }

            if (contB != 0) {
                vetorC[k] = vetB[j];
                k++;
                contB--;
                vetB[j] = -1;
                j++;
                continue;
            }

            vetorC[k] = vetA[i];
            k++;
            contA--;
            vetA[i] = -1;
            i++;
        }

        System.out.print("VetorC: | ");
        for (i = 0; i < vetorC.length; i++) {
            System.out.printf("%2d | ", vetorC[i]);
        }
        System.out.println();
    // =======================================================

    // =======================EX3=============================
        
        System.out.print("Números Primos no VetorC: | ");
        for (i = 0; i < vetorC.length; i++) {
            for (j = 2; j < vetorC[i]; j++) {
                if (vetorC[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            
            if (primo && vetorC[i] != 1) {
                System.out.printf("%2d | ", vetorC[i]);
            }

            primo = true;
        }
        System.out.println();
    // =======================================================

    // =======================EX4=============================
        i = 0;
        System.out.print("VetorD: | ");
        while (i < vetorD.length) {
            vetorD[i] = 0;
            
            for (j = 1; j <= vetorC[i]; j++) {
                if (vetorC[i] % j == 0) {
                    vetorD[i] += j;
                }
            }
            System.out.printf("%2d | ", vetorD[i]);
            i++;
        }
        System.out.println();
    // =======================================================
    }
}
