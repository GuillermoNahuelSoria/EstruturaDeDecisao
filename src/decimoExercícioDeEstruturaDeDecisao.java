import java.util.Scanner;
public class decimoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou
        V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
        "Valor Inválido!", conforme o caso.
         */

        System.out.println("Insira M-Matutino ou V-Vespertino ou N-Noturno para saber em que turno voce estuda: ");
        char letra = scanner.next().charAt(0);


        // Estrutura de condicao - V1
        if (letra == 'M' || letra == 'm') {
            System.out.println("Bom Dia!");
        } else if (letra == 'V' || letra == 'v') {
            System.out.println("Boa Tarde!");
        }   else if (letra == 'N' || letra == 'n') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }


        // Estrutura switch - V2
        switch (letra) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }


    }
}