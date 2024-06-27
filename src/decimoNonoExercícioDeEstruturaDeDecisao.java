import java.util.Scanner;
public class decimoNonoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de
        centenas, dezenas e unidades do mesmo.
        Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
        326 = 3 centenas, 2 dezenas e 6 unidades
        12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25,
        20, 10, 21, 11, 1, 7 e 16
         */

        // V1
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1000) {
            System.out.println("Número inválido. Digite um número menor que 1000.");
            return;
        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        System.out.println("O numero digitado foi: " + numero + ". " + "Isto resulta em: " + centenas + " centenas" + ", " + dezenas + " dezenas" + " e " + unidades + " unidades.");



        /* V2
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero >= 1000) {
            System.out.println("Número inválido. Digite um número menor que 1000.");
            return;
        }

        int centenas = numero / 100;
        int dezenas = (numero % 100) / 10;
        int unidades = numero % 10;

        String resultado = "";
        if (centenas > 0) {
            resultado += centenas + " centena" + (centenas > 1 ? "s." : "");
        }
        if (dezenas > 0) {
            if (!resultado.isEmpty()) {
                resultado += ", ";
            }
            resultado += dezenas + " dezena" + (dezenas > 1 ? "s." : "");
        }
        if (unidades > 0) {
            if (!resultado.isEmpty()) {
                resultado += " e ";
            }
            resultado += unidades + " unidade" + (unidades > 1 ? "s." : "");
        }

        System.out.println(resultado);
        */
    }
}