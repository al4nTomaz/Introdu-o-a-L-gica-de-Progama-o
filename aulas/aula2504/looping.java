package aulas.aula2504;

import java.util.Scanner;

public class looping {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num=-1, i = 1, soma = 0, cont = 3;

        while ((num <= 0) && (cont != 0)) {
            
            System.out.print("\n\t==============================================");
            System.out.print("\n\n\tVoce tem "+cont+" tentativa(s)");

            System.out.print("\n\n\tdigite um número maior que zero: ");
            num = entrada.nextInt();    
            
            if (num <= 0 && cont != 0) { 
                cont--;
                if(cont != 0) {
                    System.out.print("\n\t==============================================");
                    System.out.println("\n\n\tValor inválido!! Digite novamente...");                
                    System.out.print("\n\t==============================================");
                }
                
            }          
        }        

        if(cont > 0){

            System.out.print("\n\t");
            
            while (i <= num) {
                
                soma+=i;

                // mostrando os valores de 1 até num, de maneira mais gráfica;
                if(i == num){
                    System.out.print(i);
                } else{
                    System.out.print(i+" + ");
                }

                i++;
            }

            System.out.println(" = ["+soma+"]");    
            System.out.print("\n\t==============================================");

        } else{
            System.out.print("\n\t==============================================");
            System.out.println("\n\n\tVoce exedeu o numero de tentativas!!!");
            System.out.print("\n\t==============================================");
        }
        
        entrada.close();
    }
}