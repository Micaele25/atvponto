public class Retangulo {
    private double largura;
    private double altura;


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    public double calcularArea() {
        return largura * altura;


    }


    public double calcularPerimetro() {
        return 2 * (largura * altura);


    }
    public void exibirInformacoes(){
        System.out.printf("Largura: %.2f\n",largura);
        System.out.printf("Altura: %.2f\n",altura);
        System.out.printf("Area: %.2f\n",calcularArea());
        System.out.printf("Perimetro: %.2f\n",calcularPerimetro());
        System.out.println();


    }

}
