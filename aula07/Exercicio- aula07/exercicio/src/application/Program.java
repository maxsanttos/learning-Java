package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverte;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("whas is the dollar price? ");
        double dollar = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double real = sc.nextDouble();

        System.out.printf("Amount to be paid in reias = %.2f%n",CurrencyConverte.converter(dollar,real));

        sc.close();
    }
}
