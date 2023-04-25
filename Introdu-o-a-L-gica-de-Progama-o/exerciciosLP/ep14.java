import java.util.Scanner;

public class ep14 {
    
    public static void main(String[] args) {    

        Scanner entrada = new Scanner(System.in);

        int i;
        String nome;

        System.out.print("Digite um nome: ");
        nome = entrada.nextLine();            

        entrada.close();

        System.out.println("\n\tO tamanho do String eh -> "+nome.length());
        System.out.println("\n\tA nome eh -> "+nome);
        
        System.out.print("\n\tO nome ao contrario eh -> ");            
        for (i = nome.length()-1; i >= 0; i--) {
            System.out.print(nome.charAt(i));            
        }

        
    }
}
