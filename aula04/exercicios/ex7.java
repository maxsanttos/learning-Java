package aula4.exercicios;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor de X: ");
            int x = sc.nextInt();
            System.out.print("Digite o valor de Y: ");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("Divisão Impossivel");
            }
            else{
                double div = (double) x/y;
                System.out.printf("%.1f%n",div);
            }
        }

        sc.close();
    }
}
