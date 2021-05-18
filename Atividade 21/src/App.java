public class App {
    public static void main(String[] args) throws Exception {
        Circulo c = new Circulo(5);
        c.imprime();

        System.out.println();

        Retangulo r = new Retangulo(3, 4);
        r.imprime();

        System.out.println();

        Triangulo t = new Triangulo(3, 5);
        t.imprime();
    }
}