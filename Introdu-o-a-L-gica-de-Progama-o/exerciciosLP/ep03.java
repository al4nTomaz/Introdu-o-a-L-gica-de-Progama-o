import java.util.Scanner;

public class ep03 {
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        int l1, l2, l3;

        System.out.print("Digite o 3 lados do triangulo: ");
        l1 = entrada.nextInt();
        l2 = entrada.nextInt();
        l3 = entrada.nextInt();
        entrada.close();
        
        if ((l1 == l2) && (l2 == l3)){
            System.out.println("equilatero");
        }else if ((l1 != l2) && (l2 != l3) && (l1 != l3)){
            System.out.println("escaleno");
        }else{
            System.out.println("isociles");
        }
    }
}
