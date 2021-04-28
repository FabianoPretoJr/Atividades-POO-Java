import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int nConta, s = 0, cont = 0;
        String z = "";

        do {
            System.out.print("\nDigite o número da conta com até 6 digitos: ");
            nConta = input.nextInt();
        } while (nConta <= 0 || nConta >= 999999);

        int i = nConta;

        do {
            int v1 = i % 10;
            i = i / 10;
            s = s + v1;
            cont ++;
        } while (i != 0);

        int d = s % 10;

        for(i = 0; i < (6 - cont); i++)
        {
            z = z + "0";
        }
        
        System.out.println("\nO número da sua conta é: " + z + nConta + "-" + d);

        input.close();
    }
}