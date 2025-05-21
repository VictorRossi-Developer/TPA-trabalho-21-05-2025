import java.util.Scanner;
// Algumas classes como switch e while tive como fonte de aprendizado o https://www.youtube.com/watch?v=xyChCncaHgI
//Victor Rossi - 1ºDS/AMS
public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //Usei try para que verifique se o código dê algum erro
            while (true) {    //Usei while para que faça um loop ao confirmar que quer fazer outra opereção
                
                // escolhe da operacao
                System.out.println("Escolha a operacao:"); //Evitei usar sinais diacrítico como cedilha e til, pois o netbeans demonstra um caractere não identificado.
                System.out.println("1 - Soma");
                System.out.println("2 - Subtracao");
                System.out.println("3 - Multiplicacao");
                System.out.println("4 - Divisao");
                System.out.print("Opcao: ");
                int opcao = scanner.nextInt();

                // Escolha dos números
                System.out.print("Digite o primeiro numero: ");
                double num1 = scanner.nextDouble();

                System.out.print("Digite o segundo numero: ");
                double num2 = scanner.nextDouble();

                // Realiza a operação
                switch (opcao) {
                    case 1 -> System.out.println("Resultado: " + (num1 + num2));
                    case 2 -> System.out.println("Resultado: " + (num1 - num2));
                    case 3 -> System.out.println("Resultado: " + (num1 * num2));
                    case 4 -> {
                        if (num2 != 0) 
                        { //Como explicado nas aulas, usei !=0 para sempre verificar se não é igual a zero, assim evitando que o resultado venha como "zero" na divisão.
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Erro: divisao por zero!");
                        }
                    }
                    default -> System.out.println("Opcao invalida.");
                }

                // Pergunta se quer continuar
                System.out.print("Deseja fazer outra operacao? (s/n/): ");
                String resposta = scanner.next();

                if (!resposta.equalsIgnoreCase("s")) { //Qualquer resposta que seja diferente de "s" irá encerrar a calculadora
                    System.out.println("Calculadora encerrada.");
                    break; // sai do while e termina o programa
                }
            }
        }
    }
}
