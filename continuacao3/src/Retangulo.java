import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Retangulo {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    // Método para exibir as informações do retângulo
    public void exibirInformacoes() {
        System.out.printf("Largura: %.2f\n", largura);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Área: %.2f\n", calcularArea());
        System.out.printf("Perímetro: %.2f\n", calcularPerimetro());
        System.out.println();
    }
}


