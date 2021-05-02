public class App {
    public static void main(String[] args) throws Exception {
        Veiculo v;
        v = new Veiculo("Onix", "ABC1234", 2020, 75000);
        v.imprime();

        v.deprecia(10);
        System.out.println("Veiculo depreciado");
        v.imprime();
    }
}