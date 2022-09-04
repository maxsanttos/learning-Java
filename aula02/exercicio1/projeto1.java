package aula02.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class projeto1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c;
        char x;
        System.out.println("Informa um numero tipo float: ");
        c = sc.nextDouble();
        
        System.out.println("Informe um caracter: ");
        x = sc.next().charAt(0);

        System.out.printf("você digitou: %.2f  e o caracter informado = %s%n",c,x);
        sc.close();
    }
}
