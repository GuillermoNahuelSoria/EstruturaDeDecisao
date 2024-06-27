import java.util.Scanner;
import java.time.Year;

public class decimoSetimoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe
        se este ano é ou não bissexto.
         */

        System.out.println("Insira um número correspondente a um determinado ano");
        int ano = scanner.nextInt();

        boolean ehBissexto = Year.isLeap(ano);
        if (ehBissexto) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
    }
}