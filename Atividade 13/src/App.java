import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ContaCorrente cc1 = new ContaCorrente(123456, "Fabiano Preto", 2500, 500);
        cc1.ExibirDados();

        ContaCorrente cc2 = new ContaCorrente(654321, "Gustavo Preto");
        cc2.ExibirDados();

        ContaCorrente cc3 = new ContaCorrente(654321, "Rosangela da Silva", 5000);
        cc3.ExibirDados();

        System.out.print("\n\nValor para deposito em cc2: ");
        double dep = input.nextDouble();
        cc2.Depositar(dep);
        cc2.ExibirDados();

        System.out.print("\n\nValor de saque em cc1: ");
        double saq = input.nextDouble();
        cc1.Sacar(saq);
        cc1.ExibirDados();

        input.close();
    }
}