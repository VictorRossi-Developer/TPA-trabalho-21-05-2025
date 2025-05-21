import java.util.Scanner;
//Victor Rossi - 1ºDS/AMS
public class VerificaPrimo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String resposta = "s"; //

            do {
                System.out.print("Digite um numero inteiro: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Entrada invalida. Por favor, digite um numero inteiro.");
                    scanner.nextLine(); // limpa entrada inválida
                    continue;
                }

                int numero = scanner.nextInt();
                scanner.nextLine(); // limpa o ENTER após nextInt

                if (numero <= 1) {
                    System.out.println(numero + " nao e primo.");
                } else {
                    boolean primo = true;
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            primo = false;
                            break;
                        }
                    }

                    if (primo) {
                        System.out.println(numero + " e primo.");
                    } else {
                        System.out.println(numero + " nao e primo.");
                    }
                }

                System.out.print("Deseja verificar outro numero? (s/n): ");
                resposta = scanner.nextLine();

            } while (resposta.equalsIgnoreCase("s")); // ignora se a resposta for diferente de "s"

            System.out.println("Programa encerrado.");
        }
    }
}
