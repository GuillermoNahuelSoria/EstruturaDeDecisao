import java.util.Scanner;

public class VigesimoSetimoExercicioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                      Até 5 Kg           Acima de 5 Kg
        Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
        Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
        ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
        morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
         */

        System.out.println("Quantos quilos de morango quer comprar?");
        double quilosDeMorango = scanner.nextDouble();
        System.out.println("Quantos quilos de maçã quer comprar?");
        double quilosDeMaca = scanner.nextDouble();

        double valorDelMorangoPorQuilo = 2.50d;
        double valorDelMorangoAcimaDe5Quilos = 2.20d;
        double valorDeMacaPorQuilo = 1.80d;
        double valorDeMacaAcimaDe5Quilos = 1.50d;

        double valorTotalDeCompraDeMorango;
        if (quilosDeMorango > 5) {
            valorTotalDeCompraDeMorango = quilosDeMorango * valorDelMorangoAcimaDe5Quilos;
        } else {
            valorTotalDeCompraDeMorango = quilosDeMorango * valorDelMorangoPorQuilo;
        }

        double valorTotalDeCompraDeMaca;
        if (quilosDeMaca > 5) {
            valorTotalDeCompraDeMaca = quilosDeMaca * valorDeMacaAcimaDe5Quilos;
        } else {
            valorTotalDeCompraDeMaca = quilosDeMaca * valorDeMacaPorQuilo;
        }

        double valorTotalCompra = valorTotalDeCompraDeMorango + valorTotalDeCompraDeMaca;
        double quilosTotal = quilosDeMorango + quilosDeMaca;

        if (quilosTotal > 8 || valorTotalCompra > 25) {
            valorTotalCompra = valorTotalCompra * 0.90;  // Aplica o desconto de 10%
        }

        System.out.println("O valor total a ser pago é: R$ " + valorTotalCompra);
    }
}