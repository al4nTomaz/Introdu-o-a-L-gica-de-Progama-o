package aulas.aula0627;

public class FuncaoSoma {

    public static void main(String[] args) {    
        int x = soma(5, 10);
        
        System.out.print("a soma eh: ");
        System.out.println(x);
    }

    
    private static int multi(int a, int b){
        return a * b;
    }
    
    private static int soma(int a, int b){
        int c;

        c = multi(a, b);

        return c;
    }
}