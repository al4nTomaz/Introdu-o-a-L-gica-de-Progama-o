public class fibo {

    public static void main(String[] args) {
        
        int anterior=0, posicao=1, aux;
  
        for (;posicao<1000;) {
            System.out.print(posicao+", ");
            aux=posicao;
            posicao += anterior; 
            anterior = aux;
        }
    }
}