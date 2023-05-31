import java.util.Scanner;

public class ep18 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int num, fat;
        do{
            System.out.print("Digite um número para fatorial: ");
            num = e.nextInt();
            System.out.println(num < 0 ? "O número pode ser negativo!" : "");
        }while(num < 0);

        fat = fatorial(num);

        System.out.println(fat == 1 ? num + " = " + fat : " = "+fat);

        e.close();
    }

    public static int fatorial(int num){
        int fat = 1, i;

        for(i = num; i >= 1; i--){
            fat *= i;
            System.out.print(i != 1 ? i+" * " : i);
        }

        return fat;
    }
}
