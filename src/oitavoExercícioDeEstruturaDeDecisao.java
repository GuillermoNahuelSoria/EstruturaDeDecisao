import java.util.Scanner;
public class oitavoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato.
         */

        System.out.println("Insira o preco do primeiro produto");
        double preco = scanner.nextDouble();

        System.out.println("Insira o preco do segundo produto");
        double preco2 = scanner.nextDouble();

        System.out.println("Insira o preco do terceiro produto");
        double preco3 = scanner.nextDouble();

        if (preco < preco2 && preco < preco3) {
            System.out.println("Deve comprar o primeiro produto");
        } else if (preco2 < preco && preco2 < preco3) {
            System.out.println("Deve comprar o segundo produto");
        } else if (preco3 < preco && preco3 < preco2) {
            System.out.println("Deve comprar o terceiro produto");
        } else {
            System.out.println("Pode comprar qualquer produto porque seus preços são os mesmos");
        }

    }
}