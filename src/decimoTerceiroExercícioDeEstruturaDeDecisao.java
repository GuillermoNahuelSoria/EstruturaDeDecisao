import java.util.Scanner;
public class decimoTerceiroExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo,
        2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
         */

        System.out.println("Digite um numero (Do número 1 ao 7): ");
        int num = scanner.nextInt();


        // Estrutura switch - V2
        switch (num) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terceira-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor Inválido!");
        }

    }
}