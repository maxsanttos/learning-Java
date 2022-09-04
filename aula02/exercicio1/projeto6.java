package aula02.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class projeto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int id, horas;
        double valorhora, salario;

        System.out.println("Informe o id do funcionario: ");
        id = sc.nextInt();

        System.out.println("Horas trabalhadas");
        horas = sc.nextInt();

        System.out.println("Informa o valor da hora trabalha: ");
        valorhora = sc.nextDouble();

        salario = valorhora * horas;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f%n",salario);

        sc.close();

    }   
}
