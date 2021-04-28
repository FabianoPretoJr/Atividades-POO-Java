import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = input.nextDouble();

        Circulo cir = new Circulo(raio);
        cir.exibirDados();

        input.close();
    }
}