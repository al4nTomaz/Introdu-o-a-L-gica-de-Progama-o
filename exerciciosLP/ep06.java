import java.util.Scanner;

public class ep06 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        int l1=0, l2=0, l3=0;
        boolean saida = false;

        while (!saida) {
            System.out.print("Digite o 3 lados do triangulo: ");
            l1 = entrada.nextInt();
            l2 = entrada.nextInt();
            l3 = entrada.nextInt();
            
            if ( (l1 <= 0) || (l2 <= 0) || (l3 <= 0)) {
                System.out.println("Devem ser positivos!!");
            } else if ( (l1 <= Math.abs(l2-l3)) || (l1 >= l2 + l3)) {
                System.out.println("Condicao não existente!!");
            } else if ( (l2 <= Math.abs(l1-l3)) || (l2 >= l1 + l3)) {
                System.out.println("Condicao não existente!!");
            } else if ( (l3 <= Math.abs(l2-l1)) || (l3 >= l2 + l1)) {
                System.out.println("Condicao não existente!!");
            } else {
                saida=!saida;
            }
        }
        
        if ((l1 == l2) && (l2 == l3)){
            System.out.println("equilatero");
        }else if ((l1 != l2) && (l2 != l3) && (l1 != l3)){
            System.out.println("escaleno");
        }else{
            System.out.println("isociles");
        }

        entrada.close();
    }
}
