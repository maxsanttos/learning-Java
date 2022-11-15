import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int alunos = sc.nextInt();

        String[] nomes = new String[alunos];
        double[] nota1 = new double[alunos];
        double[] nota2 = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Noata 1: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Noata 1: ");
            nota2[i] = sc.nextDouble();
        }
        System.out.println("Alunos aprovados:");

        double media = 0.0;

        for (int i=0; i<alunos; i++) {
	        media = (nota1[i] + nota2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
	    }

        sc.close();
    }
}
