package aula4.exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
