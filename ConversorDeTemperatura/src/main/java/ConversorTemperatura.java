import java.util.Scanner;
//Victor Rossi - 1ºDS/AMS
public class ConversorTemperatura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { //Usei try para verificar se há algum erro.
            String resposta;
            do {  //O do serve para que seja executado ao menos uma vez
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();

                double fahrenheit = (celsius * 9 / 5) + 32; //Usei double porque teremos resultados com casas decimais
                double kelvin = celsius + 273.15;

                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                System.out.println("Temperatura em Kelvin: " + kelvin);

                System.out.print("Deseja converter outra temperatura? (s/n): ");
                resposta = scanner.next();

            } while (resposta.equalsIgnoreCase("s")); //Cria um looping, caso a resposta seja "s"

            System.out.println("Programa encerrado.");
        }
    }
}
