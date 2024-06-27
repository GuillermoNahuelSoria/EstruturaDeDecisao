import java.util.Scanner;
public class vigésimoTerceiroExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*Faça um Programa que peça um número e informe se o número é inteiro ou decimal.
        Dica: utilize uma função de arredondamento.*/

        System.out.println("Digite um numero qualquer (pode ser inteiro ou decimal): ");
        double num = scanner.nextDouble();

        double numeroArredondado = Math.round(num);
        if (num == numeroArredondado) {
            System.out.println("O numero inserido pelo utilizador é inteiro");
        } else {
            System.out.println("O numero é decimal");
        }

    }
}