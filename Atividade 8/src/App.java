import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double vPagar, tPagar = 0;

        System.out.println("\n\nBem-vindo ao caixa!!!");
        System.out.println("Digite zero ao terminar de registrar os produtos\n");

        do {
            System.out.print("\nDigite o valor do produto: ");
            vPagar = input.nextDouble();
            tPagar = tPagar + vPagar;
        } while(vPagar != 0);

        if(tPagar <= 0)
        {
            System.out.println("\n\nNecessário registrar ao menos um produto");
        }
        else
        {
            if(tPagar < 50)
            {
                tPagar = tPagar - (tPagar * 0.05);
            }
            else if(tPagar <= 100)
            {
                tPagar = tPagar - (tPagar * 0.1);
            }
            else if(tPagar <= 200)
            {
                tPagar = tPagar - (tPagar * 0.15);
            }
            else
            {
                tPagar = tPagar - (tPagar * 0.2);
            }
            System.out.println("\n\nValor a ser pago: " + tPagar);
        }
        input.close();
    }
}