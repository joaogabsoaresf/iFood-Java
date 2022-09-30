import java.util.Scanner;
// DESAFIO: BUSCA SEQUENCIAL
// DADO UM VALOR ,RETORNA SE O VALOR ESTA NA ARRAY OU NAO, INFORMANDO O VALOR E A POSICAO QUE ELE SE ENCONTRA

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        int n = input.nextInt();

        System.out.print(existe(n));

        input.close();
    }

    static String existe(int n){
        int[] elementos = elementos();

        for(int i = 0; i < elementos.length;i++){
            if (elementos[i] == n){
                String retorno = String.format("Achei %d na posicao %d", n, i);
                return retorno;
            }
        }
        String retorno = String.format("Numero %d nao encontrado! ", n);
        return retorno;
    }
    
    static int[] elementos(){
        int[] numElementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        return numElementos;
    }
}
