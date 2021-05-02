public class App {
    public static void main(String[] args) throws Exception {
        Carro c;
        c = new Carro("Onix", "ABC1234", 2020, 2021, 4, 75000);
        c.imprime();
        c.deprecia(10);

        System.out.println("Carro depreciado");
        c.imprime();
    }
}