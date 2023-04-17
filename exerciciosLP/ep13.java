import java.util.Scanner;

public class ep13 {
    
    public static void main(String[] args) {    

        Scanner entrada = new Scanner(System.in);

        int contadorVogalA=0, contadorEspaco=0;
        String nomeCidade;

        System.out.print("Digite o nome da cidade: ");
        nomeCidade = entrada.nextLine();            

        System.out.println("\n\tO tamanho da String eh -> "+nomeCidade.length());
        System.out.println("\n\tA cidade eh -> "+nomeCidade);
        
        for (char letra : nomeCidade.toCharArray()) {
            if (letra == 'a' || letra == 'A'){
                contadorVogalA++;
            } else if(letra == ' '){
                contadorEspaco++;
            }
        }
        
        System.out.println("\n\tA quandidade da vogal [a/A] eh -> "+contadorVogalA);
        System.out.println("\n\tA quandidade de espaços eh -> "+contadorEspaco);

        entrada.close();

    }
}
