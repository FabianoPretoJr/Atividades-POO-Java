import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double A, B, C;

        System.out.print("Digite o valor do lado A: ");
        A = input.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        B = input.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        C = input.nextDouble();

        if(((A + B) < C) || ((A + C) < B) || ((B + C) < A))
        {
            System.out.println("\n\nNão é um triângulo");
        }
        else
        {
            if((A == B) && (A == C))
            {
                System.out.println("\n\nÉ um triângulo equilátero");
            }
            else if((A == B) || (A == C) || (B == C))
            {
                System.out.println("\n\nÉ um triângulo isósceles");
            }
            else if((A != B) && (A != C) && (B != C))
            {
                System.out.println("\n\nÉ um triângulo escaleno");
            }
        }

        input.close();
    }
}