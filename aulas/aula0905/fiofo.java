package aulas.aula0905;

import java.util.Scanner;

public class fiofo {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        int anterior=0, posicao=1, aux, qntd, i;
        
        // do {
        //     System.out.print("Informe o número: ");
        //     qntd = e.nextInt();
        // } while (qntd<=0);
        
        for (qntd=-1; qntd<=0;){
            System.out.print("Informe o número: ");
            qntd = e.nextInt();
        }
         
        e.close();
        
        i = qntd;

        System.out.println("\n\tCom WHILE:");
        while (qntd>0) {
            
            if(qntd == 1){
                System.out.println(posicao);
            }else{
                System.out.print(posicao+", ");
            }
            
            aux=posicao;
            posicao += anterior; 
            anterior = aux;

            qntd--;
        }
        
        qntd = i;

        System.out.println("\n\tCom FOR:");
        for (anterior=0, posicao=1; qntd > 0; qntd--){
            
            if(qntd == 1){
                System.out.println(posicao);
            }else{
                System.out.print(posicao+", ");
            }
            
            aux=posicao;
            posicao += anterior; 
            anterior = aux;
        }



    }
}
