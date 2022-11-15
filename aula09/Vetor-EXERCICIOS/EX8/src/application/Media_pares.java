package application;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quando elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        double somapares = 0.0;
        int numeroPares = 0;
      

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                somapares += vect[i];
                numeroPares++;
            }
        }
        if (numeroPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }else{
            double mediapares = somapares /numeroPares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }




        sc.close();
    }
}
