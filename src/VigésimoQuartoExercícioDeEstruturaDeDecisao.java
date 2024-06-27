import java.util.Scanner;

public class VigésimoQuartoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação
        ele deseja realizar. O resultado da operação deve ser acompanhado de uma frase que diga se
        o número é:
        par ou ímpar;
        positivo ou negativo;
        inteiro ou decimal.*/

        System.out.println("Insira dois numeros decimais: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Que operação pretende fazer?");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("Opção 1: +");
        System.out.println("Opção 2: -");
        System.out.println("Opção 3: /");
        System.out.println("Opção 4: *");

        int opcaoEscolhida = scanner.nextInt();
        double resultado = 0;

        switch (opcaoEscolhida) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Escolheu a primeira opção, portanto, o resultado da soma é " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Escolheu a segunda opção, portanto, o resultado da subtração é " + resultado);
                break;
            case 3:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Escolheu a terceira opção, portanto, o resultado da divisão é " + resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    return;
                }
                break;
            case 4:
                resultado = num1 * num2;
                System.out.println("Escolheu a quarta opção, portanto, o resultado da multiplicação é " + resultado);
                break;
            default:
                System.out.println("A opção escolhida é inválida");
                return;
        }

        if (resultado % 2 == 0) {
            System.out.println("O resultado é par.");
        } else {
            System.out.println("O resultado é ímpar.");
        }

        if (resultado > 0) {
            System.out.println("O resultado é positivo.");
        } else if (resultado < 0) {
            System.out.println("O resultado é negativo.");
        } else {
            System.out.println("O resultado é zero.");
        }

        if (resultado == (int) resultado) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
    }
}