import java.util.Scanner;
public class decimoPrimeiroExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e
        lhe contraram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
        seguinte critério, baseado no salário atual:
        salários até R$ 280,00 (incluindo) : aumento de 20%
        salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        o salário antes do reajuste;
        o percentual de aumento aplicado;
        o valor do aumento;
    o novo salário, após o aumento.
         */

        System.out.println("Insira o salario de um colaborador: ");
        double salario = scanner.nextDouble();


        // Estrutura de condicao.
        if (salario <= 280.0) {
            double aumentodel20 = 0.20 * salario;
            double novoSalario1 = salario + aumentodel20;
            System.out.println("Salários de R$ " + salario + " receberão um aumento del 20% " + " que é equivalente a " + aumentodel20 + "," + " dando como salário final: " + novoSalario1);
        } else if (salario >= 280.0 && salario <= 700.0) {
            double aumentodel15 = 0.15 * salario;
            double novoSalario2 = salario + aumentodel15;
            System.out.println("Salários de R$ " + salario + " receberão um aumento del 15% " + " que é equivalente a " + aumentodel15 + " , " + " dando como salário final: " + novoSalario2);
        } else if (salario >= 700.0 && salario <= 1500.0) {
            double aumentodel10 = 0.10 * salario;
            double novoSalario3 = salario + aumentodel10;
            System.out.println("Salários de R$ " + salario + " receberão um aumento del 10% " + " que é equivalente a " + aumentodel10 + " , " + " dando como salário final: " + novoSalario3);
        } else if (salario >= 1500.0) {
            double aumentodel05 = 0.05 * salario;
            double novoSalario4 = salario + aumentodel05;
            System.out.println("Salários de R$ " + salario + " receberão um aumento del 5% " + "que é equivalente a " + aumentodel05 + "," + " dando como salário final: " + novoSalario4 + ".");

        }
    }
}