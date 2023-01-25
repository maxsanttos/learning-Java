package aula4.exercicios;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número => ");
        int X = sc.nextInt();
    
        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        

        sc.close();
    }
    
}