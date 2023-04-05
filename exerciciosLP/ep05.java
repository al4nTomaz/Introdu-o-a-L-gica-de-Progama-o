import java.io.IOException;
import java.util.Scanner;

public class ep05 {

    // forma de limpar o console em java
    public static void limpaConsole() throws InterruptedException, IOException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else{
            Runtime.getRuntime().exec("clear");
        }
    }

    public static void main(String[] args){
        
        Scanner entrada =  new Scanner(System.in);

        int ano = 0;

        while (ano <= 0){
            // System.out.print("O ano "+ano+" e INVALIDO!!");
            System.out.print("Digite um ano: ");
            ano = entrada.nextInt();
        }        
        
        if (ano % 4 == 0){
            System.out.print("O ano "+ano+" e bissexto!!");
        }else{
            System.out.print("O ano "+ano+" NAO e bissexto!!");
        }

        entrada.close();
    }
}
