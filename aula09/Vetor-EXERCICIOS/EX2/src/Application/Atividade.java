package Application;

import java.util.Locale;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        
        //vetor
        double[] vect = new double[n];

        // alocando os valores dentro do vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.print("DIgite um numero: ");
            vect[i] = sc.nextDouble();
        }


        // imprimindo o vetor cm os valores
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            
            System.out.printf("%.1f ", vect[i]);
        }

        //soma todos os valores
        double som = 0.0;
        System.out.println();
        System.out.print("SOMA = ");
        for (int i = 0; i < vect.length; i++) {
            som += vect[i];
            
        }

        //variavel da media dos valores
        double media = som / n;
        System.out.printf("%.2f ", som);
        System.out.println();
        System.out.print("MEDIA = ");
        System.out.printf("%.2f%n",media);

        sc.close();
    }
}
