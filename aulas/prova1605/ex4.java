package aulas.prova1605;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int totalVotos=0, op, cA = 0, cB = 0, branco = 0, nulo = 0;
        Double porcentagem = 0.0;

        do {
            System.out.println("======MENU======");
            System.out.println("-[1] Candidato A");
            System.out.println("-[2] Candidato B");
            System.out.println("-[3] Branco");
            System.out.println("-[4] Nulo");
            System.out.println("-[5] Sair");
            System.out.print("-> ");
            op = e.nextInt();
            
            if (op<1 || op > 5) {
                System.out.println("\nERRO! Opção inválida\n");
            }else{

                switch (op) {
                    case 1:
                        cA++;
                    break;

                    case 2:
                        cB++;
                    break;

                    case 3:
                        branco++;
                    break;

                    case 4:
                        nulo++;
                    break;
                    
                    default:
                        System.out.println("Saindo...\n\n");                    
                    break;
                }

            }
 
        } while (op!=5);

        totalVotos += cA + cB + branco + nulo;
        if(totalVotos > 0){

            System.out.println("======EXTRATO ELEITORAL======\n");
    
            if (cA == cB) {
                System.out.println("\t[EMPATE!]");
            } else if(cA > cB){
                System.out.println("    [Candidato A VENCOU!]");
            }else{
                System.out.println("    [Candidato B VENCOU!]");
            }
    
            System.out.println("\n\nFoi o total de votos: "+totalVotos+"\n");
    
            porcentagem = (Double)((cA * 100.0) /  totalVotos);
            System.out.printf("Cadidato A teve: %.2f ", porcentagem);
            System.out.println("%");
    
    
            porcentagem = (Double)((cB * 100.0) /  totalVotos);
            System.out.printf("Cadidato B teve: %.2f ", porcentagem);
            System.out.println("%");
    
            porcentagem = (Double)((branco * 100.0) /  totalVotos);
            System.out.printf("Em Branco: \t %.2f ", porcentagem);
            System.out.println("%");
    
            porcentagem = (Double)((nulo * 100.0) /  totalVotos);
            System.out.printf("Nulo: \t\t %.2f ", porcentagem);
            System.out.println("%");
            System.out.println("\n=============================\n");
        } else{
            System.out.println("Não há nenhum voto!");
        }


        e.close();
    }
}
