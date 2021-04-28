public class Retangulo {
    // Pelo enunciado entendi que talvez o usuário talvez não passe os valores de base e altura no construtor
    // então implementei um que atribuise os valores padrões, se for o caso contrario dele por exemplo poder 
    // passar o valor 0 (zero) no atributo que não desejase informar eu faria a validação do valor
    // no set de cada atributo

    public Retangulo() 
    {  
        setBase(2);
        setAltura(1);
    }

    public Retangulo(double base, double altura)
    {
        setBase(base);
        setAltura(altura);
    }

    private double base;
    private void setBase(double b)
    {
        this.base = b;
    }
    private double getBase()
    {
        return this.base;
    }

    private double altura;
    private void setAltura(double a)
    {
        this.altura = a;
    }
    private double getAltura()
    {
        return this.altura;
    }

    public void exibirDados()
    {
        System.out.printf("\n\nBase: %.2f\n", getBase());
        System.out.printf("Altura: %.2f\n", getAltura());
        areaRetangulo();
        perimetroRetangulo();
        if(ehQuadrado())
            System.out.printf("É um quadrado!\n\n");
        else
            System.out.printf("Não é um quadrado!\n\n");
    }

    public void areaRetangulo()
    {
        System.out.printf("Área: %.2f\n", (this.base * this.altura));
    }

    public void perimetroRetangulo()
    {
        System.out.printf("Perímetro: %.2f\n", ((this.base + this.altura) * 2));
    }

    public boolean ehQuadrado()
    {
        if(this.base == this.altura)
            return true;
        else
            return false;
    }
}