package application;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int num = sc.nextInt();

        int[] vect = new int[num];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i]= sc.nextInt();

        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i]  % 2 == 0) {
                System.out.printf("%d ",vect[i]);
            }
        }

        System.out.println();
        int somapar = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                somapar++;
            }
        }

        System.out.printf("QUANTIDADE DE PARES = %d%n",somapar);

        sc.close();
    }
}
