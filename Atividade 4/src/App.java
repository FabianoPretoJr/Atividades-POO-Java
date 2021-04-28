public class App {
    public static void main(String[] args) throws Exception {
        /*
            Exemplo do método split, tem a tarefa de separar o valor de uma 
            string em um array, pode receber de parâmetro o que será o divisor
            desses valores, nesse caso foi o espaço em branco.
        */
        System.out.println("\nExemplo 1 - split");

        String valor1 = "programação orientada objetos";
        String[] valor1Separado = valor1.split(" ");

        for (String i : valor1Separado) {
            System.out.println(i);
        }

        /*
            Exemplo do método charAT, tem a tarefa de retornar um caracter em
            determinada posição da String.
        */
        System.out.println("\n\nExemplo 2 - charAt");
        
        String valor2 = "POO";
        System.out.println(valor2.charAt(0));
        System.out.println(valor2.charAt(1));
        System.out.println(valor2.charAt(2));

        /*
            Exemplo de métodos para tratamento de String, o método toLowerCase joga todos
            caracteres para caixa baixa, toUpperCase faz o contrário e joga todos para
            caixa alta, o método trim remove os espaços vazios a esquerda e direita do
            texto.
        */
        System.out.println("\n\nExemplo 3 - toLowerCase, toUpperCase, trim");

        String valor3 = "  POO - java   ";
        System.out.println(valor3.toLowerCase());
        System.out.println(valor3.toUpperCase());
        System.out.println(valor3.trim());
    }
}