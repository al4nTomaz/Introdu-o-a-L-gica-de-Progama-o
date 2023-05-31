import java.util.Scanner;

public class ep19 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n, p;

        System.out.print("Digite o número de elementos do conjunto: ");
        n = e.nextInt();

        System.out.print("Digite o número de elementos dos subconjuntos: ");
        p = e.nextInt();

        
        System.out.println(combinacao(n, p));

        e.close();
    }

    public static int fatorial(int num){
        int fat = 1, i;

        for(i = num; i >= 1; i--){
            fat *= i;
            // System.out.print(i != 1 ? i+" * " : i);
        }

        return fat;
    }

    public static int combinacao(int n, int p){
       

        return fatorial(n) / (fatorial(p) * (fatorial(n-p)));
    }
}
