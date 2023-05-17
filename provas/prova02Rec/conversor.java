package provas.prova02Rec;

import java.util.Scanner;

public class conversor {

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int op;

        double temperatura, res;

        System.out.print("Digite a temperatura: ");
        temperatura = e.nextDouble();

        System.out.println("======MENU======");
        System.out.println("-[1] Celsius(°C) para Kelvin(K)");
        System.out.println("-[2] Celsius(°C) para Fahrenheit(F)");
        System.out.println("-[3] Fahrenheit(F) para Celsius(°C)");
        System.out.println("-[4] Fahrenheit(F) para Kelvin(K)");
        System.out.println("-[5] Kelvin(K) para Fahrenheit(F)");
        System.out.println("-[6] Kelvin(K) para Celsius(°C)");
        System.out.println("-[7] Sair");
        System.out.print("-> ");
        op = e.nextInt();

        e.close();

        if (op <= 0 || op > 7) {
            System.out.println("Opção inválida tente novamente!!");
        } else if(temperatura < 0 && (op == 5 || op == 6)){
            System.out.println("Kelvin não pode ser negativo!!");
        } else {
            switch (op) {
                 // C -> K
                case 1:
                    res = (temperatura+273);
                    System.out.println("A temperatura em Celsius ["+temperatura+" °C] para Kelvin(K) é: "+res+" K");
                break;
                
                // C -> F
                case 2:
                    res = ((temperatura*1.8)+32);
                    System.out.println("A temperatura em Celsius ["+temperatura+" °C] para Fahrenheit(F) é: "+res+" °F");
                break;

                // F -> C
                case 3:
                    res = ((temperatura-32)/1.8);
                    System.out.println("A temperatura em Fahrenheit ["+temperatura+" °F] para Celsius(°C) é: "+res+" °C");
                break;

                // F -> K
                case 4:
                    res = ((temperatura-32)*5/9)+273;
                    System.out.println("A temperatura em Fahrenheit["+temperatura+" °F] para Kelvin(K) é: "+res+" K");
                break;

                // K -> F
                case 5:
                    res = (((temperatura-273)*1.8)+32);
                    System.out.println("A temperatura em Kelvin ["+temperatura+" K] para Fahrenheit(°F) é: "+res+" °F");
                break;

                // K -> C
                case 6:
                    res = (temperatura-273);
                    System.out.println("A temperatura em Kelvin ["+temperatura+" K] para Celsius(°C) é: "+res+" °C");
                break;

                default:
                    System.out.println("Saindo!!!");
                break;
            } 
        }

    }
}