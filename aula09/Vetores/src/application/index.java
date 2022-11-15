package application;

import java.util.Locale;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe a altura: "+ i);
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVAREGE HEIGHT %.2f%n", avg);
        



        sc.close();
    }
}
