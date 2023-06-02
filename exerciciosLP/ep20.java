import java.util.Scanner;

public class ep20 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int op;

        do {
            imprimeMenu();
            op = e.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("Inválido!!");
            }
        } while (op != 5);

        e.close();
    }

    private static void imprimeMenu() {
        System.out.println("======MENU======");
        System.out.println("-[1] Soma");
        System.out.println("-[2] Subtração");
        System.out.println("-[3] Multiplicação");
        System.out.println("-[4] Divisão");
        System.out.println("-[5] Sair");
        System.out.print("-> ");
    }

    /*public static int fatorial(int num){
        int fat = 1, i;

        for(i = num; i >= 1; i--){
            fat *= i;
            // System.out.print(i != 1 ? i+" * " : i);
        }

        return fat;
    }

    public static int combinacao(int n, int p){
       

        return fatorial(n) / (fatorial(p) * (fatorial(n-p)));
    }*/
}
