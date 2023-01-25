import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // PEGANDO AS INFORMAÇÕES DO FUNCIONARIO
        System.out.println();
        System.out.print("NOME DO FUNCIONARIO: ");
        String nome = sc.nextLine();
        System.out.print("SALARIO: ");
        double salario = sc.nextDouble();
        System.out.print("INFORME A QUANTIDADE DE DEPENDENTES: ");
        int dependentes = sc.nextInt();
 
        double salariofamilia = dependentes * 134.98;
        double salariofinal = (dependentes * 0.03) * salario + salario;
        double salariorecebido = salariofamilia + salariofinal;

        // IMPRIMINDO AS INFORMAÇÕES
        System.out.println();
        System.out.println("=========================================");
        System.out.println("NOME DO FUNCIONARIO: " + nome);
        System.out.println("RESULTADO O SALARIO R$: " + String.format("%.2f",salario));
        System.out.println("QUANTIDADE DE DEPENDENTES: " + dependentes);
        System.out.println("TOTAL DO SALÁRIO FAMÍLIA R$: " + String.format("%.2f",salariofamilia));
        System.out.println("SALARIO FINAL R$: " + String.format("%.2f",salariofinal));
        System.out.println("SALARIO RECEBIDO R$: " + String.format("%.2f",salariorecebido ));
        System.out.println("=========================================");
        sc.close();
    }
}
