public class Circulo {
    public Circulo(double r)
    {
        setRaio(r);
    }

    private double raio;
    private void setRaio(double r)
    {
        if(r <= 0)
            System.out.println("Entrada inválida");
        else
            raio = r;
    }
    private double getRaio()
    {
        return raio;
    }

    public void exibirDados()
    {
        System.out.printf("\n\nRaio: %.2f\n", getRaio());
        calcularArea();
        calcularDiametro();
        calcularCircunferencia();
    }

    private void calcularArea()
    {
        System.out.printf("Área: %.2f\n", (Math.pow(getRaio(), 2) * Math.PI));
    }

    private void calcularDiametro()
    {
        System.out.printf("Diâmetro: %.2f\n", (getRaio() * 2));
    }

    private void calcularCircunferencia()
    {
        System.out.printf("Circunferência: %.2f\n\n", (2 * getRaio() * Math.PI));
    }
}