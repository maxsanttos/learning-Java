package application;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int p = sc.nextInt();

        String[] name = new String[p];
        int[] age = new int[p];
        double[] height = new double[p];

        for (int i = 0; i < height.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.err.print("Name: ");
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double soma = 0.0;
        int nmenores = 0;
        for (int i = 0; i < height.length; i++) {
            if (age[i] < 16) {
	            nmenores++;
	        }
            soma += height[i];
        }

        double avg = soma/p;
        double percentualMenores = ((double)nmenores / p) * 100.0;

        System.out.printf("Altura média: %.2f%n",avg);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentualMenores);

	    for(int i=0; i<p; i++) {
	        if (age[i] < 16) {
	        	System.out.printf("%s\n", name[i]);
	        }
	    }


        sc.close();
    }
}
