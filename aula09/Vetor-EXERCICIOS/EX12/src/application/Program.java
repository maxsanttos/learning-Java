package application;

import java.util.Scanner;

import entities.Rent;

/**
 * Exercicio de fixação  - pensionato
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
           System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();          //Para limpar o buff 
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber] = new Rent(name,email); // apartir da posição do quarto é adcionado no vetor ex =  quarto 5 é adcionado na posição 5 do vetor

        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }
            
        }



        sc.close();
    }
}