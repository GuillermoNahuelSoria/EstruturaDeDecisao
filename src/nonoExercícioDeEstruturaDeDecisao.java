import java.util.Scanner;
public class nonoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que leia três números e mostre-os em ordem decrescente.
         */

        // inicio do codigo.
        System.out.println("Digite o primeiro número inteiro:");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int c = scanner.nextInt();


        // Números em ordem decrescente
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Os números digitados em ordem decrescente são: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Os números digitados em ordem decrescente são: " + a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Os números digitados em ordem decrescente são: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Os números digitados em ordem decrescente são: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a >= b) {
                System.out.println("Os números digitados em ordem decrescente são: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Os números digitados em ordem decrescente são: " + c + ", " + b + ", " + a);
            }
        }

    }
}