import java.util.Scanner;

// https://www.youtube.com/watch?v=K82PlNZqesI
// https://youtu.be/P2joSxyUyd4

public class ep04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        do{
            System.out.print("Digite três valores positivos: ");
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = entrada.nextInt();

        } while ((a <= 0) || (b <= 0) || (c <= 0));
        
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

        entrada.close();
    }
}