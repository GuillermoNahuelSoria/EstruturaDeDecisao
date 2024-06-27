import java.util.Scanner;
public class quartoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
         */

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É uma vogal");
        } else {
            System.out.println("É uma consoante");
        }

    }
}