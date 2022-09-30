import java.util.Scanner;
// DESAFIO: SOMANDO MULTIPLOS
// DADO OS VALORES DE UM NUMERO INTEIRO E UM LIMITE, IMPRIME O VALOR DA SOMA DOS MULTIPLOS DO NUMERO ATE O LIMITE

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int limite = input.nextInt();

        int somaMultiplos = 0;
    
        for(int i = 1; (num * i) <= limite; i++){
            somaMultiplos += num * i;
        }
        System.out.println(somaMultiplos);
        input.close();
    }
}
