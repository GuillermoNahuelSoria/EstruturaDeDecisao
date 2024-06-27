import java.util.Scanner;
public class decimoSegundoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
        descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo)
        e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
        (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
        O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

        Desconto do IR:
        Salário Bruto até 900 (inclusive) - isento
        Salário Bruto até 1500 (inclusive) - desconto de 5%
        Salário Bruto até 2500 (inclusive) - desconto de 10%
        Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas
        conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00
         */

        // Declaracao de variaveis
        double pagamento_por_hora, total_horas_trabalhadas, salario_bruto, imposto_renda, inss, FGTS,
                descontos, salario_liquido;


        //inicio do codigo
        System.out.println("Primeiro, insira o valor da remuneração por hora e, em seguida, insira o número de horas trabalhadas no mês: ");
        pagamento_por_hora = scanner.nextDouble();
        total_horas_trabalhadas = scanner.nextDouble();


        // Validação de entrada
        if (pagamento_por_hora < 0 || total_horas_trabalhadas < 0) {
            System.out.println("Valores inválidos. Certifique-se de inserir valores positivos.");
            return; //  Encerra a execução do método atual.
        }


        // Atribuicao de valores
        salario_bruto = pagamento_por_hora * total_horas_trabalhadas;
        imposto_renda = 0.05 * salario_bruto;
        inss = 0.10 * salario_bruto;
        FGTS = 0.11 * salario_bruto;
        descontos = imposto_renda + inss;
        salario_liquido = salario_bruto - descontos;

        System.out.printf("\t\tSalário Bruto: 55R$ %.2f%n", salario_bruto);
        System.out.printf("\t\tIR (5%%)      : R$ %.2f%n", imposto_renda);
        System.out.printf("\t\tINSS (10%%)   : R$ %.2f%n", inss);
        System.out.printf("\t\tFGTS (11%%)   : R$ %.2f%n", FGTS);
        System.out.printf("\t\tTotal de descontos : R$ %.2f%n", descontos);
        System.out.printf("\t\tSalário Liquido    : R$ %.2f%n", salario_liquido);

    }
}