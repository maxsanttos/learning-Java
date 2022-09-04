package aula4.exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a senha => ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("SENHA INVALIDA!");
            System.out.print("Informe a senha => ");
            senha = sc.nextInt();
        }
        System.out.println("SENHA CORRETA!");
        System.out.println("FIM!");

        sc.close();
    }
}
