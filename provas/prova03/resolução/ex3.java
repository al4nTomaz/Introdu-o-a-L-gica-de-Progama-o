package provas.prova03.resolução;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, i = 0, maior, menor;
        Double media = 0.0;

        System.out.print("Digite um número: ");
        n = e.nextInt();

        if(n < 0){
            System.out.println("Nenhum valor positivo foi digitado!!");
        } else{
            
            maior = n;
            menor = n;
            
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
            System.out.println("A soma é: "+media+"\n");
            media = (Double)media / i;
            System.out.println("Foram digitados: "+i+"\n");
            System.out.println("O maior é: "+maior+"\n");
            System.out.println("O menor é: "+menor+"\n");
            System.out.println("A media é: "+media+"\n");
        }
        
        e.close();
    }
}
