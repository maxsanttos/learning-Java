package aula4.exercicios;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Digite um número => ");
        int n = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        System.out.println(fat);

        sc.close();
    }
}
