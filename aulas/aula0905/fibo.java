package aulas.aula0905;

import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        
        int anterior=0, posicao=1, aux, qntd;

        do {
            System.out.print("Informe o número: ");
            qntd = e.nextInt();
        } while (qntd<=0);
  
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

        e.close();
    }
}
