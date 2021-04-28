public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo();
        r1.exibirDados();

        Retangulo r2 = new Retangulo(3, 5);
        r2.exibirDados();

        Retangulo r3 = new Retangulo(5, 5);
        r3.exibirDados();
    }
}