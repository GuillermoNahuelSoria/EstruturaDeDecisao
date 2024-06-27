import java.util.Scanner;
public class vigésimoPrimeiroExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor
        do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis
        serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa
        não deve se preocupar com a quantidade de notas existentes na máquina.
        Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
        uma nota de 5 e uma nota de 1;
        Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
        quatro notas de 10, uma nota de 5 e quatro notas de 1.
         */

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        int valorSaque = scanner.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor inválido. O saque deve estar entre 10 e 600 reais.");
        } else {
            int notas100 = valorSaque / 100;
            int resto100 = valorSaque % 100;

            int notas50 = resto100 / 50;
            int resto50 = resto100 % 50;

            int notas10 = resto50 / 10;
            int resto10 = resto50 % 10;

            int notas5 = resto10 / 5;
            int notas1 = resto10 % 5;

            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 1: " + notas1);
        }

        scanner.close();
    }
}