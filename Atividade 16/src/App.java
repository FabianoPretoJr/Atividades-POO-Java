public class App {
    public static void main(String[] args) throws Exception {
        double mediaTurma = 8.2;

        String alunos[] = {"Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4", "Aluno 5", "Aluno 6", "Aluno 7", "Aluno 8", "Aluno 9"};
        
        double nota1DosAluno[] = {4, 5, 8, 4, 6, 9, 10, 7, 8.2};

        double nota2DosAluno[] = {8, 7, 5, 6, 7, 10, 1, 5, 8.2};

        double mediasAlunos[] = new double[alunos.length];

        for(int i = 0; i < alunos.length; i++)
        {
            double media = (nota1DosAluno[i] + nota2DosAluno[i]) / 2;   
            mediasAlunos[i] = media;         
        }

        System.out.printf("%11s %13s %9s %8s %9s\n\n", "Alunos", "Nota 1", "Nota 2", "Média", "Status");

        for(int i = 0; i < alunos.length; i++)
        {
            System.out.printf("#%d - %4s %9.1f %9.1f %9.1f\t", i, alunos[i], nota1DosAluno[i], nota2DosAluno[i], mediasAlunos[i]);
            if(mediasAlunos[i] > mediaTurma)
                System.out.print("Acima da média\n");
            else if(mediasAlunos[i] < mediaTurma)
                System.out.print("Abaixo da média\n");
            else
            System.out.print("Na média da turma\n");
        }
    }
}