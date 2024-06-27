import java.util.Scanner;
public class setimoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que leia três números e mostre o maior e o menor deles.
         */

        System.out.println("Digite três números:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int menor = a;
        int maior = a;

        V1:
        //int menor = Math.min(a, Math.min(b, c));
        //int maior = Math.max(a, Math.max(b, c));


        //V2:
        //int menor = a;
        //int maior = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;

        if (b < menor) menor = b;
        if (c < menor) menor = c;

        System.out.println("Maior: " + maior + " Menor: " + menor);


    }
}