public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int d, int m, int a)
    {
        setData(d, m, a);
    }

    public Data(int m, int a)
    {
        setData(1, m, a);
    }

    public Data(int a)
    {
        setData(1, 1, a);
    }

    public void setData(int d, int m, int a)
    {
        if(m > 0 && m <= 12)
            mes = m;
        else
        {
            mes = 1;
            System.out.println("Mês " + m + " inválido. Configurado mês = 1.");
        }
        ano = a;
        dia = checkDia(d, ano);
    }

    private int checkDia(int diaTeste, int a)
    {
        int diasMes[] = {0, 31 , 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if((diaTeste > 0 && diaTeste <= diasMes[mes]) || (bissexto(a) && diaTeste <= 29))
            return diaTeste;
        System.out.println("Dia " + diaTeste + " inválido. Configurado dia = 1");
        return 1;
    }

    public String toString()
    {
        return dia + "/" + mes + "/" + ano;
    }

    public int getData()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }

    private boolean bissexto(int a)
    {
        if(((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
            return true;
        else 
            return false;
    }
}