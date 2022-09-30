import java.util.Scanner;
// DESAFIO: UMA CHAMADA RECURSIVA
// DADO O VALOR DE UM NUMERO INTEIRO (N) RETORNA O SOMATORIO DE TODOS OS ALGARISMOS DE N ATE 0, UTILIZANDO UMA FUNCAO RECURSIVA

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(somatorio(n));

        input.close();
    }

    static int somatorio(int n){
        if (n == 0){
            return 0;
        } else {
            return n + somatorio(n - 1);
        }
    }
}
