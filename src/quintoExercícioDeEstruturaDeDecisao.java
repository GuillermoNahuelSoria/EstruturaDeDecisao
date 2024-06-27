import java.util.Scanner;
public class quintoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
        calcular a média alcançada por aluno e apresentar:
        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.
         */

        System.out.println("Primeira nota parcial do aluno");
        double nota = scanner.nextDouble();

        System.out.println("Segunda nota parcial do aluno");
        double nota1 = scanner.nextDouble();

        double mediaDoAluno = (nota + nota1) / 2.0;

        if (mediaDoAluno == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (mediaDoAluno >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

    }
}