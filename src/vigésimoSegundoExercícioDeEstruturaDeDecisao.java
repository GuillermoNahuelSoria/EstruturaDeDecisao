import java.util.Scanner;
public class vigésimoSegundoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica:
        utilize o operador módulo (resto da divisão).*/

        System.out.println("Insira um numero inteiro: ");
        int num = scanner.nextInt();


        if (num % 2 == 0) {
            System.out.println("O numero inserido pelo utilizador é par");
        } else {
            System.out.println("O numero inserido pelo utilizador é impar");
        }


    }
}