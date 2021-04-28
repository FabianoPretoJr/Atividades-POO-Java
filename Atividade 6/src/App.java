import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Digite o dia do seu nascimento: ");
        dia = input.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        mes = input.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        ano = input.nextInt();

        int v1 = (((dia * 100) + mes) + ano);
        int v2 = v1 / 10;
        int v3 = v1 % 10;
        int v4 = (v2 + v3) % 5;

        switch(v4) 
        {
            case 0:
                System.out.println("\nTímido");
                break;
            case 1:
                System.out.println("\nSonhador");
                break;
            case 2:
                System.out.println("\nPaquerador");
                break;
            case 3:
                System.out.println("\nAtraente");
                break;
            case 4:
                System.out.println("\nIrresistível");
                break;
            default:
                System.out.println("\nResultado não encontrado, tente novamente");
                break;
        }

        input.close();
    }
}