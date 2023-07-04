import java.util.Scanner;

public class Prova {

    public static void menuCidades(String[] cidades){
        int i;

        for ( i = 0; i < cidades.length; i++) {

            System.out.print(i+" -> ");
            System.out.print(cidades[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        int nCidades = 4;
        
        String[] cidades = new String[nCidades];
        String cidade = "";

        Double[][] distancias = new Double[cidades.length][cidades.length];
        Double distancia = 0.0, soma = 0.0;
        
        int i, j, ponto = 0, ponto2 = 0;
        
        boolean controle = false, controleTrajeto = false;
        
        for ( i = 0; i < distancias.length; i++) {
            for ( j = 0; j < distancias[i].length; j++) {
                distancias[i][j] = distancia;
            }
        }

        System.out.println("\nInforme as cidades: ");
        for ( i = 0; i < cidades.length;) {
            System.out.print("-> ");
            cidade = e.nextLine();

            if (cidade.isEmpty()) {
                System.out.println("ERRO! O nome da cidade não pode ser vázio!");
                continue;
            }

            cidades[i] = cidade;
            i++;
        }
        
        System.out.println("\nInforme as distancias entre as cidades: ");
        for ( i = 0; i < distancias.length; i++) {
            for ( j = i+1; j < distancias[i].length; j++) {

                System.out.print(cidades[i]);
                System.out.print(" -> ");
                System.out.print(cidades[j]);
                System.out.print(": ");
                distancia = e.nextDouble();
                
                if(distancias[i][j] == 0.0){
                    distancias[i][j] = distancia;
                    distancias[j][i] = distancia;
                }            
            }
        }
        
        System.out.print("\t");
        for ( i = 0; i < distancias.length; i++) {

            System.out.print(" "+cidades[i]);
            System.out.print("\t");
        }
        System.out.println();

        for ( i = 0; i < distancias.length; i++) {

            System.out.print(cidades[i]);
            System.out.print("\t");
            for ( j = 0; j < distancias[i].length; j++) {

                if(i == j){
                
                    System.out.print("***");
                    System.out.print("\t");
                }else{
                    
                    System.out.print(distancias[i][j]);
                    System.out.print("\t");
                }
                
            }
            System.out.println();
        }

        while (!controleTrajeto) {

            controle = false;
            System.out.println();
            
            while (!controle) {

                System.out.println("informe o inicio do trajeto:");
                menuCidades(cidades);
                System.out.print("-> ");
                ponto = e.nextInt();
    
                if (ponto < 0 || ponto >= cidades.length){

                    System.out.println("ERRO! Trajéto inválido!");
                    continue;
                }
                controle = true;
            }
    
            controle = false;

            while (!controle) {
    
                System.out.println("informe o próximo ponto:");
                System.out.print("-> ");
                ponto2 = e.nextInt();
    
                if (ponto2 < 0 || ponto2 >= cidades.length) {

                    System.out.println("ERRO! Trajéto inválido!");
                    continue;
                }
    
                if (ponto2 != ponto) {

                    soma += distancias[ponto][ponto2];
                    ponto = ponto2;
    
                    System.out.println("Quer contiuaro trajéto? 1-SIM 0-NÃ0");
                    controle = e.nextInt() == 0;

                    if (controle) {

                        System.out.println("Quer um novo trajéto? 1-SIM 0-NÃ0");
                        controleTrajeto = e.nextInt() == 0;

                        System.out.println();
                        System.out.println("Seu trajéto deu "+soma);

                        if (!controleTrajeto) {
                        
                            controle = true;
                            soma = 0.0;
                            continue;
                        }    
                    }
                    
                    continue;
                }
    
                System.out.println("ERRO! O cidade tem que ser diferente!");
            }
        }
        
        e.close();
    }
}