package aula4.exercicios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("");
        System.out.println("[1. Alcool], [2. Gasolina], [3. Diesel],[4.Sair]");
        System.out.println("");
        System.out.print("Informe o tipo de produto => ");
        int tipo = sc.nextInt();
        while ( tipo != 4) {
            switch (tipo) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }
            System.out.println("");
            System.out.println("%n[1. Alcool], [2. gasolina], [3. diesel],[4.Sair]%n");
            System.out.println("");
            System.out.print("Informe o tipo de produto => ");
            tipo = sc.nextInt();


        }
        System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);


        sc.close();
    }
}
