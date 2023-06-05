import java.util.Scanner;

public class ep21 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite dois números: ");
        a = e.nextInt();
        b = e.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = e.nextInt();

        Ponteiro p = new Ponteiro(a, b);
        
        c = troca(p, c);
        
        System.out.println(p.p1);
        System.out.println(p.p2);
        System.out.println(c);

        e.close();
    }
    
    static int troca(Ponteiro pt, int c){
        int aux;

        aux = pt.p2;
        pt.p2 = pt.p1;
        pt.p1 = aux;

        return c * pt.p1 * pt.p2;
    }
}


class Ponteiro{
    int p1;
    int p2;
    
    public Ponteiro(int i, int j) {
        p1 = i;
        p2 = j;
    }
    
}