import java.util.Scanner;
public class decimoQuintoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se
        os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o
        mesmo é: equilátero, isósceles ou escaleno.
        Dicas:
        Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        Triângulo Equilátero: três lados iguais;
        Triângulo Isósceles: quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;
         */

        // Inicio do codigo.
        System.out.println("Insira o primeiro lado do triângulo");
        double lado1 = scanner.nextDouble();
        System.out.println("Insira o segundo lado do triângulo");
        double lado2 = scanner.nextDouble();
        System.out.println("Insira o terceiro lado do triângulo");
        double lado3 = scanner.nextDouble();

        // Estrutra de condicao.
        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Os valores podem ser um triângulo. Este triângulo é Equilátero.");
        } else if (lado1 == lado2 && lado1 != lado3) {
            System.out.println("Os valores podem ser um triângulo. Este triângulo é Isósceles.");
        } else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("Os valores podem ser um triângulo. Este triângulo é Escaleno.");
        } else {
            System.out.println("Os valores inseridos não podem ser um triângulo.");
        }

    }
}