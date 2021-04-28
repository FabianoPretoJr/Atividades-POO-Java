public class App {
    public static void main(String[] args) throws Exception {
        // Data data = new Data(06, 04, 2021);
        // System.out.println("Meu aniversário: " + data.toString());

        // data.setData(31, 02, 2021);
        // System.out.println("\n\nQue data é essa? " + data.toString());

        // Data data1, data2, data3;
        // data1 = new Data(15, 03, 2021);
        // data2 = new Data(2019);
        // data3 = new Data(07, 2023);

        // System.out.println(
        //     "Hoje é " + data1.toString() +
        //     " ingressei no segundo semestre de " + data2.getAno() +
        //     " e me formarei em " + data3.getMes() + "/" + data3.getAno()
        // );

        Data data1, data2;
        data1 = new Data(29, 02, 2023);
        data2 = new Data(29, 02, 2024);

        System.out.println(data1.toString());
        System.out.println(data2.toString());
    }
}