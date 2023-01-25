package aula4.exercicios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de N => ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Informe o valor de X =>");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            }else{
                out += 1;
            }

        }
 
        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();

    }
}
