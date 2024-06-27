import java.util.Scanner;
public class sextoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que leia três números e mostre o maior deles.
         */

        System.out.print("Insira um numero:");
        int num = scanner.nextInt();

        System.out.print("Insira um segundo numero:");
        int num2 = scanner.nextInt();

        System.out.print("Insira um terceiro numero:");
        int num3 = scanner.nextInt();

        if (num > num2 && num > num3) {
            System.out.println("O maior número é: " + num);
        } else if (num2 > num && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else if (num3 > num && num3 > num2) {
            System.out.println("O maior número é: " + num3);
        } else {
            System.out.println("Os numeros sao iguais!");
        }

    }
}