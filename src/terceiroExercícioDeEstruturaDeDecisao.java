import java.util.Scanner;
public class terceiroExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
         */

        System.out.print("Digite uma letra (F ou M): ");
        char letra = scanner.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.println("F - Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }

    }
}