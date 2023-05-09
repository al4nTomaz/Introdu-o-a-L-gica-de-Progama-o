package aulas.aula0905;

import java.util.Scanner;

public class dowhile {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num, i = 1, soma = 0, cont = 3;

        do {
            
            System.out.print("\n\tVoce tem "+cont+" tentativa(s)");

            System.out.print("\n\n\tdigite um número maior que zero: ");
            num = entrada.nextInt();    
            
            if (num <= 0) {
                System.out.println("\n\tValor inválido!! Digite novamente...");
                cont--;
            } 
        } while ((num <= 0) && (cont != 0));
        

        if(cont > 0){

            System.out.print("\n\t");
            
            do {
                
                soma+=i;

                // mostrando os valores de 1 até num, de maneira mais gráfica;
                if(i == num){
                    System.out.print(i);
                } else{
                    System.out.print(i+" + ");
                }

                i++;
            } while (i <= num);

            System.out.println(" = ["+soma+"]\n");    
        } else{
            System.out.println("\n\tVoce exedeu o numero de tentativas!!!\n");
        }
        
        entrada.close();
    }
}
