import java.util.Scanner;

public class ep01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite três valores: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        entrada.close();

        if ((a <= b) && (a <= c)) {
            if (b <= c) {
                System.out.println(a + ", " + b + ", " + c);
            } else {
                System.out.println(a + ", " + c + ", " + b);
            }
        } else if ((b <= a) && (b <= c)) {
            if (a <= c) {
                System.out.println(b + ", " + a + ", " + c);
            } else {
                System.out.println(b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }

    }
}
