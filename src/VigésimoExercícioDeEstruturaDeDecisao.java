import java.util.Scanner;
public class VigésimoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular
        a média alcançada por aluno e presentar:
        A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
        A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
        A mensagem "Aprovado com Distinção", se a média for igual a 10.
         */

        // Inicio do codigo.
        System.out.println("Insira a primeira nota parcial do aluno (entre 1 e 10): ");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota parcial do aluno (entre 1 e 10): ");
        double nota2 = scanner.nextDouble();
        System.out.println("Insira a terceira nota parcial do aluno (entre 1 e 10): ");
        double nota3 = scanner.nextDouble();


        // Declaracao e atribuicao.
        double mediaAluno = (nota1 + nota2 + nota3) / 3;

        if (mediaAluno > 10.0) {
            System.out.println("Os dados introduzidos não estão corretos. Deve inserir notas entre 1 e 10.");
        } else if (mediaAluno == 10.0) {
            System.out.println("A média do aluno é: " + mediaAluno + ". Portanto, o aluno é aprovado com distinção.");
        } else if (mediaAluno >= 7.0) {
            System.out.println("A média do aluno é: " + mediaAluno + ". Portanto, o aluno é aprovado.");
        } else {
            System.out.println("A média do aluno é: " + mediaAluno + ". Portanto, o aluno é reprovado.");
        }
    }
}