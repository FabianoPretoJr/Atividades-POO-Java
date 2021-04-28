import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double tempF, tempC;

        System.out.print("Digite uma temperatura em fahrenheit: ");
        tempF = input.nextDouble();

        tempC = ((tempF - 32) * 5) / 9;

        System.out.printf("\nSeu valor em celsius: %.2f\n\n", tempC);

        input.close();
    }
}