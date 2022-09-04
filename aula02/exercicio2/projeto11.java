package aula02.exercicio2;

import java.util.Scanner;

public class projeto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par!");
        }else{
            System.out.println("Impar!");
        }
        sc.close();
    }
}
