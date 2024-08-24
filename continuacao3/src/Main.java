import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor de 5 objetos do tipo Retangulo
        Retangulo[] retangulos = new Retangulo[5];

        // Preenche o vetor com valores fornecidos pelo usuário
        for (int i = 0; i < retangulos.length; i++) {
            System.out.printf("Digite a largura do Retângulo %d: ", i + 1);
            double largura = scanner.nextDouble();
            System.out.printf("Digite a altura do Retângulo %d: ", i + 1);
            double altura = scanner.nextDouble();
            retangulos[i] = new Retangulo(largura, altura);
        }

        // Ordena o vetor em ordem crescente com base na área
        Arrays.sort(retangulos, Comparator.comparingDouble(Retangulo::calcularArea));

        // Exibe as informações dos retângulos após a ordenação
        System.out.println("\nRetângulos ordenados por área:");
        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
        }
    }
}