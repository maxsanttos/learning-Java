package aula02.exercicio2;

import java.util.Scanner;

public class projeto12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.println("INFORME DOIS VALORES:");
        System.out.println("Informe A");
        A = sc.nextInt();
        System.out.println("Informe B");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplos!");
        }else{
            System.out.println("Não são Multiplos");
        }
        sc.close();

    }
}
