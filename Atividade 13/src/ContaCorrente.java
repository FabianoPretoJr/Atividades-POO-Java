public class ContaCorrente {
    public ContaCorrente(int numeroConta, String titular, double saldo, double limite)
    {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
        setLimite(limite);
    }

    public ContaCorrente(int numeroConta, String titular, double saldo)
    {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
        setLimite(1000);
    }

    public ContaCorrente(int numeroConta, String titular)
    {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(0);
        setLimite(0);
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

    private double limite;
    private void setLimite(double l)
    {
        this.limite = l;
    }
    private double getLimite()
    {
        return this.limite;
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
        if(retirada > (this.saldo + this.limite))
            System.out.println("\n\nValor de retirada maior que valor do saldo");
        else if(retirada < 0)
            System.out.println("\n\nValor de retirada deve ser maior do que zero");
        else
            if(retirada <= this.saldo)
                this.saldo = this.saldo - retirada;
            else
            {
                this.saldo = this.saldo - retirada;
                this.limite = this.limite + this.saldo;
            }
    }

    public void ExibirDados()
    {
        System.out.println("\n\nNúmero da conta: " + getNumeroConta());
        System.out.println("Titular: " + getTitular());
        System.out.printf("Saldo: %.2f\n", getSaldo());
        System.out.printf("Limite: %.2f\n\n", getLimite());
    }
}