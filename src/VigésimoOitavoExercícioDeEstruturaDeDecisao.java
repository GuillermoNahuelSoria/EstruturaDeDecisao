import java.util.Scanner;
public class VigésimoOitavoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        /*
        O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
        File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
        Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne
        da promoção, porém não
        há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara
        o cliente receberá
        ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a
        quantidade de carne
        comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e
        quantidade de carne,
        preço total, tipo de pagamento, valor do desconto e valor a pagar.
         */

        // Declaração de variáveis
        double precoFileAte5 = 4.90;
        double precoFileAcima5 = 5.80;
        double precoAlcatraAte5 = 5.90;
        double precoAlcatraAcima5 = 6.80;
        double precoPicanhaAte5 = 6.90;
        double precoPicanhaAcima5 = 7.80;

        // Solicitar tipo de carne
        System.out.println("Escolha o tipo de carne (File Duplo, Alcatra, Picanha): ");
        String tipoCarne = scanner.nextLine();

        // Solicitar quantidade de carne
        System.out.println("Digite a quantidade de carne em Kg: ");
        double quantidade = scanner.nextDouble();

        // Solicitar tipo de pagamento
        System.out.println("Pagamento com cartão Tabajara? (sim/não): ");
        scanner.nextLine(); // Consumir a quebra de linha
        String pagamentoComCartao = scanner.nextLine();


        // Determinar o preço por Kg
        double precoPorKg = 0;

        switch (tipoCarne.toLowerCase()) {
            case "file duplo":
                if (quantidade <= 5) {
                    precoPorKg = precoFileAte5;
                } else {
                    precoPorKg = precoFileAcima5;
                }
                break;
            case "alcatra":
                if (quantidade <= 5) {
                    precoPorKg = precoAlcatraAte5;
                } else {
                    precoPorKg = precoAlcatraAcima5;
                }
                break;
            case "picanha":
                if (quantidade <= 5) {
                    precoPorKg = precoPicanhaAte5;
                } else {
                    precoPorKg = precoPicanhaAcima5;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                return;
        }

        // Calcular preço total
        double precoTotal = precoPorKg * quantidade;

        // Aplicar desconto se for pago com cartão Tabajara
        double desconto = 0;
        if (pagamentoComCartao.equalsIgnoreCase("sim")) {
            desconto = precoTotal * 0.05;
        }
        double valorAPagar = precoTotal - desconto;


        // Gerar cupom fiscal
        System.out.println("\nCUPOM FISCAL");
        System.out.println("Tipo de carne: " + tipoCarne);
        System.out.println("Quantidade: " + quantidade + " Kg");
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));
        System.out.println("Tipo de pagamento: " + (pagamentoComCartao.equalsIgnoreCase("sim") ? "Cartão Tabajara" : "Outro"));
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valorAPagar));

        scanner.close();


    }
}