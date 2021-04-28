import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double eMenor = 0, eMaior = 0, med = 0;

        System.out.print("\n\nDigite um valor positivo: ");
        int n = input.nextInt();

        while(n <= 0) {
            System.out.println("\nErro, valor inválido!");
            System.out.print("\nDigite um valor positivo: ");
            n = input.nextInt();
        }

        double[] arrN = new double[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("\nDigite o " + (i + 1) + "º valor: ");
            arrN[i] = input.nextDouble();

            med = med + arrN[i];

            if(i == 0)
                eMenor = arrN[i];
            if(arrN[i] > eMaior)
                eMaior = arrN[i];
            if(arrN[i] < eMenor)
                eMenor = arrN[i];
        }

        med = med / n;

        System.out.printf("\n\nMédia: %.2f\n", med);
        System.out.println("Maior valor: " + eMaior);
        System.out.println("Menor valor: " + eMenor);

        input.close();
    }
}