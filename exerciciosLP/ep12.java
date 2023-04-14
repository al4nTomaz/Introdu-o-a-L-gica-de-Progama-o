import java.util.Scanner;

public class ep12 {

    // public static final int N=50;
    
    public static void main(String[] args) {    


        Scanner entrada = new Scanner(System.in);

        String nomeCidade;

        System.out.print("Digite o nome da cidade: ");
        nomeCidade = entrada.nextLine();            

        System.out.println("\n\tO tamanho da String eh -> "+nomeCidade.length());
        System.out.println("\n\tA cidade eh -> "+nomeCidade);

        entrada.close();

    }
}
