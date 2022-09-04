package aula02.exercicio1;

import java.util.Scanner;

public class projeto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1,s2,s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        
        System.out.printf("A primeira palavra é: %s%nA segunda é: %s%nE a terceira é: %s%n", s1,s2,s3);
        sc.close();
    }
}
