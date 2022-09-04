package aula02.exercicio1;

import java.util.Scanner;

public class projeto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("informe um numero: ");
        num1 =sc.nextInt();
        System.out.println("informe outro numero: ");
        num2 =sc.nextInt();

        soma = num1 + num2;
        System.out.printf("A soma dos valores %d + %d é %d %n", num1, num2, soma);
        sc.close();
    }   
}
