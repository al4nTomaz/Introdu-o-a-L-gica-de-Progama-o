package provas.prova3.resolução;

public class ex1 {

    public static void main(String[] args) {
        
        Double pedro = 0.8, joao = 0.6;
        int ano=0, anoP = 1, anoJ = 1, supera=0;

        System.out.println("\n=============================\n");
        System.out.println("ano: "+(ano+1));
        System.out.printf("Pedro: %.2f m\n", pedro);
        System.out.printf("João: %.2f m\n", joao);

        while((pedro <= 1.8) || (joao <= 1.8) || (joao <= pedro)){
            pedro+=0.01;
            joao+=0.02;

            if(joao <= pedro){
                supera++;
            }
            
            if (pedro<=1.8) {
                anoP++;
            }if(joao<=1.8) {
                anoJ++;
            }

            ano++;
            System.out.println("\n=============================\n");
            System.out.println("ano: "+ano);
            System.out.printf("Pedro: %.2f m\n", pedro);
            System.out.printf("João: %.2f m\n", joao);
        }

        System.out.println("\n=============================\n");
        System.out.println("Pedro Demorou "+anoP+" anos para chegar em 1.80 m");
        System.out.println("João Demorou "+anoJ+" anos para chegar em 1.80 m");
        System.out.println("João demorou "+supera+" anos para superar a altura de Pedro");
        System.out.println("\n=============================\n");

    }    
}