package aula03.exercicio3;

import java.util.Scanner;

public class projeto10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Informe um número => ");
        num = sc.nextInt();
        System.out.printf("O número informado foi: %d%n",num);
        if (num >= 0) {
            System.out.println("Positivo!");
        }else{
            System.out.println("Negativo!");
        }
        sc.close();
    }
}
