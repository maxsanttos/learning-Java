package application;

import entities.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // lista de funcionario
        List<Funcionario> list = new ArrayList<>();

        UI.mostarMenu();
        System.out.print("Informe sua opção: ");
        int op = sc.nextInt();
        do {
            UI.clearScreen();
            switch (op){
                case 1:
                // Registrando os funcionarios
                    System.out.print("Informe a quantidade de funcionario a ser cadastrado: ");
                    int qtdFuncionario = sc.nextInt();
                    for (int i = 1; i <= qtdFuncionario; i++) {
                        System.out.println("Funcionario #" + i);
                        System.out.print("Informe o nome do Fucionario: ");
                        sc.nextLine();
                        String nome = sc.nextLine();
                        System.out.print("Informe o Salario: ");
                        double salary = sc.nextDouble();
                        System.out.print("Informe a quantidade de dependentes: ");
                        int qtdDependentes = sc.nextInt();

                        list.add(new Funcionario(nome.toUpperCase(),salary,qtdDependentes));
                    }
                   // Listando as informações do funcionario
                   UI.clearScreen();
                   System.out.println();
                   System.out.println("=============================================");
                   System.out.println("RELATORIO DOS FUNCIONARIOS:\n");
                   for (Funcionario funcionario: list) {
                       System.out.println(funcionario);
                   }
               // retornando ao menu inicial
                   UI.mostarMenu();
                   System.out.print("Informe sua opção: ");
                   op = sc.nextInt();
                    break;
                default:
                // caso o usuario digite uma opção invalida ele retornara ao menu inicial
                    UI.clearScreen();
                    System.out.println("OPCAO INVALIDA");
                    UI.mostarMenu();
                    System.out.print("Informe sua opção: ");
                    op = sc.nextInt();
                    break;
            }
        }while (op != 2);
        System.out.println("Saindo do Systema");
        sc.close();
    }
}
