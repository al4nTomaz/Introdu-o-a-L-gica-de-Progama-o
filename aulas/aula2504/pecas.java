package aulas.aula2504;

public class pecas {
    public static void main(String[] args) {

        int i = 0;
        char peca = (char) i;

        for (;i < 1000; i++) {
            System.out.println(i+"\t"+peca);
            peca = (char) i;    
        }

        peca = 18;
        

        System.out.print(peca);
        System.out.print(peca+"\n");
        System.out.print(peca);
        System.out.println(peca);

        peca = 11036;

        System.out.print(peca);
        System.out.print(peca+"\n");
        System.out.print(peca);
        System.out.print(peca);
    }
}
