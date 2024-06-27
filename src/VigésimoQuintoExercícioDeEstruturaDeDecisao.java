import java.util.Scanner;

public class VigésimoQuintoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um programa em java que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a
        participação da pessoa no crime.
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
        entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
        Caso contrário, ele será classificado como "Inocente".
         */

        // V1
        String[] perguntas = {
                "Telefonou para a vítima? 1/Sim ou 0/Não: ",
                "Esteve no local do crime? 1/Sim ou 0/Não: ",
                "Mora perto da vítima? 1/Sim ou 0/Não: ",
                "Devia para a vítima? 1/Sim ou 0/Não: ",
                "Já trabalhou com a vítima? 1/Sim ou 0/Não: "
        };

        int somaRespostas = 0;

        for (String pergunta : perguntas) {
            /*
            Este é um laço for-each em Java, que é utilizado para iterar sobre elementos de uma coleção ou array.
            "String pergunta" : Declara uma variável "pergunta do tipo String", que será usada para armazenar cada elemento da coleção durante cada iteração do laço.
            ": perguntas" : Especifica a coleção (ou array) perguntas que está sendo iterada. Em cada iteração, um elemento de perguntas será atribuído à variável pergunta.
             */
            System.out.print(pergunta);
            int resposta = scanner.nextInt();
            somaRespostas += resposta;
        }

        if (somaRespostas < 2) {
            System.out.println("\nInocente");
        } else if (somaRespostas == 2) {
            System.out.println("\nSuspeita");
        } else if (somaRespostas >= 3 && somaRespostas <= 4) {
            System.out.println("\nCúmplice");
        } else {
            System.out.println("\nAssassino");
        }
    }
}



        /*
        // V2
        int res1 = getIntInput("Telefonou para a vítima? 1/Sim ou 0/Não: "); // Este método(getIntInput) exibe a pergunta ao usuário e retorna um valor inteiro (1 para "Sim" ou 0 para "Não").
        int res2 = getIntInput("Esteve no local do crime? 1/Sim ou 0/Não: ");
        int res3 = getIntInput("Mora perto da vítima? 1/Sim ou 0/Não: ");
        int res4 = getIntInput("Devia para a vítima? 1/Sim ou 0/Não: ");
        int res5 = getIntInput("Já trabalhou com a vítima? 1/Sim ou 0/Não: ");

        int somaRespostas = res1 + res2 + res3 + res4 + res5;

        if (somaRespostas < 2) {
        System.out.println("\nInocente");
        } else if (somaRespostas == 2) {
        System.out.println("\nSuspeita");
        } else if (somaRespostas >= 3 && somaRespostas <= 4) {
        System.out.println("\nCúmplice");
        } else {
                System.out.println("\nAssassino");
        }
                }

        private static int getIntInput(String prompt) {         Este método auxiliar recebe uma String como argumento (prompt), que representa a mensagem a ser exibida ao usuário. Ele faz o seguinte:
                                                                Cria um objeto Scanner para ler a entrada do usuário e Exibe a mensagem (prompt) ao usuário.
                                                                Lê um número inteiro digitado pelo usuário e o retorna.


        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();


    }
}
*/
