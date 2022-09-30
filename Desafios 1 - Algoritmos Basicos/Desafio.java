import java.util.Scanner;
// DESAFIO: OS NUMEROS SAO IGUAIS?
// IMPRIME SE OS VALORES SAO IGUAIS OU NAO. COMO O DESAFIO NAO FALOU SE AS ENTRADAS VAO SER INTEIROS, UTILIZEI O TIPO FLOAT PARA OS VALORES

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();

        if (a == b){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
        input.close();
    }
}
