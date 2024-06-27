import java.util.Scanner;

public class VigésimoSextoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Álcool:
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro
        Gasolina:
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de
        litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
        calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é
        R$ 2,50 o preço do litro do álcool é R$ 1,90.
         */

        // Preços por litro
        double precoDoLitroDoA = 1.90;
        double precoDoLitroDaG = 2.50;

        // Solicita o tipo de combustível
        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        // Solicita a quantidade de litros vendidos
        System.out.println("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        // Variável para armazenar o preço final
        double precoFinal = 0.0;

        // Calcula o preço final com base no tipo de combustível e quantidade de litros
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litrosVendidos <= 20) {
                precoFinal = litrosVendidos * precoDoLitroDoA * 0.97; // 3% de desconto
            } else {
                precoFinal = litrosVendidos * precoDoLitroDoA * 0.95; // 5% de desconto
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                precoFinal = litrosVendidos * precoDoLitroDaG * 0.96; // 4% de desconto
            } else {
                precoFinal = litrosVendidos * precoDoLitroDaG * 0.94; // 6% de desconto
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }

        // Exibe o valor a ser pago pelo cliente
        System.out.printf("O valor a ser pago pelo cliente é: R$ %.2f%n", precoFinal);
    }
}