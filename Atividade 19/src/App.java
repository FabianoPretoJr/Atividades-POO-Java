public class App {
    public static void main(String[] args) throws Exception {
        Caminhao c;
        c = new Caminhao("Mercedes", "XYZ9876", 2000, 10, 3, 50000);

        c.imprime();
        c.deprecia(10);

        System.out.println("Caminhão depreciado");
        c.imprime();
    }
}