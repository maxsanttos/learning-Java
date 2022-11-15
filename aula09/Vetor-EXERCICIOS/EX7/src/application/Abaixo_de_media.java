package application;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_de_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] media = new double[n];

        for (int i = 0; i < media.length; i++) {
            System.out.print("Digite um numero: ");
            media[i] = sc.nextDouble();
        }

        double somavect = 0.0;

        for (int i = 0; i < media.length; i++) {
            somavect += media[i];
        }

        double avg = somavect /n;

        System.out.printf("Media do vetor %.3f%n", avg);
        System.out.print("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < media.length; i++) {
            if (media[i] < avg) {
                
                System.out.println(media[i]);
            }
        }


        sc.close();
    }
}
