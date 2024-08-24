import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo[] retangulos = new Retangulo[5];
        for (int i = 0; i < retangulos.length; i++) {
            System.out.printf("Digite a largura do Retângulo %d: ", i + 1);
            double largura = scanner.nextDouble();

            System.out.printf("Digite a altura do Retângulo %d: ", i + 1);
            double altura = scanner.nextDouble();
            retangulos[i] = new Retangulo(largura, altura);
        }
        for (int i = 0; i < retangulos.length; i++) {
            System.out.printf("Informações do Retângulo: %d: ", i + 1);
            retangulos[i].exibirInformacoes();
        }
        Retangulo maiorAreaRetangulo = retangulos[0];
        for (int i = 1; i < retangulos.length; i++) {
        if(retangulos[i].calcularArea() > maiorAreaRetangulo.calcularArea()) {}
        maiorAreaRetangulo = retangulos[i];
        }
        System.out.println("\nRetângulo com a maior área:");
        maiorAreaRetangulo.exibirInformacoes();

        // Encontra o retângulo com o menor perímetro
        Retangulo menorPerimetroRetangulo = retangulos[0];
        for (int i = 1; i < retangulos.length; i++) {
            if (retangulos[i].calcularPerimetro() < menorPerimetroRetangulo.calcularPerimetro()) {
                menorPerimetroRetangulo = retangulos[i];
            }
        }
        System.out.println("Retângulo com o menor perímetro:");
        menorPerimetroRetangulo.exibirInformacoes();

        scanner.close();
    }
    }

