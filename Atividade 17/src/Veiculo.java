public class Veiculo {
    private String modelo, placa;
    private int anoFabr;
    private double valor;

    public Veiculo(String pModelo, String pPlaca, int pAnoFabr, double pValor)
    {
        setModelo(pModelo);
        setPlaca(pPlaca);
        setAnoFabr(pAnoFabr);
        setValor(pValor);
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setAnoFabr(int anoFabr)
    {
        this.anoFabr = anoFabr;
    }

    public int getAnoFabr()
    {
        return anoFabr;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public double getValor()
    {
        return valor;
    }

    public void deprecia(float taxa)
    {
        setValor(valor - valor * taxa / 100);
    }

    public void imprime()
    {
        System.out.printf("\nVeiculo: %s\nPlaca: %7s\nAno: %4d\nValor: R$ %.2f\n\n", modelo, placa, anoFabr, valor);
    }
}