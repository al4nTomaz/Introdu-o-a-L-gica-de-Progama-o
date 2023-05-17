package provas.prova02Rec;

import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int op;

        double n1, n2,res;

        System.out.print("Digite o 1º operando: ");
        n1 = e.nextDouble();

        System.out.print("Digite o 2º operando: ");
        n2 = e.nextDouble();

        System.out.println("======MENU======");
        System.out.println("-[1] Soma");
        System.out.println("-[2] Subtração");
        System.out.println("-[3] Multiplicação");
        System.out.println("-[4] Divisão");
        System.out.println("-[5] Sair");
        System.out.print("-> ");
        op = e.nextInt();

        e.close();

        if (op <= 0 || op > 5) {
            System.out.println("Opção inválida tente novamente!!");
        } else {
            switch (op) {
                 // soma
                case 1:
                    res = n1 + n2;
                    System.out.println("A Soma ["+n1+" + "+n2+"] é: "+res);
                break;
                
                // Subtração
                case 2:
                    res = n1 - n2;
                    System.out.println("A Subtração ["+n1+" - "+n2+"] é: "+res);
                break;

                // Multiplicação
                case 3:
                    res = n1 * n2;
                    System.out.println("A Multiplicação ["+n1+" x "+n2+"] é: "+res);
                break;

                // Divisão
                case 4:
                    if(n1==0 || n2 == 0){
                        System.out.println("ERRO!! Não é possivel dividir por 0");
                    }else{
                        res = n1 / n2;
                        System.out.println("A Divisão ["+n1+" / "+n2+"] é: "+res);
                    }
                break;

                default:
                    System.out.println("Saindo!!!");
                break;
            } 
        }

    }
}