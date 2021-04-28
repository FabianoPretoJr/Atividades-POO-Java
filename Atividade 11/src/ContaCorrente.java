public class ContaCorrente {
    public ContaCorrente(int numeroConta, String titular, double saldo)
    {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }

    private int numeroConta;
    private void setNumeroConta(int nc)
    {
        this.numeroConta = nc;
    }
    private int getNumeroConta()
    {
        return this.numeroConta;
    }

    private String titular;
    private void setTitular(String t)
    {
        this.titular = t;
    }
    private String getTitular()
    {
        return this.titular;
    }

    private double saldo;
    private void setSaldo(double s)
    {
        if(s >= 0)
            this.saldo = s;
        else
        System.out.println("\n\nSaldo deve ser maior ou igual a zero");
    }
    private double getSaldo()
    {
        return this.saldo;
    }

    public void Depositar(double entrada)
    {
        if(entrada > 0)
            this.saldo = this.saldo + entrada;
        else
            System.out.println("\n\nValor depositado deve ser maior do que zero");
    }

    public void Sacar(double retirada)
    {
        if(retirada > this.saldo)
            System.out.println("\n\nValor de retirada maior que valor do saldo");
        else if(retirada < 0)
        System.out.println("\n\nValor de retirada deve ser maior do que zero");
        else
            this.saldo = this.saldo - retirada;
    }

    public void ExibirDados()
    {
        System.out.println("\n\nNúmero da conta: " + getNumeroConta());
        System.out.println("Titular: " + getTitular());
        System.out.printf("Saldo: %.2f\n\n", getSaldo());
    }
}