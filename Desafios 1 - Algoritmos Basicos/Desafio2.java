import java.util.Scanner;
// DESAFIO: FIZZBUZZ
// DADO UM VALOR INTEIRO IMPRIME "FIZZBUZZ" SE FOR DIVISIVEL POR 3 E 5. "FIZZ" SE FOR DIVISIVEL APENAS POR 3. "BUZZ" SE FOR DIVISIVEL APENAS POR 5. SE NAO FOR DIVISIVEL POR NENHUM, IMPRIME O NUMERO

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0){
            System.out.println("Fizz");
        } else if (n % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

        input.close();
    }
}
