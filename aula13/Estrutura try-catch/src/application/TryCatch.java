package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * TryCatch
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            System.out.print("Informe a posicao: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("End of program");
        sc.close();
    }
}