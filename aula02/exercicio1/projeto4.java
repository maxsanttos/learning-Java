package aula02.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class projeto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double R, A, pi = 3.14159;


        R = sc.nextDouble();
        A = pi * R * R;

        System.out.printf("A = %.4f%n",A);


        sc.close();
    }
}
