import java.util.Scanner;
public class decimoQuartoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao
        longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 9.0         B
        Entre 6.0 e 7.5         C
        Entre 4.0 e 6.0         D
        Entre 4.0 e zero        E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a
        mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
         */

        // Inicio do codigo.
        System.out.println("Insira a primeira nota parcial obtida pelo aluno");
        double nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota parcial obtida pelo aluno");
        double nota2 = scanner.nextDouble();

        // Atribuicao de valor.
        double mediaAluno = (nota1 + nota2) / 2;


        // V1
        if (mediaAluno >= 9.0 && mediaAluno <= 10.0) {
            System.out.println("As notas do aluno são: " + nota1 + ", " + nota2 + " = " + mediaAluno + ". " + "Por outro lado, o conceito correspondente para esta média é: " + "A. " + "Portanto, o aluno é APROVADO.") ;
        } else if (mediaAluno >= 7.5 && mediaAluno <= 9.0) {
            System.out.println("As notas do aluno são: " + nota1 + ", " + nota2 + " = " + mediaAluno + ". " + "Por outro lado, o conceito correspondente para esta média é: " + "B. " + "Portanto, o aluno é APROVADO.") ;
        } else if (mediaAluno >= 6.0 && mediaAluno <= 7.5) {
            System.out.println("As notas do aluno são: " + nota1 + ", " + nota2 + " = " + mediaAluno + ". " + "Por outro lado, o conceito correspondente para esta média é: " + "C. " + "Portanto, o aluno é APROVADO.") ;
        } else if (mediaAluno >= 4.0 && mediaAluno <= 6.0) {
            System.out.println("As notas do aluno são: " + nota1 + ", " + nota2 + " = " + mediaAluno + ". " + "Por outro lado, o conceito correspondente para esta média é: " + "D. " + "Portanto, o aluno é REPROVADO.") ;
        } else if (mediaAluno >= 0.0 && mediaAluno <= 4.0) {
            System.out.println("As notas do aluno são: " + nota1 + ", " + nota2 + " = " + mediaAluno + ". " + "Por outro lado, o conceito correspondente para esta média é: " + "E. " + "Portanto, o aluno é REPROVADO.") ;
        } else {
            System.out.println("Os dados inseridos excedem os valores estabelecidos para avaliar a média do aluno.");
        }

        /* V2
        String conceito;
        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.5) {
            conceito = "B";
        } else if (media >= 6.0) {
            conceito = "C";
        } else if (media >= 4.0) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        */

    }
}