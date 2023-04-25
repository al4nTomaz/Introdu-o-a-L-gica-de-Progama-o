package aulas.aula1804;

public class primo {

    public static void main(String[] args) {
        
        int num = 50, i;

        for(i=2; i<num;i++){
            if(num % i != 0){
                System.out.println("é primo "+i);
            }
        }
        
    }
}