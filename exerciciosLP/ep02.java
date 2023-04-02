import java.util.Scanner;

public class ep02 {
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        int ano;

        System.out.print("Digite um ano: ");
        ano = entrada.nextInt();
        entrada.close();
        

        if (ano <= 0){
            System.out.print("O ano "+ano+" e INVALIDO!!");
        }else if (ano % 4 == 0){
            System.out.print("O ano "+ano+" e bissexto!!");
        }else{
            System.out.print("O ano "+ano+" NAO e bissexto!!");
        }
    }
}
