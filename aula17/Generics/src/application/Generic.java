package application;

import java.util.Scanner;

import service.PrintService;

public class Generic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
        
        System.out.println("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Informe um valor: ");
            int value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}