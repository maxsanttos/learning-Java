package application;

import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int num = sc.nextInt();


        // vetores
        int[] a = new int[num];
        int[] b = new int[num];
        int[] c = new int[num];
        
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
           
            System.out.print("=> ");
            a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
           
            System.out.print("=> ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
           
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i < b.length; i++) {
            System.out.printf("=> %d\n", c[i]);
            
        }
        
        sc.close();
    }
}
