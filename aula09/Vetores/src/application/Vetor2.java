package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product6;

public class Vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Informe um número: ");
        int n = sc.nextInt();
        Product6[] vect = new Product6[n];
        
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Informe o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Informe o preço do produto: ");
            double price = sc.nextDouble();
            vect[i] = new Product6(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg =  sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n",avg);
        sc.close();
    }
    
}