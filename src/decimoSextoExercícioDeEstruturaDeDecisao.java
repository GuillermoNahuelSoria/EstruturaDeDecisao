import java.util.Scanner;
public class decimoSextoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 +
        bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando
        ao usuário nas seguintes situações:
        Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
        programa não deve fazer pedir os demais valores, sendo encerrado;
        Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao
        usuário e encerre o programa;
        Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
        Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
         */

        // Declaracao de variaveis.
        float a, b, c, delta, sqrtdelta, raiz1, raiz2;

        System.out.println("Equação do 2º grau: ax² + bx + c = 0");
        System.out.print("Entre com o valor de a: ");
        a = scanner.nextInt();
        System.out.print("Entre com o valor de b: ");
        b = scanner.nextInt();
        System.out.print("Entre com o valor de c: ");
        c = scanner.nextInt();

        if (a != 0) {
            delta = (b * b) - (4 * a * c);
            sqrtdelta = (float) Math.sqrt(delta);

            if (delta >= 0) {
                raiz1 = ((-1) * b + sqrtdelta) / (2 * a);
                raiz2 = ((-1) * b - sqrtdelta) / (2 * a);
                System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
            } else {
                delta = -delta;
                sqrtdelta = (float) Math.sqrt(delta);
                System.out.printf("Raíz 1: %.2f + i%.2f%n", (-b) / (2 * a), sqrtdelta / (2 * a));
                System.out.printf("Raíz 2: %.2f - i%.2f%n", (-b) / (2 * a), sqrtdelta / (2 * a));
            }
        } else {
            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2º grau.");
        }

    }
}