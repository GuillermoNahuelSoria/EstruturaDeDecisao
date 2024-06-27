import java.util.Scanner;
public class decimoOitavoExercícioDeEstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
         */

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataDigitada = scanner.nextLine();

        if (dataDigitada.matches("\\d{2}/\\d{2}/\\d{4}")) {
            int dia = Integer.parseInt(dataDigitada.substring(0, 2));
            int mes = Integer.parseInt(dataDigitada.substring(3, 5));
            int ano = Integer.parseInt(dataDigitada.substring(6));

            boolean dataValida = true;

            if (mes < 1 || mes > 12) {
                dataValida = false;
            } else {
                switch (mes) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (dia > 30) {
                            dataValida = false;
                        }
                        break;
                    case 2:
                        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                            if (dia > 29) {
                                dataValida = false;
                            }
                        } else {
                            if (dia > 28) {
                                dataValida = false;
                            }
                        }
                        break;
                    default:
                        if (dia > 31) {
                            dataValida = false;
                        }
                }
            }

            if (dataValida) {
                System.out.println("Data válida!");
            } else {
                System.out.println("Data inválida!");
            }
        } else {
            System.out.println("Formato inválido. Digite a data no formato dd/mm/aaaa.");
        }

    }
}