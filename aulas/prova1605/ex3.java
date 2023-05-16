package aulas.prova1605;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, i = 0, maior=-1, menor=999999999;
        Double media = 0.0;

        do {
            System.out.print("Digite um número: ");
            n = e.nextInt();
            if (n<0) {
                System.out.println("\nEncerrando...\n");
            }else{
                if(n > maior){
                    maior = n;
                }
                if(n < menor){
                    menor = n;
                }
                media += n;
                i++;
            }

        } while (n>=0);

        if (i!=0) {
            System.out.println("A soma é: "+media+"\n");
            media = (Double)media / i;
            System.out.println("Foram digitados: "+i+"\n");
            System.out.println("O maior é: "+maior+"\n");
            System.out.println("O menor é: "+menor+"\n");
            System.out.println("A media é: "+media+"\n");
        } else{
            System.out.println("Nenhum valor positivo foi digitado!!");
        }
        
        e.close();
    }
}
