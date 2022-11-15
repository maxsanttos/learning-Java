package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int player = sc.nextInt();
        for (int i = 1; i <= player ; i++) {
            System.out.println("Tax payer #"+ i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char individual = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            if (individual == 'i'){
                System.out.print("Anual income: ");
                double anualincome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name,anualincome,healthExpenditure));
            }else {
                System.out.print("Anual income: ");
                double anualincome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                list.add(new Company(name,anualincome,emp));
            }
        }
        double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        

        sc.close();
    }
}
